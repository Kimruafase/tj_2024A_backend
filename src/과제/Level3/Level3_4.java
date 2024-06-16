package 과제.Level3;

import java.util.Scanner;

public class Level3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = " ";
        int sum = 0;
        while (true) {
            System.out.print("input : ");
            int x = scanner.nextInt();
            if (x > 0){
                sum += x;
            for (int i = 0; i < x; i++) {
                    s1 += "■";
                }
            } else if(x < 0){
                s1 = " ";
                sum += x;
                for (int i = 0; i < sum; i++) {
                    s1 += "■";
                }
            }
            if(sum < 0){
                s1 = " ";
                System.out.printf(" %s \n",s1);
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.printf(" %s \n",s1);
        }
    }
}
