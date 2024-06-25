package day14.Step3;

public class Step3 {
    public static void main(String[] args) {

        //  인터페이스 타입의 변수 선언
        StepInterface si;

        //  인터페이스는 스스로 객체 / 인스턴스 생성 불가능
            //  구현 안한 메소드가 있어서 -> 추상 메소드
            //  구현(implements)을 대신 해줄 클래스가 필요하다.
            //  implements 한 클래스로 객체를 대신 생성 -> 구현(객)체
        new ImplementClass();           // <- (인터페이스가 구현된 클래스의)객체
        si = new ImplementClass();

        si.method1(3);              //  ImplementClass.method1 출력
        si.method2("JAVA");         //  ImplementClass.method2 출력

        si.method3(3);              //  StepInterface.method3 출력
        si.method4("JAVA");         //  StepInterface.method4 출력

//        si.method5(5);               //  static 은 객체 없이 인터페이스에서 직접 호출
//        si.method6("JAVA");          //  static 은 객체 없이 인터페이스에서 직접 호출

        StepInterface.method5(5);       //  StepInterface.method5 출력
        StepInterface.method6("JAVA");  //  StepInterface.method6 출력

//        si.method7(3);               //  private 이므로 외부 클래스에서 호출 불가능
//        si.method8("JAVA");          //  private 이므로 외부 클래스에서 호출 불가능

//        si.method9(3);               //   private 이므로 외부 클래스에서 호출 불가능
//        si.method10("JAVA");         //   private 이므로 외부 클래스에서 호출 불가능


    }
}
