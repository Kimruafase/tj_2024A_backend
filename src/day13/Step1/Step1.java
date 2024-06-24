package day13.Step1;

import java.util.ArrayList;

class 동물{
    String myName;  //  멤버변수
    동물(){          //  생성자
        myName = "동물";
        System.out.println("<< 동물 생성자 탄생 >>");
    }
    void showMe(){  // 메소드
        System.out.println("myName : " + myName);
    }
}
class 조류 extends 동물{
    조류(){
        myName = "조류";
        System.out.println("<< 조류 생성자 탄생 >>");
    }
}
class 참새 extends 조류{
    참새(){
        myName = "참새";
        System.out.println("<< 참새 생성자 탄생 >>");
    }
}
class 닭 extends 조류{
    닭(){
        myName = "닭";
        System.out.println("<< 닭 생성자 탄생 >>");
    }
}
public class Step1 {
    public static void main(String[] args) {
        동물 animal = new 동물();
        animal.showMe();            // 동물
        조류 bird = new 조류();
        bird.showMe();              // 조류
        참새 bird2 = new 참새();
        bird2.showMe();             // 참새

        //  자동 형변환                   : byte -> short -> int -> long
        //  자식 타입은 부모 타입으로 변환 가능
        동물 bird3 = new 조류();
        bird3.showMe();
        동물 bird4 = new 참새();
        bird4.showMe();

        //  강제 형변환 * 전제 조건이 필요   : byte <- (byte)short <- (short)int <- (int)long
        //  부모 타입은 자식 타입으로 변환 불가능, 단 상속 관계이면 가능, 상하 관계만 가능(형제는 불가능)
//        조류 bird5 = new 동물();
        참새 bird6 = new 참새();
        동물 참새에서동물 = bird6;            //  자식 타입 --> 부모 타입 (가능 O)
        참새 동물에서참새 = (참새)참새에서동물;  //  부모 타입 --> 자식 타입

        닭 chicken = new 닭();
        동물 닭에서동물 = chicken;             //  자식 타입 --> 부모 타입
        닭 동물에서닭 = (닭)닭에서동물;         //  부모타입 --> 자식 타입

//        참새 닭에서참새 = (참새)chicken;         // 형제 관계 불가능

        //  부모 타입으로 배열 / 리스트를 선언하면 해당 배열 / 리스트에는 부모 타입 포함 자식 타입도 저장이 가능하다.
        ArrayList<동물> 동물사전 = new ArrayList<>();
        동물사전.add(animal);
        동물사전.add(bird);
        동물사전.add(bird2);

        //  부모 타입으로 배열 / 리스트를 선언하면 해당 배열 / 리스트에는 부모 타입 포함 자식 타입도 저장이 가능하다. 상위 타입은 불가능
        ArrayList<조류> 조류사전 = new ArrayList<>();
//        조류사전.add(animal);
        조류사전.add(bird);
        조류사전.add(bird2);
    }
}
