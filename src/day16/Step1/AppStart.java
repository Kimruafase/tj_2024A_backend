package day16.Step1; // 패키지 day 16의 Step1 패키지를 의미합니다.

import day16.Step1.view.MemberView; // 패키지 day 16의 패키지 Step1에서 패키지 view 안에 MemberView 클래스를 가져왔음을 의미합니다.


public class AppStart { // public 으로 선언된 AppStart 클래스를 의미합니다.
    public static void main(String[] args) {    // 자바 JVM 을 실행하기 위해서 static 으로 선언되는 main 메소드 입니다.
        MemberView.mView.index();   // public 으로 선언된 MemberView 클래스 안에 static 변수로 선언된 객체를 통해 참조한 index 메소드를 호출합니다.
    }
}
