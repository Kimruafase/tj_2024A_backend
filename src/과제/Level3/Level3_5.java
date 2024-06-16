package 과제.Level3;

import java.util.Random;

public class Level3_5 {
    public static void main(String[] args) {
        String s = " ";
        int random = new Random().nextInt(10);
        for (int i = 0; i < 6; i++) {
            s += random;
            for (int j = 0; j < 6; j++) {
                random = new Random().nextInt(10);
            }
        }
        System.out.println("본인확인 인증번호 : " + s);
    }
}
