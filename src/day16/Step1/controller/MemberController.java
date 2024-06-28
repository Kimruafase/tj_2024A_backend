package day16.Step1.controller; //  패키지 day 16의 Step1 패키지 안에 controller 패키지를 의미합니다.

import day16.Step1.model.dao.MemberDao; //  패키지 day 16의 패키지 Step1에서 패키지 model 안에 dao 패키지에서 MemberDao 클래스를 가져왔음을 의미합니다.
import day16.Step1.model.dto.MemberDto; //  패키지 day 16의 패키지 Step1에서 패키지 model 안에 dto 패키지에서 MemberDto 클래스를 가져왔음을 의미합니다.

import java.util.ArrayList; // 자바 유틸 중 ArrayList 를 사용하기 위해 가져와서 쓴다는 것을 의미합니다.

public class MemberController { // public 으로 선언된 MemberController 클래스입니다.
    //  해당 클래스의 함수들을 다른 클래스에서 호출할 수 있도록 static 변수에 해당 객체를 생성
    public static MemberController mControl = new MemberController();   //  public 으로 선언된 static 변수이며 MemberController 클래스에서 기본 생성자를 통해 생성되었습니다.

    //  1. 회원가입 화면 함수, 매개변수 : MemberDto( mId -> String, mPw -> String, mName -> String, mPhoneNum -> String)
    public boolean signUp(MemberDto mDto){  // public 으로 선언된 boolean 타입을 반환하는 signUp 메소드입니다. 매개변수로 MemberDto 타입의 mDto 를 받습니다.
        boolean result = MemberDao.mDao.signUp(mDto);   //  boolean 타입의 result 지역변수에 MemberDao 클래스에서 mDao static 객체를 통해 호출한 signUp 메소드에서 매개변수 mDto 대입 후 반환된 값을 저장합니다.
        return result;  // result 에 저장된 값을 반환합니다.
    }   //  signUp 메소드 end

    //  2-1. 로그인 성공한 회원의 번호 저장하는 멤버변수
        //  글 쓰기, 댓글 쓰기 등의 서비스를 이용할 때 현재 로그인한 회원을 식별하기 위해서
        //  초기값 = 0 -> 비로그인 상태, 1 -> 로그인 된 상태(로그인한 회원 번호)
    public int loginMno = 0;    //  로그인한 회원 번호를 임시저장하기 위해 public 으로 선언된 int 타입의 지역변수입니다.

    //  2-2. 로그아웃 함수
    public void logOut(){   //  public 으로 선언된 반환타입이 없는 logOut 메소드 입니다.
        loginMno = 0;   // loginMno 지역변수에 0을 저장합니다.
    }   //  logOut 메소드 end

    //  2. 로그인 함수
    public boolean logIn(MemberDto mDto){   //  public 으로 선언된 boolean 타입을 반환하는 logIn 메소드입니다. 매개변수로 MemberDto 타입의 mDto 를 받습니다.
        int result = MemberDao.mDao.logIn(mDto);    // int 타입의 result 지역변수에 MemberDao 클래스에서 mDao static 객체를 통해 호출한 logIn 메소드에서 매개변수 mDto 대입 후 반환된 값을 저장합니다.
        System.out.println(result); //  result 에 저장된 값을 출력합니다.
        if(result != 0){    // 만약 result 에 저장된 값이 0이 아니라면
            loginMno = result;  // result 에 저장된 값을 loginMno 에 저장합니다.
            return true;    //  true 를 반환합니다.
        }else { //  만약 result 에 저장된 값이 0이라면
            loginMno = 0;   //  loginMno 에 0을 저장합니다.
        }   //  if, else 문 end
      return false; //  if 문이 실행되지 않고 else 문이 실행되었다면 false 값을 반환합니다.
    }   //  logIn 메소드 end
    //  3. 아이디 찾기 화면 함수
    public ArrayList<String> findId(MemberDto mDto){    //  public 으로 선언된 ArrayList<String> 타입을 반환하는 findId 메소드입니다. 매개변수로 MemberDto 타입의 mDto 를 받습니다.
        ArrayList<String> result = MemberDao.mDao.findId(mDto); //  ArrayList<String> 타입의 result 변수에 MemberDao 클래스에서 mDao static 객체를 통해 호출한 findId 메소드에서 매개변수 mDto 대입 후 반환된 값을 저장합니다.
        return result;  // result에 저장된 ArrayList<String> 를 반환합니다.
    }   //  findId 메소드 end
    //  4. 비밀번호 찾기 화면 함수
    public ArrayList<String> findPw(MemberDto mDto){    //  public 으로 선언된 ArrayList<String> 타입을 반환하는 findPw 메소드입니다. 매개변수로 MemberDto 타입의 mDto 를 받습니다.
        ArrayList<String> result = MemberDao.mDao.findPw(mDto); //  ArrayList<String> 타입의 result 변수에 MemberDao 클래스에서 mDao static 객체를 통해 호출한 findPw 메소드에서 매개변수 mDto 대입 후 반환된 값을 저장합니다.
        return result;  // result에 저장된 ArrayList<String> 를 반환합니다.
    }   //  findPw 메소드 end

    //  5. 회원 탈퇴 함수
    public boolean mDelete(String pw){  //  public 으로 선언된 boolean 타입을 반환하는 mDelete 메소드입니다. 매개변수로 String 타입의 pw 를 받습니다.
        return MemberDao.mDao.mDelete(pw, loginMno);    // MemberDao 클래스에서 mDao static 객체를 통해 호출한 mDelete 메소드에서 매개변수 pw, loginMno 대입 후 반환된 값을 다시 반환합니다.
    }   //  mDelete 메소드 end

    //  6. 회원 수정 함수
    public boolean mUpdate(MemberDto mDto){ //  public 으로 선언된 boolean 타입을 반환하는 mUpdate 메소드입니다. 매개변수로 MemberDto 타입의 mDto 를 받습니다.
        return MemberDao.mDao.mUpdate(mDto, loginMno);  // MemberDao 클래스에서 mDao static 객체를 통해 호출한 mDelete 메소드에서 매개변수 mDto, loginMno 대입 후 반환된 값을 다시 반환합니다.
    }   //  mUpdate 메소드 end
}
