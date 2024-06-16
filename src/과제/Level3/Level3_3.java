package 과제.Level3;

public class Level3_3 {
    public static void main(String[] args) {
        int july1 = 3532100;
        int july2 = 9123700;
        int july3 = 5183400;
        int july4 = 11738700;
        int m1 = july1 / 1000000;
        int m2 = july2 / 1000000;
        int m3 = july3 / 1000000;
        int m4 = july4 / 1000000;
        int d1 = july1 / 10000;
        int d2 = july2 / 10000;
        int d3 = july3 / 10000;
        int d4 = july4 / 10000;
        String s1 = " ";
        String s2 = " ";
        String s3 = " ";
        String s4 = " ";
        System.out.println(" ------ 7월 매출액 ------ ");
        for (int i = 0; i < m1; i++) {
            s1 += "■";
        }
        System.out.printf("%s %d만원\n", s1, d1);
        for (int i = 0; i < m2; i++) {
            s2 += "■";
        }
        System.out.printf("%s %d만원\n", s2, d2);
        for (int i = 0; i < m3; i++) {
            s3 += "■";
        }
        System.out.printf("%s %d만원\n", s3, d3);
        for (int i = 0; i < m4; i++) {
            s4 += "■";
        }
        System.out.printf("%s %d만원", s4, d4);
    }
}
