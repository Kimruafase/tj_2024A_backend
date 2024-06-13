package day06.Step6;

import java.util.Scanner;

/*
    [요구 사항]
    1. 기능이 무한적으로 반복되도록 구현
        - 단 종료 버튼 / 입력 선택 시 종료
    2. 기능 : 예금, 출금, 잔고 확인, 종료
        > 예금 : 입력받은 금액을 예금액에 더한다.
        > 출금 : 입력받은 금액을 예금액에서 뺀다.
        > 잔고 : 현재 예금액을 확인
        > 종료 : 무한반복 종료 / 프로그램 종료
    3. 메뉴 : 1) 예금 2) 출금 3) 잔고확인 4) 종료
    4. 객체 설계
        > Account 클래스 정의
            - balance : 예금액
            - number : 계좌번호
        > Step6 클래스
            - main 함수
*/
public class Step6 {
    public static void main(String[] args) {

        //  입력 객체 생성
        Scanner scanner = new Scanner(System.in);

        //  1.
        Account acc = new Account();

        //  2. 객체 내 필드 / 멤버변수에 값 대입
        acc.balance = 0;
        System.out.print(" >> 계좌번호를 입력하세요. ");
        acc.number = scanner.nextInt();
        while (true) {
            System.out.println(" =============================== ");
            System.out.print(" >>> 1. 예금 2. 출금 3. 잔고 확인 4. 종료 : ");
            int ch = scanner.nextInt();
            if (ch == 1) {
                System.out.print(" >> 예금하실 금액을 입력하세요. ");
                int sum = scanner.nextInt();
                acc.balance = acc.balance + sum;
            }else if(ch==2){
                System.out.print(" >> 출금하실 금액을 입력하세요. ");
                int sum = scanner.nextInt();
                acc.balance = acc.balance - sum;
            } else if (ch==3) {
                System.out.println(" >> 현재 잔고는 " + acc.balance + "원입니다. ");
            } else if (ch==4) {
                System.out.println(" >> 프로그램을 종료합니다. ");
                break;
            }else{
                System.out.println(" >> 잘못 입력하신 번호입니다. ");
            }
        }
    }
}
