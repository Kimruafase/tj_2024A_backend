package day07.Step3;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) { // main s

        // 1. 입력 객체 : 입력기능( .next() )을 사용할려고
        // .next() 관련된 기능을 scanner 객체가 가지고 있으니까

        Scanner scanner = new Scanner(System.in);

        // 1. 객체 생성
        System.out.println(" >> 계좌 번호를 입력해주세요. ");
        String number = scanner.next();

        // 2. 객체내 필드/멤버변수 에 값 대입
        Account acc = new Account(100000, number);

        while ( true ){ // w s : 무한반복
            // 출력
            System.out.println(" ============================== ");
            System.out.print(" >>> 1.예금 2.출금 3.잔고 4.종료 : ");
            // 입력
            int ch = scanner.nextInt();
            // 3. 입력값에 따른 서로 다른 로직 처리 ( 조건문 )
            if( ch ==1 ){
                System.out.println(" >> 예금할 금액을 입력해주세요 ");
                int money = scanner.nextInt();
                acc.setBalance(acc.getBalance() + money);
            } // 만약에 내가 입력한 값이 1 이면 예금처리
            else if( ch==2 ){
                System.out.println(" >> 출금할 금액을 입력해주세요. ");
                int money = scanner.nextInt();
                acc.setBalance(acc.getBalance() - money);
            }  // 만약에 내가 입력한 값이 2 이면 출금처리
            else if( ch==3 ){
                System.out.println(" >> 잔고는 " + acc.getBalance() + "원입니다.");
            } // 만약에 내가 입력한 값이 3 이면 잔고확인처리
            else if( ch==4 ){
                System.out.println(" >> 프로그램을 종료합니다. ");
                break;
            } // 만약에 내가 입력한 값이 4 이면 종료
            else{
                System.out.println(" >> 잘못 입력하신 번호 입니다.");
            } // 그외
        } // w end
    } // main e
}
