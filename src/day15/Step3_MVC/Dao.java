package day15.Step3_MVC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Dao {
    static Dao dao = new Dao();
    //  1. 멤버변수
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    //  2. 생성자
    Dao(){  // 연동 코드
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day05", "root","1234");
            System.out.println(" >> 연동 성공 ");
        }catch (Exception e){
            System.out.println(" >> 연동 실패 \n" + e);
        }
    }

    //  3. 메소드
    //  1) 등록 제어 함수, 매개변수 : 저장할 이름 String, return : 등록 성공 여부 boolean
    public boolean signUpConn(String name){
        try {
            String sql = "insert into table1 values('" + name + "') ";
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            return true;        // 성공했다는 의미를 부여한 결과를 전달
        }catch (Exception e){
            System.out.println(e);
        }
        return false;           // 실패했다는 의미를 부여한 결과를 전달
    }
    //  2) 출력 제어 함수, 매개변수 : 없음, return : 회원목록 ArrayList<String>
    public ArrayList<String> printConn(){
        ArrayList<String> list = new ArrayList<>();     // 리스트(비어있는) 선언
        try {
            String sql = "select *from table1";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                                // 레코드 하나씩 호출하면서 마지막 레코드까지
                list.add(rs.getString("name"));     // 현재 레코드의 name 필드 값을 호출하여 리스트에 저장
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return list;
    }
    //  3) 수정 제어 함수, 매개변수 : 기존 이름 String, 새 이름 String, return : 수정 성공 여부 boolean
    public boolean updateConn(String oldName, String newName){
        try {
            String sql = "update table1 set name = '" + newName + "' where name = '" + oldName + "'";
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            return true;
        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }
    //  4) 삭제 제어 함수, 매개변수 : 삭제할 이름 String, return : 삭제 성공 여부 boolean
    public boolean deleteConn(String name){
        try {
            String sql = "delete from table1 where name = '" + name + "'";
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            return true;
        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }
}
