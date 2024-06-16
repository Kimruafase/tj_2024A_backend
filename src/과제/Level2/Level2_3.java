package 과제.Level2;

public class Level2_3 {
    public static void main(String[] args) {
        int korean = 89;
        int math = 72;
        int eng = 49;
        int total = korean + math + eng;
        double mean = (double) total / 3;
        boolean b1 = total % 3 == 0 ? true : false;
        boolean b2 = total % 8 == 0 ? true : false;
        String s1 = total % 2 == 0 ? "짝수" : "홀수";
        String s2 = mean >= 65 ? "합격" : "불합격";

        System.out.printf("------------------------------------------------------------------\n" +
                "국어   영어    수학    합계     평균     3배수    8배수   홀짝    결과\n" +
                "%d     %d     %d     %d     %.1f    %s    %s   %s    %s", korean, eng, math, total, mean, b1, b2, s1, s2);
    }
}
