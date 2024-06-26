package day15.Step2_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Step1 {
    public static void main(String[] args) {


        try {
            //  1.
            Class.forName("com.mysql.cj.jdbc.Driver");  // MySQL 드라이버 이름
            System.out.println("<< JDBC 드라이버 호출 성공 >> ");

            //  2.
            Connection connection;  // 인터페이스 타입의 변수 선언
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day05","root", "1234");
            System.out.println("<< DB 연동 성공 >> ");      // Unknown database 'day05'

        } catch (Exception e){
            System.out.println("JDBC 연동 실패\n" + e);
        }


    }
}

