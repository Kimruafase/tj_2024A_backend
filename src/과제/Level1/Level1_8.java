package 과제.Level1;

import java.util.Scanner;

public class Level1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 방문록 목록 초기화
        String[] author = new String[5];
        String[] content = new String[5];
        int currentIndex1 = 0;
        int currentIndex2 = 0;

        // 첫 번째 방문록 작성
        System.out.print("[1] 작성자 : ");
        String author1 = scanner.nextLine();

        System.out.print("[1] 방문록 : ");
        String content1 = scanner.nextLine();

        author[currentIndex1++] = author1;
        content[currentIndex2++] = content1;

        System.out.println("============ 방문록 ============");
        System.out.println("번호    작성자     방문록");
        System.out.printf("1      %s      %s\n", author1,content1);
        System.out.println("===============================");

        System.out.print("[2] 작성자 : ");
        String author2 = scanner.nextLine();

        System.out.print("[2] 방문록 : ");
        String content2 = scanner.nextLine();

        author[currentIndex1++] = author2;
        content[currentIndex2++] = content2;

        System.out.println("============ 방문록 ============");
        System.out.println("번호    작성자     방문록");
        System.out.printf("1      %s      %s\n", author[0],content[0]);
        System.out.printf("2      %s      %s\n", author2,content2);
        System.out.println("===============================");

        System.out.print("[3] 작성자 : ");
        String author3 = scanner.nextLine();

        System.out.print("[3] 방문록 : ");
        String content3 = scanner.nextLine();

        author[currentIndex1++] = author3;
        content[currentIndex2++] = content3;

        System.out.println("============ 방문록 ============");
        System.out.println("번호    작성자     방문록");
        System.out.printf("1      %s      %s\n", author[0],content[0]);
        System.out.printf("2      %s      %s\n", author[1],content[1]);
        System.out.printf("3      %s      %s\n", author3,content3);
        System.out.println("===============================");

        System.out.print("[4] 작성자 : ");
        String author4 = scanner.nextLine();

        System.out.print("[4] 방문록 : ");
        String content4 = scanner.nextLine();

        author[currentIndex1++] = author4;
        content[currentIndex2++] = content4;

        System.out.println("============ 방문록 ===================");
        System.out.println("번호    작성자     방문록");
        System.out.printf("1      %s      %s\n", author[0],content[0]);
        System.out.printf("2      %s      %s\n", author[1],content[1]);
        System.out.printf("3      %s      %s\n", author[2],content[2]);
        System.out.printf("4      %s      %s\n", author4,content4);
        System.out.println("======================================");

        System.out.print("[5] 작성자 : ");
        String author5 = scanner.nextLine();

        System.out.print("[5] 방문록 : ");
        String content5 = scanner.nextLine();

        author[currentIndex1++] = author5;
        content[currentIndex2++] = content5;

        System.out.println("============ 방문록 ===================");
        System.out.println("번호    작성자     방문록");
        System.out.printf("1      %s      %s\n", author[0],content[0]);
        System.out.printf("2      %s      %s\n", author[1],content[1]);
        System.out.printf("3      %s      %s\n", author[2],content[2]);
        System.out.printf("4      %s      %s\n", author[3],content[3]);
        System.out.printf("5      %s      %s\n", author5,content5);
        System.out.println("======================================");


        scanner.close();
    }
}
