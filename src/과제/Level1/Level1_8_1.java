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
        boardlist += " \t";
        boardlist += scanner.nextLine();
        output += boardlist;

        System.out.println(header);
        System.out.printf("1        %s \t \n" ,boardlist);
        System.out.println(footer);

        System.out.print("[2] 작성자 : ");
        boardlist = "";
        boardlist += scanner.nextLine();

        System.out.print("[2] 방문록 : ");
        boardlist += "\t";
        boardlist += scanner.nextLine();


        System.out.print(header);
        System.out.printf("1        %s \t \n" ,output);
        System.out.printf("2        %s \t \n" ,boardlist);
        System.out.println(footer);

        output += "\n2        ";
        output += boardlist;
        System.out.print("[3] 작성자 : ");
        boardlist = "";
        boardlist += scanner.nextLine();

        System.out.print("[3] 방문록 : ");
        boardlist += "\t";
        boardlist += scanner.nextLine();

        System.out.print(header);
        System.out.printf("1        %s \t \n" ,output);
        System.out.printf("3        %s \t \n" ,boardlist);
        System.out.println(footer);

        output += "\n3        ";
        output += boardlist;
        System.out.print("[4] 작성자 : ");
        boardlist = "";
        boardlist += scanner.nextLine();

        System.out.print("[4] 방문록 : ");
        boardlist += "\t";
        boardlist += scanner.nextLine();

        System.out.print(header);
        System.out.printf("1        %s \t \n" ,output);
        System.out.printf("4        %s \t \n" ,boardlist);
        System.out.println(footer);

        output += "\n4        ";
        output += boardlist;
        System.out.print("[5] 작성자 : ");
        boardlist = "";
        boardlist += scanner.nextLine();

        System.out.print("[5] 방문록 : ");
        boardlist += "\t";
        boardlist += scanner.nextLine();

        System.out.print(header);
        System.out.printf("1        %s \t \n" ,output);
        System.out.printf("5        %s \t \n" ,boardlist);
        System.out.println(footer);
        /* ----------- */
    }
}
