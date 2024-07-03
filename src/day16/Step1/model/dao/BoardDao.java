package day16.Step1.model.dao;

import day16.Step1.model.dto.BoardDto;
import day16.Step1.model.dto.MemberDto;
import day16.Step1.model.dto.ReplyDto;

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
            // String sql = "select *from board;";     //  1. sql 에 DB 조작어 작성
            String sql = "select *from board inner join member on board.mNo = member.mNo order by bDate desc";
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
                boardDto.setmId(rs.getString("mid"));

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
//            String sql2 = "update board set bView = bView + 1 where bNo = ?";     //  sql2에 클릭시 조회수 1 증가할 조작어 작성
            ps = connection.prepareStatement(sql);
//            PreparedStatement ps2 = connection.prepareStatement(sql2);
            ps.setInt(1,ch);                           // 1번째 ?에 ch 대입
//            ps2.setInt(1,ch);
//            ps2.executeUpdate();
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

            ps.setInt(1,bNo);       // 기재된 sql 의 ? 값에 매개변수 값 대입
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
        return false;                           //  예외 처리가 발견되었다면 false 반환
    }   // dUpdate 메소드 end

    //  9. 게시물 댓글 전체 출력 함수

    public ArrayList<ReplyDto> rPrint(int bNo){
        ArrayList<ReplyDto> list = new ArrayList<>();               //  댓글 내용을 담을 ArrayList 지정
        try{
            String sql =  "select *from reply inner join member on reply.mNo = member.mNo where reply.bNo = ?";       //  bNo 가 ? 인 댓글만을 출력
            ps = connection.prepareStatement(sql);                  //  sql 기재
            ps.setInt(1,bNo);                          //  1번째 ? 에 int 타입의 bNo 값 대입

            rs = ps.executeQuery();                                 //  출력(select)은 executeQuery() 사용
            while (rs.next()) {                                     //  rs.next()가 다음 레코드로 이동인데 레코드가 없을 때 false 를 반환하므로 레코드가 존재하지 않을 때까지 반복
                //  rs.get(필드 타입명) or (필드 번호명) 둘 다 가능
                ReplyDto replyDto = new ReplyDto(
                        rs.getString("rContent"),rs.getString(2),
                        rs.getInt(3), rs.getInt(4),rs.getInt(5)
                );
                replyDto.setmId(rs.getString(6));
                list.add(replyDto);         //  list 에 ReplyDto 로 생성된 replyDto 추가
            }

        } catch (Exception e){
            System.out.println(e);
        }
        return list;                        // 여러 개의 DTO 가 담긴 리스트를 반환

    }   //  rPrint 메소드 end

    //  10. 게시물 댓글 쓰기 함수
    public boolean rWrite(ReplyDto replyDto){
        try{
            String sql = "insert into reply(rContent, mNo, bNo) values(?, ?, ?)";       //  reply 테이블에 rContent, mNo, bNo 에 각각 ? ? ? 값을 insert
            ps = connection.prepareStatement(sql);
            ps.setString(1,replyDto.getrContent());                         //  1번째 ? 에 replyDto.getrContent() 로 가져온 String 타입의 값을 대입
            ps.setInt(2,replyDto.getmNo());                                 //  2번째 ? 에 replyDto.getmNo() 로 가져온 int 타입의 값을 대입
            ps.setInt(3,replyDto.getbNo());                                 //  3번째 ? 에 replyDto.getbNo() 로 가져온 int 타입의 값을 대입

            int count = ps.executeUpdate();     //  기재한 대로 업데이트
            if(count == 1){                     //  수정이 성공했다면 삭제한 줄의 count 1개가 출력될 것인데 만약 1개가 반환되었다면 true 반환
                return true;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return false;                           //  예외 처리가 발견되었다면 false 를 반환
    }   //  rWrite 메소드 end

    //  11. 조회수 증가 처리
    public boolean viewIncrease(int bno){
        try{
            String sql = "update board set bView = bView + 1 where bno = ?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1,bno);
            int count = ps.executeUpdate();
            if(count == 1){
                return true;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }   //  viewIncrease 메소드 end

    //  12. 제목 검색 함수
    public ArrayList<BoardDto> search(String title){
        ArrayList<BoardDto> list = new ArrayList<>();               //  arrayList 생성
        try{
            //  String sql = "select *from board where bTitle like '%제%';";                 //  가능
            //  String sql = "select *from board where bTitle like '%?%';";                 //  불가능, 파라미터 인식 불가능
            //  String sql = "select *from board where bTitle like ?;";                     //  가능은 하지만 "%"+ title+ "%"로 setString 을 해줘야함
            //  String sql = "select *from board where bTitle like '% " +title +" %';";     //  가능, 연결 연산자 사용하면
            //  String sql = "select *from board where bView like %?%";                     //  불가능, int 인식 X
            //  String sql = "select *from board where bView like %3%";                     //  불가능, int 인식 X
            String sql = "select *from board inner join member on board.mNo = member.mNo where bTitle like CONCAT('%', ?, '%')";        //  가능, sql 제공하는 CONCAT('문자열', '문자열', '문자열') 문자열 연결 함수
            ps = connection.prepareStatement(sql);
            ps.setString(1,title);
            //  ps.setString(1,"%"+ title+ "%");
            //  ps.setInt(1,3);
            rs = ps.executeQuery();
            while (rs.next()){
                BoardDto boardDto = new BoardDto(rs.getString("bTitle"),
                        rs.getString("bContent"),
                        rs.getString("bDate"),
                        rs.getInt("bView"),
                        rs.getInt("mNo"),
                        rs.getInt("bNo"));      // DTO 1개 만들고 바로 add
                boardDto.setmId(rs.getString("mid"));
                list.add(boardDto);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return list;
    }   //  search 메소드 end

}   //  BoardDao 클래스 end

