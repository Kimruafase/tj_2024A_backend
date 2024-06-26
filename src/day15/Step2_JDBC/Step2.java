package day15.Step2_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Step2 {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");  // MySQL 드라이버 이름

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day05","root", "1234");  // 인터페이스 타입의 변수 선언

            String sql = "insert into table1 values('유재석')";
            // (SQL) 기재 준비하다, .PreparedStatement() : sql 을 문자열로 배개변수로 전달, 해당 sql 을 조작할
            PreparedStatement ps = connection.prepareStatement(sql);
            //  실행하고 최신화한다.
            ps.executeUpdate();

            sql = "insert into table1 values('강호동')";
            ps = connection.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e){
            System.out.println("JDBC 연동 실패\n" + e);
        }
    }
}
