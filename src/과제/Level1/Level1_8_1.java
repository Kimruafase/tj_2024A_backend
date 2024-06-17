package 과제.Level1;

import java.util.Scanner;

public class Level1_8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String header = "\n============방문록===============\n번호    \t 작성자  \t    방문록\n";
        String boardlist = "";
        String footer = "================================\n";
        String output = "";


        /* 문제풀이 위치 */
        System.out.print("[1] 작성자 : ");
        boardlist = scanner.nextLine();

        System.out.print("[1] 방문록 : ");
        output = scanner.nextLine();

        System.out.println(header);
        System.out.printf("1        %s \t " ,boardlist);
        System.out.println(output);
        System.out.println(footer);

        System.out.print("[2] 작성자 : ");
        boardlist += scanner.nextLine();

        System.out.print("[2] 방문록 : ");
        output += scanner.nextLine();

        System.out.print(header);
        System.out.printf("1        %s \t " ,boardlist);
        System.out.println(output);
        System.out.println(footer);

        /* ----------- */
    }
}
