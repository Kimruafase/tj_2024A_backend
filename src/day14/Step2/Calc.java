package day14.Step2;

public interface Calc {
    double PI = 3.14;
    int ERROR = -999999999;

    default void description(){
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
    }
    static int total(int[] arr){
        int total = 0;

        for(int i : arr){
            total += i;
        }
        myStaticMethod();
        return total;
    }

    int add(int num1, int num2);

    int subtract(int num1, int num2);

    private void myMethod(){
        System.out.println("private 메소드입니다.");
    }
    private static void myStaticMethod(){
        System.out.println("private static 메소드입니다.");
    }
}
