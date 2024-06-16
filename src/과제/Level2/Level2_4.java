package 과제.Level2;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Level2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("가위 바위 보 선택 : ");
        String player = scanner.nextLine();
        int i = Objects.equals(player, "가위") ? 0 : Objects.equals(player, "바위") ? 1 : 2;
        int random = new Random().nextInt(3);
        String r = random == 0 ? "가위" : random == 1 ? "바위" : "보";
        System.out.println("comran) " + r);
        if ((random == 0 && i == 2) || (random == 1 && i == 0) || (random == 2 && i == 1)){
            System.out.println("com 승리");
        }else if (random == i){
            System.out.println("무승부");
        }else{
            System.out.println("player 승리");
        }
    }
}
