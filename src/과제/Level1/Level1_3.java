package 과제.Level1;

import java.util.Scanner;

public class Level1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input boolean : ");
        boolean b = scanner.nextBoolean();
        System.out.print("input byte : ");
        byte b1 = scanner.nextByte();
        System.out.print("input char : ");
        char c = scanner.next().charAt(0);
        System.out.print("input short : ");
        short s = scanner.nextShort();
        System.out.print("input int : ");
        int i = scanner.nextInt();
        System.out.print("input long : ");
        long l = scanner.nextLong();
        System.out.print("input float : ");
        float f = scanner.nextFloat();
        System.out.print("input double : ");
        double d = scanner.nextDouble();

        System.out.print("output boolean : " + b + "\n");
        System.out.print("output byte : " + b1 + "\n");
        System.out.print("output char : " + c + "\n");
        System.out.print("output short : " + s + "\n");
        System.out.print("output int : " + i + "\n");
        System.out.print("output long : " + l + "\n");
        System.out.print("output float : " + f + "\n");
        System.out.print("output double : " + d );
    }
}
