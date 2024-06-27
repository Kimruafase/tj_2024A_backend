package day16.Step1.view;

import day16.Step1.controller.MemberController;
import day16.Step1.model.dto.MemberDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MemberView {
    //  해당 클래스의 함수들을 다른 클래스에서 호출할 수 있도록 static 변수에 해당 객체를 생성
    public static MemberView mView = new MemberView();
    //  입력 객체 멤버변수
    Scanner scan = new Scanner(System.in);
    //  0. 초기화면 홤수
    public void index(){
        while (true){
            try {
                System.out.println(" >> 1. 회원 가입 2. 로그인 3. 아이디 찾기 4. 비밀번호 찾기 << ");
                int ch = scan.nextInt();
                if(ch == 1){
                    signUp();
                } else if (ch == 2) {
                    logIn();
                } else if (ch == 3) {
                    findId();
                } else if (ch == 4) {
                    findPw();
                }else {
                    System.out.println(" >> 없는 기능 번호입니다. << ");
                }
            } catch (InputMismatchException e){
                System.out.println(" >> 잘못된 입력이 있습니다. 초기 메뉴로 돌아갑니다. << ");
                scan = new Scanner(System.in);
            }
        }
    }
    //  1. 회원가입 화면 함수
    public void signUp(){
        //  1. 입력
        System.out.println(" >> 회원가입 << ");
        System.out.print(" >> 아이디 : ");
        String id = scan.next();
        System.out.print(" >> 비밀번호 : ");
        String pw = scan.next();
        System.out.print(" >> 이름 : ");
        String name = scan.next();
        System.out.print(" >> 연락처 : ");
        String phoneNum = scan.next();

        //  2. 유효성 검사

        //  3. 객체화
        MemberDto mDto = new MemberDto(id,pw,name,phoneNum);

        boolean result = MemberController.mControl.signUp(mDto);
        if(result){
            System.out.println(" >> 회원가입 성공 <<");
        }else{
            System.out.println(" >> 회원가입 실패 <<");
        }

    }
    //  2. 로그인 함수
    public void logIn(){
        System.out.print(" >> 아이디 : ");
        String id = scan.next();
        System.out.print(" >> 비밀번호 : ");
        String pw = scan.next();

        MemberDto mDto = new MemberDto();
        mDto.setmId(id);
        mDto.setmPw(pw);
        boolean result = MemberController.mControl.logIn(mDto);
        if(result){
            System.out.println(" >> 로그인 성공 << ");
        }else{
            System.out.println(" >> 로그인 실패 << ");
        }
    }
    //  3. 아이디 찾기 화면 함수
    public void findId(){
        System.out.print(" >> 이름 : ");
        String name = scan.next();
        System.out.print(" >> 연락처 : ");
        String phoneNum = scan.next();

        MemberDto mDto = new MemberDto(name, phoneNum);

        ArrayList<String> list = MemberController.mControl.findId(mDto);
        if(list.isEmpty()){
            System.out.println(" >> 회원 정보가 없습니다.");
        }else{
            for (int i = 0; i < list.size(); i++) {
                System.out.println(" >> 아이디는 [" + list.get(i) + "]입니다. ");
            }
        }
    }
    //  4. 비밀번호 찾기 화면 함수
    public void findPw(){
        System.out.print(" >> 아이디 : ");
        String id = scan.next();
        System.out.print(" >> 연락처 : ");
        String phoneNum = scan.next();

        MemberDto mDto = new MemberDto();
        mDto.setmId(id);
        mDto.setmPhone(phoneNum);
        ArrayList<String> list = MemberController.mControl.findPw(mDto);
        if(list.isEmpty()){
            System.out.println(" >> 회원 정보가 없습니다. ");
        }else{
            for (int i = 0; i < list.size(); i++) {
                System.out.println(" >> 비밀번호는 [" + list.get(i) + "]입니다.");
            }
        }
    }
}
