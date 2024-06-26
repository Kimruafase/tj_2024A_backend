package day15.Step1_예외처리;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {

        //  [1] 일반 예외 : 발생할 수도 있고 안 할수도 있는데 컴파일러가 무조건 예외 처리 검사
            // ============== 예외가 발생할 것 같은 ============== //
        try {
            Class.forName("JAVA.lang.String");            //  .forName(클래스명) : 해당 클래스명이 존재하는 지 검사해주는 메소드
            Class.forName("JAVA.lang.String2");            //  .forName(클래스명) : 해당 클래스명이 존재하는 지 검사해주는 메소드
        } catch (Exception e) {
            System.out.println(e);
        }
        //  java.lang.ClassNotFoundException;
            // ============== ================= ============== //

        //  [2] 실행 예외 : 발생할 수도 있고 안 할수도 있음 (방지)
        try {
            String str1 = "ThisIsJava";
            System.out.println(str1.length());  // 문자열.length() : 문자열의 길이

            String str2 = null;
            System.out.println(str2.length());  // . (도트 / 접근) 연산자, 객체 내 멤버변수, 메소드 접근
            //  java.lang.NullPointerException: Cannot invoke "String.length()" because "str2" is null
        } catch (Exception e){
            System.out.println(e);
        }

        //
        String str3 = "100";
        String str4 = "1aa";
        int result1 = Integer.parseInt(str3);         // Integer 클래스 : int형 관련 클래스, .parseInt() : 문자열 -> 정수형 타입 변환, static 메소드
        System.out.println(result1);
        try {
            int result2 = Integer.parseInt(str4);
            System.out.println(result2);                 // java.lang.NumberFormatException: For input string: "1aa"
        } catch (Exception e){
            System.out.println(e);
        }
        try {
            int[] intArray = {1, 2, 3};
            System.out.println(intArray[2]);
            System.out.println(intArray[3]);
        } catch (Exception e){
            System.out.println(e);
        }
        try {
            Scanner scanner = new Scanner(System.in);
            int ch = scanner.nextInt();                 // 만약에 문자 입력 시 예외 발생 : java.util.InputMismatchException
        } catch (Exception e){
            System.out.println(e);
        }

        // try 다중 catch
        try {
            Class.forName("JAVA.lang.String2");

            String str5 = "1aa";
            int result3 = Integer.parseInt(str5);
            System.out.println(result3);

            String str6 = null;
            System.out.println(str6.length());
        } catch (ClassNotFoundException e){
            System.out.println("해당 클래스명이 존재하지 않음");
        }catch (NullPointerException e){
            System.out.println("객체에 접근 불가능");
        }catch (NumberFormatException e){
            System.out.println("숫자형으로 변환 불가능");
        }finally {
            System.out.println("여기는 예외가 있던 말던 무조건 실행되는 구역");
        }

    }
}
