package 과제.Level3;

import java.util.Objects;
import java.util.Scanner;

public class Level3_2 {
    public static void main(String[] args) {
        for (int i = 1; ; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf(i +"회 입력 : ");
            String s = scanner.nextLine();
            if(Objects.equals(s, "end")){
                System.out.println("프로그램을 종료합니다. [총 " + (i-1) + "회 입력]");
                break;
            }
        }
    }
}
