package day14.Step4;

public interface Sell {
    //  추상 메소드
    void sell();

    default void order(){
        System.out.println("판매 주문");
    }
}
