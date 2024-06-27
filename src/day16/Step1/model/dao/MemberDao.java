package day16.Step1.model.dao;

import day16.Step1.model.dto.MemberDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDao {
    //  해당 클래스의 함수들을 다른 클래스에서 호출할 수 있도록 static 변수에 해당 객체를 생성
    public static MemberDao mDao = new MemberDao();

    //  0. DB 연동
        //  JDBC 인터페이스 3개
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

        //  생성자에 연동 코드
    MemberDao(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day06", "root", "1234");
        }catch (Exception e){
            System.out.println(" >> 연동 실패 << " + e);
        }
    }

    //  1. 회원가입 화면 함수
    public boolean signUp(MemberDto mDto){
        try {
            //  1. SQL 작성
            String sql = "insert into member(mId, mPwd, mName, mPhone) values(?, ?, ?, ?)";

            //  2. SQL 기재
            ps = conn.prepareStatement(sql);

            //  2-1. SQL 문법의 ?(와일드카드) 매개변수 기재
            ps.setString(1, mDto.getmId());        // .setString(? 순서번호, 값 or 매개변수)
            ps.setString(2, mDto.getmPw());
            ps.setString(3, mDto.getmName());
            ps.setString(4, mDto.getmPhone());

            //  3. SQL 실행 & 4. SQL 실행 결과
            int count = ps.executeUpdate();         // executeUpdate(); 등록된 레코드 수 반환, 1개의 레코드 등록하면 1 반환
            if(count == 1){
                return true; // 성공했다는 의미를 부여한 결과를 전달
            }

        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }
    //  2. 로그인 함수
    public boolean logIn(MemberDto mDto){
        try{
            String sql = "select *from member where mId = ? and mPwd = ?";
            ps = conn.prepareStatement(sql);

            ps.setString(1,mDto.getmId());
            ps.setString(2,mDto.getmPw());

            rs = ps.executeQuery();
            //  로그인 성공 시 레코드 1개, 실패 시 레코드 0개
            boolean result = rs.next();
            return result;

        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }
    //  3. 아이디 찾기 화면 함수
    public ArrayList<String> findId(MemberDto mDto){
        ArrayList<String> list = new ArrayList<>();
        try{
            String sql = "select *from member where mName = ? and mPhone = ?";
            ps = conn.prepareStatement(sql);

            ps.setString(1,mDto.getmName());
            ps.setString(2,mDto.getmPhone());

            rs = ps.executeQuery();
            while (rs.next()){
                list.add(rs.getString("mId"));
            }

        }catch (Exception e){
            System.out.println(e);
        }
        return list;
    }
    //  4. 비밀번호 찾기 화면 함수
    public ArrayList<String> findPw(MemberDto mDto){
        ArrayList<String> list = new ArrayList<>();
        try{
            String sql = "select *from member where mId = ? and mPhone = ?";
            ps = conn.prepareStatement(sql);

            ps.setString(1,mDto.getmId());
            ps.setString(2,mDto.getmPhone());

            rs = ps.executeQuery();
            while (rs.next()){
                list.add(rs.getString("mPwd"));
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return list;
    }
}
