package day16.Step1.controller;

import day16.Step1.model.dao.MemberDao;
import day16.Step1.model.dto.MemberDto;

import java.util.ArrayList;

public class MemberController {
    //  해당 클래스의 함수들을 다른 클래스에서 호출할 수 있도록 static 변수에 해당 객체를 생성
    public static MemberController mControl = new MemberController();

    //  1. 회원가입 화면 함수, 매개변수 : MemberDto( mId -> String, mPw -> String, mName -> String, mPhoneNum -> String)
    public boolean signUp(MemberDto mDto){
        boolean result = MemberDao.mDao.signUp(mDto);
        return result;
    }
    //  2. 로그인 함수
    public boolean logIn(MemberDto mDto){
        boolean result = MemberDao.mDao.logIn(mDto);
        return result;
    }
    //  3. 아이디 찾기 화면 함수
    public ArrayList<String> findId(MemberDto mDto){
        ArrayList<String> result = MemberDao.mDao.findId(mDto);
        return result;
    }
    //  4. 비밀번호 찾기 화면 함수
    public ArrayList<String> findPw(MemberDto mDto){
        ArrayList<String> result = MemberDao.mDao.findPw(mDto);
        return result;
    }
}
