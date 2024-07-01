package day16.Step1.model.dao;

import day16.Step1.model.dto.BoardDto;
import day16.Step1.model.dto.MemberDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BoardDao {
    //  ============= 싱글톤 만들기 ============= //
    //  싱글톤 : 프로그램 내 해당 클래스가 하나의 객채만을 갖는 패턴
    private static BoardDao boardDao = new BoardDao();  //  1. static 변수에 해당 클래스의 객체 생성해서 대입, private 사용
    private BoardDao(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day06","root","1234");
        } catch (Exception e){
            System.out.println(e);
        }

    }    //  2. 해당 클래스의 생성자를 private 으로 만든다. 다른 클래스에서 new 사용 막음
    public static BoardDao getInstance(){   //  3. 해당 객체(싱글톤)를 외부로 부터 접근할 수 있도록 간접(추후에 유효성 검사 가능) 호출 메소드
        return boardDao;
    }
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    //  4. 게시판(게시물 전체 출력) 함수    : 매개변수 X , 리턴 값 : 여러 개 게시물 -> 여러 개의 레코드 -> 여러 개의 DTO
    public ArrayList<BoardDto> bPrint(){   //  public 으로 선언된 반환 타입이 없는 bPrint 메소드입니다.
        ArrayList<BoardDto> list = new ArrayList<>();
        try{    // 0. 예외처리
            String sql = "select *from board;";     //  1. sql 에 DB 조작어 작성
            ps = connection.prepareStatement(sql);  //  2. sql 기재
            rs = ps.executeQuery();                 //  3. 기재된 sql 실행
            while (rs.next()){                      //  4. 결과 레코드 전체를 한 줄씩 순회하기
                //  rs.next() : 다음 레코드 이동, 다음 레코드가 있다면 true, 없다면 false
                //  레코드 1개 -> DTO 1개
                String bTitle = rs.getString("bTitle");     // rs.getString("필드명") : 현재 레코드의 해당 필드값 호출
                String bContent = rs.getString("bContent");
                String bDate = rs.getString("bDate");
                int bView = rs.getInt("bView");
                int mNo = rs.getInt("mNo");
                int bNo = rs.getInt("bNo");

                BoardDto boardDto = new BoardDto(bTitle,bContent,bDate,bView,mNo,bNo);  // DTO 1개 만들기

                list.add(boardDto);     // list 에 boardDto 추가

            }   // while end
        } catch (Exception e){
            System.out.println(e);

        }   //  try and catch end

        return list;    //  5. 여러 개의 DTO 가 담긴 리스트를 반환

    }   // bPrint 메소드 종료

    //  5. 게시물 쓰기 함수
    public boolean bWrite(BoardDto boardDto){
        try {
            String sql = "insert into board(bTitle, bContent, mNo) values(?, ?, ?)";    //  sql 작성 (insert 조작어 이용)
            ps = connection.prepareStatement(sql);                   // sql 기재
            ps.setString(1,boardDto.getbTitle());       //
            ps.setString(2,boardDto.getbContent());
            ps.setInt(3,boardDto.getmNo());

            int count = ps.executeUpdate();         //  int 타입을 반환하는데 1개의 글만 쓰므로 row count 1 반환
            if(count == 1){                         //  만약 ps.executeUpdate(); 가 1을 반환했다면 true 반환 아니면 false 반환
                return true;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }   //  bWrite 메소드 end

    //  6. 게시물 개별조회 함수
    public BoardDto bView(int ch){
        try{
            String sql = "select *from board where bno = ?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1,ch);                           // 1번째 ?에 ch 대입

            rs = ps.executeQuery();
            if(rs.next()) {                                        // 레코드 1줄만 개별 출력하기에 while 문 사용할 필요가 없다.
                // rs.getString("필드명") : 현재 레코드의 해당 필드값 호출
                return new BoardDto(rs.getString("bTitle"),
                        rs.getString("bContent"),
                        rs.getString("bDate"),
                        rs.getInt("bView"),
                        rs.getInt("mNo"),
                        rs.getInt("bNo"));  // DTO 1개 만들고 바로 반환
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return null;    // 예외가 발생했다면 null 을 반환

    }   //  bView 메소드 end

    //  7. 게시물 삭제 함수
    public boolean bDelete(int bNo, int mNo){
        try{
            String sql = "delete from board where bno = ? and mno = ?";
            ps = connection.prepareStatement(sql);

            ps.setInt(1,bNo);   // 기재된 sql 의 ? 값에 매개변수 값 대입
            ps.setInt(2,mNo);

            int count = ps.executeUpdate();     //  기재한 대로 업데이트
            if(count == 1) {                    //  삭제가 성공했다면 삭제한 줄 count 1개가 출력될 것인데 만약 1개가 반환되었다면 true 반환
                return true;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }

    //  8. 게시물 수정 함수
    public boolean dUpdate(BoardDto boardDto){
        try {
            String sql = "update board set bTitle = ?, bContent = ? where bNo = ? and mNo = ?";
            ps = connection.prepareStatement(sql);

            ps.setString(1,boardDto.getbTitle());       // 기재된 sql 의 ? 값에 매개변수 값 대입
            ps.setString(2,boardDto.getbContent());
            ps.setInt(3,boardDto.getbNo());
            ps.setInt(4,boardDto.getmNo());

            int count = ps.executeUpdate();     //  기재한 대로 업데이트
            if(count == 1){                     //  수정이 성공했다면 삭제한 줄의 count 1개가 출력될 것인데 만약 1개가 반환되었다면 true 반환
                return true;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }   // dUpdate 메소드 end

}   //  BoardDao 클래스 end

