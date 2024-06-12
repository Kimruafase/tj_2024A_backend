package day05;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {

        // [입력] : 입력 객체
        Scanner scanner = new Scanner(System.in);

        //  [1] 입력받은 수 만큼 별 출력
            //  1. 키보드로부터 정수형을 입력받아 정수형 변수에 저장
        System.out.print(" >> [1] 별 갯수 : ");
        int star1 = scanner.nextInt();
        System.out.println(" >> star1 = " + star1);
            //  2. 입력받은 수 만큼 '*' 출력
        for (int i = 1; i <= star1 ; i++) {
            System.out.print('*');
        }

        System.out.println("\n ================================================== ");

        //  [2] 입력받은 수 만큼 '*' 출력하고 3의 배수마다 줄바꿈 처리
        System.out.print(" >> [2] 별 갯수 : ");
        int star2 = scanner.nextInt();
        System.out.println(" >> star2 = " + star2);
        for (int i = 1; i <= star2 ; i++) {
            System.out.print('*');
            if(i % 3 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n ================================================== ");
        
        //  [3] 입력받은 수 만큼 별을 하나의 변수에 하나씩 추가 후 해당 변수 출력
        System.out.print(" >> [3] 별의 갯수 : ");
        int star3 = scanner.nextInt();
        String starTotal = "";
        for (int i = 0; i < star3; i++) {
            starTotal += "*";
        }
        System.out.println("starTotal = " + starTotal);

        System.out.println("\n ================================================== ");

        //  [4] 입력받은 줄 만큼 출력
        System.out.print(" >> 줄 입력 : ");
        int w = scanner.nextInt();
        for (int i = 1; i <= w; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("\n ================================================== ");

        //  [5] 입력받은 줄 만큼 출력
        for (int i = 1; i <= w; i++) {
            for (int j = w; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n ================================================== ");

        //  [6] 입력받은 줄 만큼 출력
        for (int i = w; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n ================================================== ");
        
        //  [7] 입력받은 줄 만큼 출력
        for (int i = 0; i <= w; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = w; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n ================================================== ");
        
        //  [8] 입력받은 줄 만큼 출력
        for (int i = 1; i <= w; i+=2) {
            for (int j = w-1; j >= i ; j -= 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("\n ================================================== ");
        
        //  [9]
        for (int i = 1; i <= w; i+=2) {
            for (int j = 0; j <= i; j+=2) {
                System.out.print(" ");
            }
            for (int j = w; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n ================================================== ");

        // [10]
        for (int i = 0; i <= w; i+=2) {
            for (int j = w; j >= i; j -= 2) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 3; i <= w; i+=2) {
            for (int j = 0; j <= i; j+=2) {
                System.out.print(" ");
            }
            for (int j = w; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n ================================================== ");
        
        //  [11]
        System.out.print(" >> 최소 줄 입력 : ");
        int a = scanner.nextInt();
        System.out.print(" >> 최대 줄 입력 : ");
        int k = scanner.nextInt();
        for (int i = 1; i <= w; i++) {
            for (int j = 1; j <= w; j++) {
                if(j==a || j== k) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            a++;
            k--;
            System.out.println();
        }

        //  [12]
        System.out.print(" >> [12] 줄 입력 : ");
        int w1 = scanner.nextInt();
        System.out.print(" >> [12] 최소 줄 입력 : ");
        int b = scanner.nextInt();
        System.out.print(" >> [12] 최대 줄 입력 : ");
        int l = scanner.nextInt();
        for (int i = 1; i <= w1; i++) {
            for (int j = 1; j <= w1; j++) {
                if(j<=b || j>=l){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            b++;
            l--;
            System.out.println();
        }
        for (int i = 1; i <= w1; i++) {
            for (int j = w1; j >= 1; j--) {
                if(j<=b || j>=l){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            b--;
            l++;
            System.out.println();
        }

    }
}
