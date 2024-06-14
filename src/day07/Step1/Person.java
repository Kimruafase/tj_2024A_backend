package day07.Step1;

    //  클래스의 사용처
        //  1. 객체의 설계도
        //  2. main 함수를 갖고 있는 클래스
    //  [사람 객체의 설계도]
public class Person {
        //  1. 멤버변수 / 필드
        String name;
        float height;
        float weight;
        //  2. 생성자
            //  1)  생성자명은 클래스명과 동일
            //  2)  반환 / return이 없으므로 반환타입 생략
            //  3)  디폴트 / 기본 생성자는 컴파일 / 실행 시 자동으로 생성된다.
            //  4)  오버로딩 : 같은 이름의 생성자를 여러개 선언할 때 매개변수의 타입, 순서, 갯수에 따라 식별 가능
        //  2-1. 기본 생성자
        Person(){}
        //  2-2. 매개변수 1개 생성자
        Person(String pname){
            name = pname;
            //  name : 멤버변수
            //  pname : 매개변수
        }
        Person(String pname, float pheight, float pweight){
             name = pname;
             height = pheight;
             weight = pweight;
        }
        //  3. 메소드 / 함수
        void person_(){}
}
