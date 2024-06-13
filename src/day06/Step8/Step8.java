package day06.Step8;

public class Step8 {
    public static void main(String[] args) {
        
        //  1. 객체 생성
        계산기 c = new 계산기();
        
        //  2. 객체 내 함수 호출
        int result1 = c.sumMethod1(3,5);
        System.out.println("result1 = " + result1);
        
        int result2 = c.sumMethod2();
        System.out.println("result2 = " + result2);

        c.sumMethod3();

        c.sumMethod4(3,5);
        
    }
}
