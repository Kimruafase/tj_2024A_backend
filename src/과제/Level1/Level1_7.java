package 과제.Level1;

import java.util.Scanner;

public class Level1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("회원명 String : ");
        String s1 = scanner.next();
        System.out.print("상태 boolean : ");
        boolean b = scanner.nextBoolean();
        System.out.print("회원번호 byte : ");
        byte b1 = scanner.nextByte();
        System.out.print("성별 char : ");
        char c = scanner.next().charAt(0);
        System.out.print("나이 short : ");
        short s = scanner.nextShort();
        System.out.print("포인트 int : ");
        int i = scanner.nextInt();
        System.out.print("예금액 long : ");
        long l = scanner.nextLong();
        System.out.print("키 float : ");
        float f = scanner.nextFloat();
        System.out.print("몸무게 double : ");
        double d = scanner.nextDouble();

        System.out.println("============== 회원 개인 정보 ==============");
        System.out.println("|              회원명 : " + s1 + "              |");
        System.out.print("|              상태 : " + b + "                |\n");
        System.out.print("|              회원번호 : " + b1 + "               |\n");
        System.out.print("|              성별 : " + c + "                   |\n");
        System.out.print("|              나이 : " + s + "                  |\n");
        System.out.print("|              포인트 : " + i + "              |\n");
        System.out.print("|              예금액 : " + l + "            |\n");
        System.out.print("|              평균 : " + f + "                 |\n");
        System.out.print("|              평균 : " + d + "                |\n");
        System.out.println("===========================================");
    }
}
