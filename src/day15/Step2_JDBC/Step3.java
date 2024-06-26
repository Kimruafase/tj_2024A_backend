package day15.Step2_JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        Connection connection = null;

        //  DB 연동
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // MySQL 드라이버 이름
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day05", "root", "1234");  // 인터페이스 타입의 변수 선언
        } catch (Exception e){
            System.out.println(" >> 연동 실패 /n" + e);
        }

        Scanner scan = new Scanner(System.in);              //  입력 객체
        //  ArrayList<String> nameList = new ArrayList<>();     //  여러 개의 String 객체(문자열)를 저장하는 리스트 객체

        while (true) {
            System.out.println(" >> 1. 등록 2. 출력 3. 수정 4. 삭제");
            System.out.print(" >> ");
            try {

                int ch = scan.nextInt();

                if (ch == 1){
                    //  1. 입력
                    System.out.print(" >> [저장] 이름 : ");
                    String name = scan.next();

                    //  2. DB에 저장 > "insert into table1 values('" + 변수명 + "') ";
                    String sql = "insert into table1 values('" + name + "') ";
                    System.out.println("sql = " + sql);
                    PreparedStatement ps = connection.prepareStatement(sql);
                    ps.executeUpdate();

                } else if (ch == 2) {
                    System.out.println(" ===== 이름 명단 ===== ");
                    //  DB SQL 레코드 전체 테이블 검색 / 조회 > select * from table1;
                    String sql = "select * from table1";
                    PreparedStatement ps = connection.prepareStatement(sql);
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {         // 처음 레코드부터 마지막 레코드까지 출력
                        System.out.println(rs.getString("name"));
                    }

                } else if (ch == 3) {
                    //  1. 입력
                    System.out.print(" >> [수정] 기존 이름 : ");
                    String oldName = scan.next();
                    System.out.print(" >> [수정] 바꿀 이름 : ");
                    String newName = scan.next();

                    // 2. DB SQL 레코드 수정 : update table1 set name = '수정할 이름의 변수명' where name = '기존 이름의 변수명';
                    String sql = "update table1 set name = '" + newName + "' where name = '" + oldName + "'";
                    System.out.println("sql = " + sql);
                    PreparedStatement ps = connection.prepareStatement(sql);
                    ps.executeUpdate();

                } else if (ch == 4) {
                    //  1. 입력
                    System.out.print(" >> [삭제] 이름 : ");
                    String name = scan.next();

                    //  2. DB SQL 레코드 삭제 > "delete from table1 where = '" + 변수명 + "'";
                    String sql = "delete from table1 where name = '" + name + "';";
                    System.out.println("sql = " + sql);
                    PreparedStatement ps = connection.prepareStatement(sql);
                    ps.executeUpdate();

                }else {
                    System.out.println(" >> 없는 기능 번호입니다. ");
                }

            } catch (InputMismatchException e){
                System.out.println(" >> 잘못된 입력입니다.");
                scan = new Scanner(System.in);  // 잘못 입력 받은 값을 갖고 있는 객체를 초기화
            } catch (SQLException e){
                System.out.println(" >> SQL 구문이 틀렸습니다. " + e);
            }

        }   // w end

    }   // m end

}   // c end
