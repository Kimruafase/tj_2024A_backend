package day15.Step1_예외처리;

public class Step2 {
    public static void main(String[] args) {

        try{
            method1();
        } catch (ClassNotFoundException e){
            System.out.println("메소드에서 예외 발생");
        }

        //  [1] static 메소드 호출 방법
        //  method1();  //  static 메소드가 아니고 main 메소드는 static 이므로 프로그램 시작과 함께 실해되는데 그 때 method1 메소드가 먼저 호출됨.

        //  [2] static 메소드가 아닌 메소드를 호출하는 방법
        //  [2 - 1]
        //  new Step2().method1();  //  지역변수 없이 바로 heap 영역으로부터 메소드 호출
        //  [2 - 2]
        //  Step2 step2 = new Step2();  //  heap 영역의 주소를 지역변수에 저장하고
        //  step2.method1();            //  지역변수가 heap 영역에 접근해서 메소드 호출
    }

    static void method1() throws ClassNotFoundException{
        // 예외(해당 함수를 호출했던 곳으로 ex_ return, 반환과 비슷한 개념) 던지기 / 떠넘기기
        Class.forName("java.lang.String");
        Class.forName("java.lang.String2");
        //  1. 직접처리 : try{} catch(){}
        //  2. 떠넘기기 : throws
    }
}
