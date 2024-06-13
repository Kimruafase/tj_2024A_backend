package day06.Step5;

import java.util.Scanner;

public class car {
    int speed;
    int ch;
    Scanner scanner = new Scanner(System.in);

    public void speed() {
        while (true) {
            System.out.println(" =============================== ");
            System.out.print(" >>> 1. 증속 2. 감속 3. 중지 : ");
            ch = scanner.nextInt();
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
            } else {
                System.out.println(" >> 알 수 없는 입력번호입니다. ");
            }
        }
    }
}
