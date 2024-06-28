package day16.Step1.model.dao;  // 패키지 day 16의 Step1 패키지 안에 model 패키지 안에 dao 패키지를 의미합니다.

import day16.Step1.model.dto.MemberDto; // 패키지 day 16의 패키지 Step1에서 패키지 model 안에 dto 패키지에서 MemberDto 클래스를 가져왔음을 의미합니다.

import java.sql.Connection; //  자바 패키지에서 sql 패키지에 Connection 인터페이스를 호출했음을 의미합니다.
import java.sql.DriverManager;  //  자바 패키지에서 sql 패키지에 DriverManager 인터페이스를 호출했음을 의미합니다.
import java.sql.PreparedStatement;  //  자바 패키지에서 sql 패키지에 PreparedStatement 인터페이스를 호출했음을 의미합니다.
import java.sql.ResultSet;  //  자바 패키지에서 sql 패키지에 ResultSet 인터페이스를 호출했음을 의미합니다.
import java.util.ArrayList; //  자바 패키지에서 sql 패키지에 ArrayList 클래스를 호출했음을 의미합니다.

public class MemberDao {    //  public 으로 선언된 MemberDao 클래스입니다.
    //  해당 클래스의 함수들을 다른 클래스에서 호출할 수 있도록 static 변수에 해당 객체를 생성
    public static MemberDao mDao = new MemberDao(); //  public 으로 선언된 static 변수이며 MemberDao 클래스에서 기본 생성자를 통해 생성되었습니다.

    //  0. DB 연동
        //  JDBC 인터페이스 3개
    Connection conn;    //  Connection 타입의 conn 멤버변수
    PreparedStatement ps;   //  PreparedStatement 타입의 ps 멤버변수
    ResultSet rs;   //  ResultSet 타입의 rs 멤버변수

        //  생성자에 연동 코드
    MemberDao(){    // 기본(default)으로 생성된 생성자입니다.
        try {   // 예외가 발생할 것 같은 코드를 try{} 로 묶어서 검사합니다.
            Class.forName("com.mysql.cj.jdbc.Driver");  //  MySQL 연결 드라이버 설정합니다.
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day06", "root", "1234");    //  conn 에 드라이버매니저를 통해 연결된 MySQL 로컬 호스트와 유저 이름 , 비밀번호를 대입 후 반환된 URL 을 대입합니다.
        }catch (Exception e){   // 수퍼 Exception 클래스가 갖고 있는 예외 처리 정보를 잡았다면 e에 그 정보를 저장합니다.
            System.out.println(" >> 연동 실패 << " + e);    //  " >> 연동 실패 << " 와 e에 저장한 예외처리 정보를 출력합니다.
        } // try 와 catch 문 end
    } // MemberDao 생성자 end

    //  1. 회원가입 화면 함수
    public boolean signUp(MemberDto mDto){  // public 으로 선언된 boolean 타입을 반환하는 signUp 메소드입니다. 매개변수로 MemberDto 타입의 mDto 를 받습니다.
        try {   // 예외가 발생할 것 같은 코드를 try{} 로 묶어서 검사합니다.
            //  1. SQL 작성
            String sql = "insert into member(mId, mPwd, mName, mPhone) values(?, ?, ?, ?)"; // 문자열 sql 변수에  "insert into member(mId, mPwd, mName, mPhone) values(?, ?, ?, ?)" 대입

            //  2. SQL 기재
            ps = conn.prepareStatement(sql);   // ps에 SQL 기재한 값을 대입

            //  2-1. SQL 문법의 ?(와일드카드) 매개변수 기재
            ps.setString(1, mDto.getmId());        // .setString(? 순서번호, 값 or 매개변수), 1번째 ?에 mDto.getmId()를 통해 반환된 문자열 대입
            ps.setString(2, mDto.getmPw());         // 2번째 ?에 mDto.getmPw()를 통해 반환된 문자열 대입
            ps.setString(3, mDto.getmName());       // 3번째 ?에 mDto.getmName()를 통해 반환된 문자열 대입
            ps.setString(4, mDto.getmPhone());      // 4번째 ?에 mDto.getmPhone()를 통해 반환된 문자열 대입

            //  3. SQL 실행 & 4. SQL 실행 결과
            int count = ps.executeUpdate();         // executeUpdate(); 등록된 레코드 수 반환, 1개의 레코드 등록하면 1 반환
            if(count == 1){ //  만약 count 가 1이라면
                return true; // 성공했다는 의미를 부여한 결과를 전달
            } // if문 종료

        }catch (Exception e){   // 수퍼 Exception 클래스가 갖고 있는 예외 처리 정보를 잡았다면 e에 그 정보를 저장합니다.
            System.out.println(e);  // 예외 처리 정보가 저장된 e를 출력합니다.
        } // try 와 catch 문 end
        return false;   //  예외 처리 정보가 잡혀서 try 문을 빠져나왔다면 false 값을 리턴합니다.
    }   // signUp 메소드 end

    //  2. 로그인 함수 : 로그인 성공한 회원 번호 반환
    public int logIn(MemberDto mDto){   //  public 으로 선언된 int 타입을 반환하는 logIn 메소드입니다. 매개변수로 MemberDto 타입의 mDto 를 받습니다.
        try{    // 예외가 발생할 것 같은 코드를 try{} 로 묶어서 검사합니다.
            String sql = "select *from member where mId = ? and mPwd = ?";  // 문자열 sql 변수에  "select *from member where mId = ? and mPwd = ?" 대입
            ps = conn.prepareStatement(sql);    // ps에 SQL 기재한 값을 대입

            ps.setString(1,mDto.getmId());  //  1번째 ?에 mDto.getmId()를 통해 반환된 문자열 대입
            ps.setString(2,mDto.getmPw());  //  2번째 ?에 mDto.getmPw()를 통해 반환된 문자열 대입

            rs = ps.executeQuery(); //  ps에 대입한 SQL 기재한 값을 ResultSet 으로 반환해서 rs에 저장.
            rs.next();  //  rs의 다음 실행문
            //  로그인 성공 시 레코드 1개, 실패 시 레코드 0개
            System.out.println(rs.getInt("mNo"));   //  rs 에서 "mNo" 행의 int 값을 출력하고 줄바꿈합니다.
            return rs.getInt("mNo");    //  rs 에서 "mNo" 행의 int 값을 반환합니다.

        }catch (Exception e){   // 수퍼 Exception 클래스가 갖고 있는 예외 처리 정보를 잡았다면 e에 그 정보를 저장합니다.
            System.out.println(e);  // 예외 처리 정보가 저장된 e를 출력합니다.
        }   // try 와 catch 문 end
        return 0;   //  예외 처리 정보가 잡혀서 try 문을 빠져나왔다면 0을 리턴합니다.
    }   //  logIn 메소드 end

    //  3. 아이디 찾기 화면 함수
    public ArrayList<String> findId(MemberDto mDto){    // public 으로 선언된 ArrayList<String> 타입을 반환하는 findId 메소드입니다. 매개변수로 MemberDto 타입의 mDto 를 받습니다.
        ArrayList<String> list = new ArrayList<>(); //  ArrayList<String> 타입의 list 변수를 새로 선언합니다.
        try{    // 예외가 발생할 것 같은 코드를 try{} 로 묶어서 검사합니다.
            String sql = "select *from member where mName = ? and mPhone = ?";  // 문자열 sql 변수에  "select *from member where mName = ? and mPhone = ?" 대입
            ps = conn.prepareStatement(sql);    // ps에 SQL 기재한 값을 대입

            ps.setString(1,mDto.getmName());    //  1번째 ?에 mDto.getmName()를 통해 반환된 문자열 대입
            ps.setString(2,mDto.getmPhone());   //  2번째 ?에 mDto.getmPhone()를 통해 반환된 문자열 대입

            rs = ps.executeQuery(); //  ps에 대입한 SQL 기재한 값을 ResultSet 으로 반환해서 rs에 저장.
            while (rs.next()){  //   rs의 다음 실행문이 false 가 될 때 까지
                list.add(rs.getString("mId")); // list 에 rs 에서 "mId" 행의 문자열 값을 순서대로 대입합니다.
            } // while 문 종료

        }catch (Exception e){   // 수퍼 Exception 클래스가 갖고 있는 예외 처리 정보를 잡았다면 e에 그 정보를 저장합니다.
            System.out.println(e);  //  예외 처리 정보가 저장된 e를 출력합니다.
        }   // try 와 catch 문 end
        return list;    //  예외 처리 정보가 잡혀서 try 문을 빠져나왔다면 비어있는 list 을 리턴합니다.
    }   //  findId 메소드 end

    //  4. 비밀번호 찾기 화면 함수
    public ArrayList<String> findPw(MemberDto mDto){    //  public 으로 선언된 ArrayList<String> 타입을 반환하는 findPw 메소드입니다. 매개변수로 MemberDto 타입의 mDto 를 받습니다.
        ArrayList<String> list = new ArrayList<>(); //  ArrayList<String> 타입의 list 변수를 새로 선언합니다.
        try{    //  예외가 발생할 것 같은 코드를 try{} 로 묶어서 검사합니다.
            String sql = "select *from member where mId = ? and mPhone = ?";    //  문자열 sql 변수에  "select *from member where mId = ? and mPhone = ?" 대입
            ps = conn.prepareStatement(sql);    // ps에 SQL 기재한 값을 대입

            ps.setString(1,mDto.getmId());  //  1번째 ?에 mDto.getmId()를 통해 반환된 문자열 대입
            ps.setString(2,mDto.getmPhone());   //  2번째 ?에 mDto.getmPhone()를 통해 반환된 문자열 대입

            rs = ps.executeQuery(); //  ps에 대입한 SQL 기재한 값을 ResultSet 으로 반환해서 rs에 저장.
            while (rs.next()){  //  rs의 다음 실행문이 false 가 될 때 까지
                list.add(rs.getString("mPwd")); //  list 에 rs 에서 "mPwd" 행의 문자열 값을 순서대로 대입합니다.
            }   // while 문 종료
        }catch (Exception e){   // 수퍼 Exception 클래스가 갖고 있는 예외 처리 정보를 잡았다면 e에 그 정보를 저장합니다.
            System.out.println(e);  //  예외 처리 정보가 저장된 e를 출력합니다.
        }   // try 와 catch 문 end
        return list;     //  예외 처리 정보가 잡혀서 try 문을 빠져나왔다면 비어있는 list 을 리턴합니다.
    }   //  findPw 메소드 end

    // 5. 회원 탈퇴 함수
    public boolean mDelete(String pw , int mNo){  //    public 으로 선언된 boolean 타입을 반환하는 mDelete 메소드입니다. 매개변수로 String 타입의 pw과 int 타입의 mNo 를 받습니다.
        try{    //  예외가 발생할 것 같은 코드를 try{} 로 묶어서 검사합니다.
            String sql = "delete from member where mNo = ? and mPwd = ?";   //  문자열 sql 변수에  "delete from member where mNo = ? and mPwd = ?" 대입
            ps = conn.prepareStatement(sql);    //  ps에 SQL 기재한 값을 대입
            ps.setInt(1,mNo);   //  1번째 ?에 int mNo 대입
            ps.setString(2,pw); //  2번째 ?에 문자열 pw 대입
            int count = ps.executeUpdate(); // executeUpdate(); 등록된 레코드 수 반환, 1개의 레코드 등록하면 1 반환
            if(count == 1){ //  만약 count 가 1이라면
                return true;    // true 를 반환합니다.
            } // if 문 end
        } catch (Exception e){  // 수퍼 Exception 클래스가 갖고 있는 예외 처리 정보를 잡았다면 e에 그 정보를 저장합니다.
            System.out.println(e);  //  예외 처리 정보가 저장된 e를 출력합니다.
        }   // try, catch 문 end
        return false;   //  예외 처리 정보가 잡혀서 try 문을 빠져나왔다면 false 을 리턴합니다.
    }   //  mDelete 메소드 end

    //  6. 회원 수정 함수
    public boolean mUpdate(MemberDto mDto, int mNo){    //  public 으로 선언된 boolean 타입을 반환하는 mUpdate 메소드입니다. 매개변수로 MemberDto 타입의 mDto 와 int 타입의 mNo 를 받습니다.
        try{    // 예외가 발생할 것 같은 코드를 try{} 로 묶어서 검사합니다.
            String sql = "update member set mName = ?, mPhone = ? where mNo= ?";    //  문자열 sql 변수에  "update member set mName = ?, mPhone = ? where mNo= ?" 대입
            ps = conn.prepareStatement(sql);    //  ps에 SQL 기재한 값을 대입
            ps.setString(1,mDto.getmName());    //  1번째 ?에 mDto.getmName()를 통해 반환된 문자열 대입
            ps.setString(2,mDto.getmPhone());   //  2번째 ?에 mDto.getmPhone()를 통해 반환된 문자열 대입
            ps.setInt(3,mNo);   //  3번째 ?에 int mNo 대입
            int count = ps.executeUpdate(); //  executeUpdate(); 등록된 레코드 수 반환, 1개의 레코드 등록하면 1 반환
            if(count == 1){ //  만약 count 가 1이라면
                return true;    // true 를 반환합니다.
            }   // if 문 end
        }catch (Exception e){   // 수퍼 Exception 클래스가 갖고 있는 예외 처리 정보를 잡았다면 e에 그 정보를 저장합니다.
            System.out.println(e);  //  예외 처리 정보가 저장된 e를 출력합니다.
        }   // try, catch 문 end
        return false;   //  예외 처리 정보가 잡혀서 try 문을 빠져나왔다면 false 을 리턴합니다.
    }   //  mUpdate 메소드 end
} // MemberDao 클래스 end
