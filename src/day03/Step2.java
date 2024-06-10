package day03;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {

        // 예제 1 : 작성자, 내용, 날짜 입력 받아서 형식에 맞추어 출력
        // 1. 입력 객체
            //  1) Scanner 클래스 [입력 시 자동 완성 권장]
            //  > import java.util.Scanner; 자동 완성 시 코드 추가, 아니면 직접 입력 해야함
            //  > 현재 클래스의 다른 패키지로부터 해당 클래스를 가져오기
        Scanner scanner = new Scanner(System.in);

        // 2. 입력 받고 변수에 저장
        System.out.print("작성자 : ");
        String people = scanner.next();
        scanner.nextLine();
        System.out.print("방문록 : ");
        String visit = scanner.nextLine();
        System.out.print("나이 : ");
        int old = scanner.nextInt();

        // 3. 출력 println vs print vs printf
        System.out.printf(" >> 작성자 : %s \t 나이 : %3d \n", people, old);
        System.out.printf(" >> 방문록 : %s \n", visit);

        System.out.println(" >> 작성자 : " + people + "\t 나이 : " + old);
        System.out.println(" >> 방문록 : " + visit);

        // 예제 2: 기본급과 수당을 정수로 입력받아 실수령에 계산해 출력
            // 실수령액 계산식 : 기본급 + 수당 - 세금(기본급의 10%)
        System.out.print("기본급 : ");
        int int1 = scanner.nextInt();
        System.out.print("수당 : ");
        int int2 = scanner.nextInt();
        int int3 = int1 + int2 - (int1 / 10);
        System.out.println(" >> 실수령액 : " + int3);
        System.out.println(" >> 계산식 : " + int1 + " + " + int2 + " - (" + int1 + " / 10) = " + int3);


    }
}
