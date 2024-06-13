package day06.Step2;

public class 마라탕 {
    String 재료;
    int 재료의_개수;
    int 가격;
    double 재료의_무게;
    boolean 포장;

    public void 마라탕_계산(){
        System.out.println("가격은 " + 가격 + "원입니다.");
    }
    public void 재료_계산(){
        System.out.println("재료는 " + 재료 + "입니다.");
        System.out.println("재료의 갯수는 "+ 재료의_개수 + "개입니다.");
        System.out.println("재료의 무게는 " + 재료의_무게 + "kg입니다. ");
    }
    public void 포장(){
        if(포장 == false){
            System.out.println("매장에서 식사입니다.");
        }else{
            System.out.println("포장입니다.");
        }
    }
}
