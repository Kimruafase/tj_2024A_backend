package day06.Step3;

public class Step3 {
    public static void main(String[] args) {
        //  1. 객체 생성
        Phone p1 = new Phone();
            //  1) 클래스명
            //  2) 변수명
            //  3) = 대입
            //  4) new 연산자
            //  5) 생성자명()   , 생성자명과 클래스명 동일

        //  1. 두번째 객체 생성
        Phone p2 = new Phone();

        //  2. 객체의 멤버(필드 / 메소드) 접근 / 참조 하기
            //  객체 안에 들어가서 객체가 가지고 있는 것들을 사용
            //  객체 장점 :
        p1.name = "갤럭시23";
        System.out.println(p1.name);

        p1.전화걸기();

        p2.name = "갤럭시24";
        System.out.println(p2.name);

        p2.전화걸기();
    }
}
