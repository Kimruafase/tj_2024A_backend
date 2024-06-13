package day06.Step4;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {

        //  클래스 사용처 > 1. 객체 설계도 2. main 함수가 갖고 있는 클래스

        //  1. 입력 객체 : 키보드로부터 입력받기 위한 기능을 제공하는 객체
        Scanner scanner = new Scanner(System.in);

        // 차 1대 당 변수 3개씩 사용한다는 가정 하에 차량이 3대면 변수는 9개, 100대면 변수는 300개
        int speed = 0;  // 속도 변수 선언하고 0으로 초기화
        String color = "빨강";
        String carNum = "250가 1524";

        //  2. 무한 루프 : while(true) vs for( ; ; )
        while(true){
            //  출력 함수
            System.out.println(" =============================== ");
            System.out.print(" >>> 1. 증속 2. 감속 3. 중지 : ");
            //  입력 함수를 이용해서 키보드로부터 입력받은 값을 정수형으로 반환해서 저장
            int ch = scanner.nextInt();
            //  조건문
            if (ch == 1) {
                speed++;    // 속도 1 증가
                System.out.println(" >> 증속(속도 증가), 현재 속도는 " + speed + "km입니다.");
            } else if (ch == 2) {
                speed--;    // 속도 1 감소
                System.out.println(" >> 감속(속도 감소), 현재 속도는 " + speed + "km입니다.");
            } else if (ch == 3) {
                speed = 0;  // 속도 0으로 변경
                System.out.println(" >> 중지, 현재 속도는 " + speed + "km입니다.");
                break;      // 가장 가까운 반복문, switch문을 탈출, 끝내기
            }else{
                System.out.println(" >> 알 수 없는 입력번호입니다. ");
            }
        }
    }
}
