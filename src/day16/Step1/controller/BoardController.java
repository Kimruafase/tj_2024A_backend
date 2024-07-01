package day16.Step1.controller;

import day16.Step1.model.dao.BoardDao;
import day16.Step1.model.dto.BoardDto;
import day16.Step1.model.dto.MemberDto;

import java.util.ArrayList;

public class BoardController {

    //  ============= 싱글톤 만들기 ============= //
    //  싱글톤 : 프로그램 내 해당 클래스가 하나의 객채만을 갖는 패턴
        //  1. static 변수에 해당 클래스의 객체 생성해서 대입, private 사용
    private static BoardController boardController = new BoardController();
        //  2. 해당 클래스의 생성자를 private 으로 만든다. 다른 클래스에서 new 사용 막음
    private BoardController(){}
        //  3. 해당 객체(싱글톤)를 외부로 부터 접근할 수 있도록 간접(추후에 유효성 검사 가능) 호출 메소드
    public static BoardController getInstance(){
        //  ---- 유효성 검사 가능 ----    //
        return boardController;
    }

    //  4. 게시판(게시물 전체 출력) 함수
    public ArrayList<BoardDto> bPrint(){   //  public 으로 선언된 반환 타입이 없는 bPrint 메소드입니다.
        return BoardDao.getInstance().bPrint();     // DAO 에게 전체 게시물 조회 요청 후 바로 반환
    }   // bPrint 메소드 종료

    //  5. 게시물 쓰기 함수
    public boolean bWrite(BoardDto boardDto){
        boardDto.setmNo(MemberController.mControl.loginMno);    // 매개변수로 전달 받은 boardDto 에 추가로 글 작성자 번호를 넣기 위해 로그인된 회원번호를 대입
        return BoardDao.getInstance().bWrite(boardDto);         // DAO 에 전달 받은 boardDto 를 전달하고 결과를 boolean 값으로 받음
    }   //  bWrite 메소드 end

    //  6. 게시물 개별조회 함수
    public BoardDto bView(int ch){
       return BoardDao.getInstance().bView(ch); // DAO 에게 특정 게시물 조회 요청 후 바로 반환
    }   //  bView 메소드 end

    //  7. 게시물 삭제 함수
    public boolean bDelete(int bNo){
        int mNo = MemberController.mControl.loginMno;
        return BoardDao.getInstance().bDelete(bNo,mNo);
    }

    //  8. 게시물 수정 함수
    public boolean dUpdate(BoardDto boardDto){
        boardDto.setmNo(MemberController.mControl.loginMno);
        return BoardDao.getInstance().dUpdate(boardDto);
    }   // dUpdate 메소드 end
}
