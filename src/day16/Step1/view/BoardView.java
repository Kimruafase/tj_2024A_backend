package day16.Step1.view;   // 패키지 day 16의 Step1 패키지 안에 view 패키지를 의미합니다.

import day16.Step1.controller.MemberController; //  패키지 day 16의 패키지 Step1에서 패키지 controller 안에 MemberController 클래스를 가져왔음을 의미합니다.
import day16.Step1.model.dto.MemberDto; // 패키지 day 16의 패키지 Step1에서 패키지 model 안에 dto 패키지에서 MemberDto 클래스를 가져왔음을 의미합니다.

import java.util.Scanner;   // 자바 유틸 중 Scanner 클래스를 사용하기 위해 가져와서 쓰겠다는 것을 의미합니다.

public class BoardView {    // public 으로 선언된 BoardView 클래스입니다.

        //  0.
        public static BoardView bView = new BoardView();    // public 으로 선언된 static 변수이며 BoardView 클래스에서 기본 생성자를 통해 생성되었습니다.
        public Scanner scan = new Scanner(System.in);   // public 으로 선언된 Scan 변수가 입력을 받기 위해 Scanner 클래스에서 생성자를 통해 생성되었습니다.

        //  1. 로그인 성공 시 초기 화면
        public void index2(){   //  public 으로 선언된 반환 타입이 없는 index2 메소드입니다.
            while (true){   //  while 문은 ()안에 조건이 false 일 때까지 반복하는데 ()안에 조건이 true 이므로 따로 break 를 걸지 않는 한 무한 루프를 돌게됩니다.
                System.out.println(" >> 1. 로그아웃 2. 회원 수정 3. 회원 탈퇴 4. 게시판 << "); // " >> 1. 로그아웃 2. 회원 수정 3. 회원 탈퇴 4. 게시판 << "를 출력하고 줄바꿈합니다.
                int ch = scan.nextInt();    //  scan 객체를 통해 참조된 nextInt 메소드 호출하여 입력받은 값을  int 타입의 ch 변수에 저장합니다.
                if(ch == 1){    //  만약 ch가 1이라면
                    logOut();   // logOut 메소드를 호출합니다.
                    return; // return 을 실핼합니다.
                } else if (ch == 2) {   // 만약 ch가 2라면
                    mUpdate();  // mUpdate 메소드를 호출합니다.
                } else if (ch == 3) {   // 만약 ch가 3라면
                    if(mDelete()){  // 만약 mDelete 메소드를 호출한 값이 true라면
                        logOut();   //  logOut 메소드를 호출합니다.
                        return; // return 을 실행합니다.
                    }   // if문 end
                } else if (ch == 4) {   // 만약 ch가 4라면
                    bPrint();   // bPrint 메소드를 출력합니다.
                }else { // 만약 ch가 그 이외의 입력값을 받았다면
                    System.out.println(" >> 없는 기능 번호입니다. << "); //  " >> 없는 기능 번호입니다. << "를 출력하고 줄바꿈합니다.
                } // if와 else end
            } // while 문 end
        }   // index2 메소드 종료


        //  1. 로그아웃 함수
        public void logOut(){   // public 으로 선언된 반환 타입이 없는 logOut 메소드입니다.
            //  회원 컨트롤러에 로그아웃 메소드 호출
            MemberController.mControl.logOut(); // MemberController 클래스에서 mControl static 변수를 통해 참조한 logOut 메소드를 호출합니다.
            System.out.println(" >> 로그아웃 성공 [초기 메뉴로 돌아갑니다] ");  // " >> 로그아웃 성공 [초기 메뉴로 돌아갑니다] "를 출력하고 줄바꿈합니다.
        }   //  logOut 메소드 종료
        //  2. 회원 수정 함수
        public void mUpdate(){  //  public 으로 선언된 반환 타입이 없는 mUpdate 메소드입니다.
            System.out.print(" >> 수정할 회원의 이름을 입력해주세요. ");   //  " >> 수정할 회원의 이름을 입력해주세요. "를 출력합니다.
            String name = scan.next();                                  //  scan 객체를 통해 참조된 next 메소드 호출하여 입력받은 값을  String 타입의 name 변수에 저장합니다.
            System.out.print(" >> 수정할 회원의 연락처를 입력해주세요. ");  //  " >> 수정할 회원의 연락처를 입력해주세요. "를 출력합니다.
            String phoneNum = scan.next();  //  scan 객체를 통해 참조된 next 메소드 호출하여 입력받은 값을  String 타입의 phoneNum 변수에 저장합니다.

            MemberDto mDto = new MemberDto();   //  MemberDto 클래스를 통해 mDto 지역변수가 MemberDto 기본 생성자를 통해 생성됩니다.
            mDto.setmName(name);    //  mDto 객체가 참조한 setmName() 메소드에서 매개변수 name 을  받아서 mDto 생성자에 저장합니다.
            mDto.setmPhone(phoneNum);   //  mDto 객체가 참조한 setmPhone() 메소드에서 매개변수 phoneNum 을  받아서 mDto 생성자에 저장합니다.

            boolean result = MemberController.mControl.mUpdate(mDto);   //  boolean 타입의 result 지역변수에 MemberController 클래스의 mControl static 변수를 통해 참조한 mUpdate 메소드에 매개변수 mDto 를 통해 반환된 값을 저장합니다.
            if(result){ // 만약 result 가 true 라면
                System.out.println(" >> 회원 정보 수정 성공 << ");  // " >> 회원 정보 수정 성공 << "를 출력하고 줄바꿈합니다.
                System.out.println("수정한 이름은 " + name + "입니다."); //  "수정한 이름은 " + 지역변수 name 에 저장된 값 + "입니다." 를 출력하고 줄바꿈합니다.
                System.out.println("수정한 전화번호는 " + phoneNum + "입니다.");   //  "수정한 이름은 " + 지역변수 phoneNum 에 저장된 값 + "입니다." 를 출력하고 줄바꿈합니다.
            }else{  //  만약 result 가 false 라면
                System.out.println(" >> 회원 정보 수정 실패 << ");  //  " >> 회원 정보 수정 실패 << "를 출력하고 줄바꿈합니다.
            } // if, else 문 end
        } // mUpdate 메소드 end
        //  3. 회원 탈퇴 함수
        public boolean mDelete(){   //  public 으로 선언된 반환 타입이 없는 mDelete 메소드입니다.
            System.out.println(" >> 정말 탈퇴하실 건가요? << "); //  " >> 정말 탈퇴하실 건가요? << "를 출력하고 줄바꿈합니다.
            System.out.print(" >> 비밀번호 : ");    //  " >> 비밀번호 : " 를 출력합니다.
            String pw = scan.next();    //  scan 객체를 통해 참조된 next 메소드 호출하여 입력받은 값을  String 타입의 pw 변수에 저장합니다.

            boolean result = MemberController.mControl.mDelete(pw); //  boolean 타입의 result 지역변수에 MemberController 클래스의 mControl static 변수를 통해 참조한 mDelete 메소드에 매개변수 mDto 를 통해 반환된 값을 저장합니다.
            if(result){ //  만약 result 가 true 라면
                System.out.println(" >> 탈퇴 성공 << ");    //  " >> 탈퇴 성공 << " 을 출력하고 줄바꿈 합니다.
                return true;    // true 를 반환합니다.
            }else{  //  만약 result 가 false 라면
                System.out.println(" >> 비밀번호 불일치 << "); //  " >> 비밀번호 불일치 << "를 출력하고 줄바꿈합니다.
                return false;   // false 를 반환합니다.
            }   // if, else 문 end

        }   //  mDelete 메소드 end
        //  4. 게시판(게시물 전체 출력) 함수
        public void bPrint(){   //  public 으로 선언된 반환 타입이 없는 bPrint 메소드입니다.

        }   // bPrint 메소드 종료
}   //  BoardView 클래스 종료
