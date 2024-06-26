package day15.Step3_MVC;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    //  외부 클래스로부터 내부 메소드를 사용할 수 있도록 만든 static 변수
    static View view = new View();
    Scanner scan = new Scanner(System.in);

    public void mainView(){

        while (true) {
            try {
                System.out.println(" ===== 메인 화면 ===== ");
                System.out.println(" >> 1. 등록 2. 출력 3. 수정 4. 삭제");
                int ch = scan.nextInt();
                if (ch == 1) {
                    signUpView();
                } else if (ch == 2) {
                    printView();
                } else if (ch == 3) {
                    updateView();
                } else if (ch == 4) {
                    deleteView();
                } else if (ch == 5) {
                    System.out.println(" >> 프로그램을 종료합니다. ");
                    break;
                } else {
                    System.out.println(" >> 없는 기능 번호입니다. ");
                }
            } catch (Exception e){
                System.out.println(" >> 잘못된 입력입니다. ");
                scan = new Scanner(System.in);
            }
        } // while end
    }   // mainView end
    //  1. 등록 페이지 함수
    public void signUpView(){
        System.out.println(" >> 등록 페이지 << ");
        //  1. 입력
        System.out.print(" >> [저장] 이름 : ");
        String name = scan.next();

        boolean result = Controller.con.signUpCon(name);
        if(result){
            System.out.println(" >> 등록 성공 ");
        }else{
            System.out.println(" >> 등록 실패 ");
        }
    }
    //  2. 출력 페이지 함수
    public void printView(){
        System.out.println(" >> 출력 페이지 << ");

        ArrayList<String> result = Controller.con.printCon();
        System.out.println(" ===== 이름 명단 ===== ");
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    //  3. 수정 페이지 함수
    public void updateView(){
        System.out.println(" >> 수정 페이지 << ");
        //  1. 입력
        System.out.print(" >> [수정] 기존 이름 : ");
        String oldName = scan.next();
        System.out.print(" >> [수정] 바꿀 이름 : ");
        String newName = scan.next();

        boolean result = Controller.con.updateCon(oldName,newName);
        if(result){
            System.out.println(" >> 수정 성공 ");
        }else{
            System.out.println(" >> 수정 실패 ");
        }
    }
    //  4. 삭제 페이지 함수
    public void deleteView(){
        System.out.println(" >> 삭제 페이지 << ");
        //  1. 입력
        System.out.print(" >> [삭제] 이름 : ");
        String name = scan.next();

        boolean result = Controller.con.deleteCon(name);
        if(result){
            System.out.println(" >> 삭제 성공 ");
        }else{
            System.out.println(" >> 삭제 실패 ");
        }
    }
}   // class end

