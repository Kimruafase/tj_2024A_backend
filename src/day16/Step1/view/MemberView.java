package day16.Step1.view;   // 패키지 day 16의 Step1 패키지 안에 view 패키지를 의미합니다.

import day16.Step1.controller.MemberController; //  패키지 day 16의 패키지 Step1에서 패키지 controller 안에 MemberController 클래스를 가져왔음을 의미합니다.
import day16.Step1.model.dto.MemberDto; // 패키지 day 16의 패키지 Step1에서 패키지 model 안에 dto 패키지에서 MemberDto 클래스를 가져왔음을 의미합니다.

import java.util.ArrayList; // 자바 유틸 중 ArrayList 를 사용하기 위해 가져와서 쓴다는 것을 의미합니다.
import java.util.InputMismatchException;    // 자바 유틸 중 InputMismatchException 예외가 발생하는 클래스를 가져와서 쓰겠다는 것을 의미합니다.
import java.util.Scanner;   // 자바 유틸 중 Scanner 클래스를 사용하기 위해 가져와서 쓰겠다는 것을 의미합니다.

public class MemberView {   //  public 으로 선언된 MemberView 클래스를 의미합니다.
    //  해당 클래스의 함수들을 다른 클래스에서 호출할 수 있도록 static 변수에 해당 객체를 생성
    //  - static 선언시점 : 프로그램 시작 시 , static 사라짐 / 초기화 시점  : 프로그램 종료 시
    //  - 메소드를 실행하기 위해서는 객체 필요. (static 메소드가 아닌 이상)
    //  - 멤버변수는 객체마다 할당, 메소드는 객체마다 실행을 하지만 코드는 공유
    //  - 전역 객체 -> 모든 곳에서 호출 가능한 객체 1개
    //  - 싱글톤 : 프로그램 내 전역으로 하나의 객체를 생성, 주로 전역에서 공유할 때 사용
    public static MemberView mView = new MemberView();  // public 으로 선언된 static 변수이며 MemberView 클래스에서 기본 생성자를 통해 생성되었습니다.
    //  입력 객체 멤버변수
    Scanner scan = new Scanner(System.in);  // Scan 변수가 입력을 받기 위해 Scanner 클래스에서 생성자를 통해 생성되었습니다.
    //  0. 초기화면 홤수
    public void index(){    // 반환 타입이 없는 public 으로 선언된 index 라는 이름의 메소드입니다.
        while (true){   // while 문은 ()안에 조건이 false 일 때까지 반복하는데 ()안에 조건이 true 이므로 따로 break 를 걸지 않는 한 무한 루프를 돌게됩니다.
            try {   // 예외가 발생할 것 같은 코드를 try{} 로 묶어서 검사합니다.
                System.out.println(" >> 1. 회원 가입 2. 로그인 3. 아이디 찾기 4. 비밀번호 찾기 << "); // " >> 1. 회원 가입 2. 로그인 3. 아이디 찾기 4. 비밀번호 찾기 << "를 출력하고 줄바꿈까지 처리해주는 코드입니다.
                int ch = scan.nextInt();    //  scan 객체를 통해 참조된 nextInt 메소드 호출하여 입력받은 값을  int ch 변수에 저장합니다.
                if(ch == 1){    //  만약 ch가 1이라면
                    signUp();   //  signUp 메소드를 호출합니다.
                } else if (ch == 2) {   // 만약 ch가 2라면
                    logIn();    //  logIn 메소드를 호출합니다.
                } else if (ch == 3) {   // 만약 ch가 3이라면
                    findId();   // findId 메소드를 호출합니다.
                } else if (ch == 4) {   // 만약 ch가 4라면
                    findPw();   //  findPw 메소드를 호출합니다.
                }else { // 만약 ch가 그 이외의 입력값을 받았다면
                    System.out.println(" >> 없는 기능 번호입니다. << "); // " >> 없는 기능 번호입니다. << "를 출력합니다.
                }
            } catch (InputMismatchException e){ //  InputMismatchException 클래스가 갖고 있는 예외 처리 정보를 잡았다면 e에 그 정보를 저장합니다.
                System.out.println(" >> 잘못된 입력이 있습니다. 초기 메뉴로 돌아갑니다. << ");  // 예외 처리가 되었다면 " >> 잘못된 입력이 있습니다. 초기 메뉴로 돌아갑니다. << "를 출력합니다.
                scan = new Scanner(System.in);  // 그리고 Scan 변수에 입력을 받기 위해 Scanner 클래스에서 생성자를 통해 다시 생성합니다.
            } // catch end
        } // while end
    } // index 메소드 end
    //  1. 회원가입 화면 함수
    public void signUp(){   // 반환 타입이 없는 public 으로 선언된
        //  1. 입력
        System.out.println(" >> 회원가입 << "); // " >> 회원가입 << " 을 출력하고 줄바꿈 처리를 합니다.
        System.out.print(" >> 아이디 : "); // " >> 아이디 : " 를 출력합니다.
        String id = scan.next();    // 문자열 id 지역변수에 scan 객체를 통해 참조한 메소드 next()를 호출해서 입력을 받아서 저장합니다.
        System.out.print(" >> 비밀번호 : ");    //  " >> 비밀번호 : "를 출력합니다.
        String pw = scan.next();    // 문자열 pw 지역변수에 scan 객체를 통해 참조한 메소드 next()를 호출해서 입력을 받아서 저장합니다.
        System.out.print(" >> 이름 : ");  //  " >> 이름 : " 을 출력합니다.
        String name = scan.next();  // 문자열 id 지역변수에 scan 객체를 통해 참조한 메소드 next()를 호출해서 입력을 받아서 저장합니다.
        System.out.print(" >> 연락처 : "); // " >> 연락처 : "을 출력합니다.
        String phoneNum = scan.next();  // 문자열 id 지역변수에 scan 객체를 통해 참조한 메소드 next()를 호출해서 입력을 받아서 저장합니다.

        //  2. 유효성 검사

        //  3. 객체화
        MemberDto mDto = new MemberDto(id,pw,name,phoneNum);    //  MemberDto 클래스를 통해 지역변수 mDto 가 MemberDto 생성자를 통해 생성되는데 매개변수를 id,pw,name,phoneNum 를 받아서 생성합니다.

        boolean result = MemberController.mControl.signUp(mDto);    // boolean 타입의 result 지역변수에 MemberController 클래스의 mControl 스태틱 변수를 통해 참조한 signUp 메소드에 매개변수 mDto 를 통해 반환된 값을 저장합니다.
        if(result){ // 만약 result 가 true 라면
            System.out.println(" >> 회원가입 성공 <<");   // " >> 회원가입 성공 <<" 을 출력하고 줄바꿈합니다.
        }else{  // 만약 result 가 false 라면
            System.out.println(" >> 회원가입 실패 <<");   //  " >> 회원가입 실패 <<" 을 출력하고 줄바꿈합니다.
        } // if와 else 조건문 end

    }   // signUp 메소드 end
    //  2. 로그인 함수
    public void logIn(){    // public 으로 선언된 반환 타입이 없는 logIn 메소드입니다.
        System.out.print(" >> 아이디 : "); // " >> 아이디 : "를 출력합니다.
        String id = scan.next();    //  문자열 id 지역변수에 scan 객체를 통해 참조한 메소드 next()를 호출해서 입력을 받아서 저장합니다.
        System.out.print(" >> 비밀번호 : ");    //  " >> 비밀번호 : "를 출력합니다.
        String pw = scan.next();    //  문자열 pw 지역변수에 scan 객체를 통해 참조한 메소드 next()를 호출해서 입력을 받아서 저장합니다.

        MemberDto mDto = new MemberDto();   //  MemberDto 클래스를 통해 mDto 지역변수가 MemberDto 기본 생성자를 통해 생성됩니다.
        mDto.setmId(id);    //  mDto 객체가 참조한 setmId() 메소드에서 매개변수 id를 받아서 mDto 생성자에 저장합니다.
        mDto.setmPw(pw);    //  mDto 객체가 참조한 setmPw() 메소드에서 매개변수 pw를 받아서 mDto 생성자에 저장합니다.
        boolean result = MemberController.mControl.logIn(mDto); //  boolean 타입의 result 지역변수에 MemberController 클래스의 mControl static 변수를 통해 참조한 logIn 메소드에 매개변수 mDto 를 통해 반환된 값을 저장합니다.
        System.out.println(result); // result 에 저장된 값을 출력합니다.
        if(result){ // 만약 result 가 true 라면
            System.out.println(" >> 로그인 성공 << "); // " >> 로그인 성공 << "을 출력하고 줄바꿈합니다.
            //  로그인 성공 시 로그인 된 메뉴로 이동
            BoardView.bView.index2();   // BoardView 클래스에서 bView static 객체를 통해 참조한 index2 메소드를 호출합니다.
        }else{  // 만약 result 가 false 라면
            System.out.println(" >> 로그인 실패 << ");   // " >> 로그인 실패 << "을 출력하고 줄바꿈합니다.
        }   // if와 else 조건문 end
    }   // logIn 메소드 end
    //  3. 아이디 찾기 화면 함수
    public void findId(){   // public 으로 선언된 반환 타입이 없는 findId 메소드입니다.
        System.out.print(" >> 이름 : ");  //  " >> 이름 : " 을 출력합니다.
        String name = scan.next();  // 문자열 id 지역변수에 scan 객체를 통해 참조한 메소드 next()를 호출해서 입력을 받아서 저장합니다.
        System.out.print(" >> 연락처 : "); // " >> 연락처 : "을 출력합니다.
        String phoneNum = scan.next();  // 문자열 id 지역변수에 scan 객체를 통해 참조한 메소드 next()를 호출해서 입력을 받아서 저장합니다.

        MemberDto mDto = new MemberDto(name, phoneNum); //  MemberDto 클래스를 통해 지역변수 mDto 가 MemberDto 생성자를 통해 생성되는데 매개변수를 name,phoneNum 를 받아서 생성합니다.

        ArrayList<String> list = MemberController.mControl.findId(mDto); // String 타입의 자료형을 저장하는 ArrayList 의 list 지역변수에 MemberController 클래스의 mControl 스태틱 변수를 통해 참조한 findId 메소드에 매개변수 mDto 를 통해 반환된 값을 저장합니다.
        if(list.isEmpty()){ // 만약 list 에 저장된 자료형이 아무것도 없다면
            System.out.println(" >> 회원 정보가 없습니다."); // " >> 회원 정보가 없습니다."를 출력합니다.
        }else{  // 만약 list 에 저장된 자료형이 1개 이상이 있다면
            for (int i = 0; i < list.size(); i++) { // for 반복문 을 통해서 list 의 size()를 통해 반환된 list 의 길이만큼 반복합니다.
                System.out.println(" >> 아이디는 [" + list.get(i) + "]입니다. ");  // " >> 아이디는 [" + list.get(i) + "]입니다. " list 의 i번째 값을 반환해서 "아이디는 list 의 i번째 값입니다" 를 i번 출력합니다.
            } // for 반복문 end
        } // if 와 else 조건문 end
    }   // findId 메소드 end
    //  4. 비밀번호 찾기 화면 함수
    public void findPw(){   //  public 으로 선언된 반환 타입이 없는 findPw 메소드입니다.
        System.out.print(" >> 아이디 : "); // " >> 아이디 : "를 출력합니다.
        String id = scan.next();    //  문자열 id 지역변수에 scan 객체를 통해 참조한 메소드 next()를 호출해서 입력을 받아서 저장합니다.
        System.out.print(" >> 연락처 : "); // " >> 연락처 : "을 출력합니다.
        String phoneNum = scan.next();  // 문자열 id 지역변수에 scan 객체를 통해 참조한 메소드 next()를 호출해서 입력을 받아서 저장합니다.

        MemberDto mDto = new MemberDto();   //  MemberDto 클래스를 통해 mDto 지역변수가 MemberDto 기본 생성자를 통해 생성됩니다.
        mDto.setmId(id);    //  mDto 객체가 참조한 setmId() 메소드에서 매개변수 id를 받아서 mDto 생성자에 저장합니다.
        mDto.setmPhone(phoneNum);   //  mDto 객체가 참조한 setmPhone() 메소드에서 매개변수 phoneNum 를 받아서 mDto 생성자에 저장합니다.
        ArrayList<String> list = MemberController.mControl.findPw(mDto);    // String 타입의 자료형을 저장하는 ArrayList 의 list 지역변수에 MemberController 클래스의 mControl 스태틱 변수를 통해 참조한 findPw 메소드에 매개변수 mDto 를 통해 반환된 값을 저장합니다.
        if(list.isEmpty()){ //  만약 list 에 저장된 자료형이 아무것도 없다면
            System.out.println(" >> 회원 정보가 없습니다. ");    // " >> 회원 정보가 없습니다."를 출력합니다.
        }else{  // 만약 list 에 저장된 자료형이 1개 이상이 있다면
            for (int i = 0; i < list.size(); i++) { // for 반복문 을 통해서 list 의 size()를 통해 반환된 list 의 길이만큼 반복합니다.
                System.out.println(" >> 비밀번호는 [" + list.get(i) + "]입니다.");  // " >> 비밀번호는 [" + list.get(i) + "]입니다. " list 의 i번째 값을 반환해서 "비밀번호는 list 의 i번째 값입니다" 를 i번 출력합니다.
            }   // for 반복문 end
        }   // if 와 else 조건문 end
    }   // findPw 메소드 end
}   // MemberView 클래스 end
