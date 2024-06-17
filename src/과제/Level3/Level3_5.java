package 과제.Level3;

import java.util.Random;

public class Level3_5 {
    public static void main(String[] args) {
        int random = new Random().nextInt(10);
        String s = String.valueOf(random);
        for (int i = 0; i < 5; i++) {
            int random1 = new Random().nextInt(10);
            s += random1;
        }
        System.out.println("본인확인 인증번호 : " + s);
    }
}
