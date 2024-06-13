package day06.Step5;

import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) {

        //  클래스 사용처 > 1. 객체 설계도 2. main 함수가 갖고 있는 클래스

        //  1. 입력 객체 : 키보드로부터 입력받기 위한 기능을 제공하는 객체
        Scanner scanner = new Scanner(System.in);

        // 차 1대 당 변수 3개씩 사용한다는 가정 하에 차량이 3대면 변수는 9개, 100대면 변수는 300개
        int speed = 0;  // 속도 변수 선언하고 0으로 초기화
        String color = "빨강";
        String carNum = "250가 1524";
        car car1 = new car();
        car1.speed = 100;
        //  2. 무한 루프 : while(true) vs for( ; ; )

        car1.speed();
    }
}
