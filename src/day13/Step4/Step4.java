package day13.Step4;

class Parent{   //  상위 클래스로 사용할 예정
    //  1. 멤버변수
    protected String field1;
    //  2. 생성자

    //  3. 메소드
    public void method1(){
        System.out.println("Parent.method1");
    }
    public void method2(){
        System.out.println("Parent.method2");
    }
}
class Child extends Parent{    //  하위 클래스 사용
    protected String field2;
    public void method3(){
        System.out.println("Child.method3");
    }
    //  오버라이딩 : 상속 받은 메소드의 로직 재정의

    @Override
    public void method1() {
        System.out.println("Child.method1");
    }

    @Override
    public void method2() {
        System.out.println("Child.method2");
    }
}

public class Step4 {
    public static void main(String[] args) {
        Child child = new Child();
        child.method1();        //  자식은 부모 타입의 메소드, 멤버변수를 사용할 수 있다.
        child.method2();
        System.out.println(child.field1);

        System.out.println(child.field2);
        child.method3();
        //  =====================================   //
        Parent parent = child;  //  자식 타입 --> 부모 타입
        parent.method1();
        parent.method2();
        System.out.println(parent.field1);
        // > 부모 타입에서는 자식 타입의 메소드, 멤버변수를 사용할 수 없다.
//        System.out.println(parent.field2);
//        parent.method3();
        //  =====================================   //
        Child child1 = (Child) parent;  // 자식 타입 <-- 부모 타입
        System.out.println(child1.field2);
        child1.method3();
    }
}
