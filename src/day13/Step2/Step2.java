package day13.Step2;

class 상위클래스A {
    //  생성자 : 코드가 없으면 컴파일 시 자동으로 디폴트 생성자 생성
}

class 하위클래스A extends 상위클래스A {
    //  생성자
    하위클래스A(){
        super();    // 상위 클래스에 생성자 코드가 따로 없으면, 상위 클래스의 디폴트 생성자가 자동으로 호출, 생략 가능
    }
}

class 상위클래스B{
    //  생성자 : 생성자 코드를 구현하면 컴파일 시 자동으로 디폴트 생성자 생성 X
    상위클래스B(int a, int b){

    }
}
class 하위클래스B extends 상위클래스B{
    하위클래스B(){
        super(1, 2);    // 디폴트 생성자 호출 --> 상위클래스B에는 없다.
    }
}

class 상위클래스C{
    //  생성자 : 2개(디폴트, 매개변수), 오버로딩 : 매개변수의 순서, 갯수, 타입에 따라 여러 개의 생성자를 구현 가능
    상위클래스C(){

    }
    상위클래스C(boolean a){

    }
}
class 하위클래스C extends 상위클래스C{
    하위클래스C(){

    }
}
// ===================================================================================== //

class A{                //  부모 :  / 자식 : B, C / 자손 : D, E

}
class B extends A{      //  부모 : A / 자식 : D

}
class C extends A{      //  부모 : A / 자식 : E

}
class D extends B{      //  부모 : B / 자식 :

}
class E extends C{      //  부모 : C / 자식 :

}
public class Step2 {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        //  묵시적 / 자동 타입 변환
        A a1 = b;
        A a2 = c;           // 부모 타입 <---- 자식 타입
        A a3 = d;
        A a4 = e;           // 부모 타입 <---- 부모 타입 <---- 자식 타입

//        B b1 = c;           // 형제 관계 X
//        C c1 = d;           // 남의 자식 관계 X
        
        //   강제 타입 변환
        B b1 = (B)a1;       //  a1 객체의 태생은 new B();
        E e1 = (E)a4;       //  a4 객체의 태생은 new E();
        
//        E e2 = (E)a1;       //  실행하면 오류 : a1 객체의 태생은 new B();
//        D d2 = (D)a2;       //  실행하면 오류 : a2 객체의 태생은 new C();   
        
        //  > 본래의 태생을 아는 방법
            //  > 객체 instanceof 타입 -> 해당 객체가 타입으로 포함하는지 여부 확인 키워드, 존재하면 true, 없으면 false
        boolean result1 = a1 instanceof A;
        System.out.println("result1 = " + result1);
        boolean result2 = a1 instanceof B;
        System.out.println("result2 = " + result2);
        boolean result3 = a1 instanceof C;
        System.out.println("result3 = " + result3);
        boolean result4 = a1 instanceof D;
        System.out.println("result4 = " + result4);
    }
}
