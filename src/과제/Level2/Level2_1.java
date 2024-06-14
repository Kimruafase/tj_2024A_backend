package 과제.Level2;

import java.util.Scanner;

public class Level2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while( true ) {
            System.out.print(" 음악 재생 중 종료버튼[x] : ");
            char btn = scanner.next().charAt(0);
            if(btn == 'x'){
                System.out.println(" >> 음악 종료 ");
                break;
            }
        }
    }
}
