package day09.Step1;

public class Student {
    //  1. 멤버변수 / 필드
        //  접근 제한자 : public(공개용), private(비공개용)
        //  타입 : 1. 기본 타입(int 등) 2. 참조 타입(String 등)
        //  변수명 : 아무거나(임의)
        //  멤버변수의 초기값 -> 객체 생성 시 초기화 값이 없으면 정수 : 0, 실수 : 0.0, boolean : false, 참조 타입 : null
        //  지역변수의 초기값 -> 없으면 쓰레기값 / 임의의 값
            //  지역변수(함수 / 메소드 안에서 선언) vs 멤버변수 (클래스 안 메소드 밖에서 선언된 변수)

    public String studentName;
    public int grade;
    public int money;
    //  2. 생성자 : 객체 생성(new) 시 객체 내 속성(멤버변수)을 초기화
        //  기본 / 디폴트 생성자는 클래스 내 생성자 정의가 1개라도 존재하지 않을 때 자동생성
        //  생성자는 메소드와 동일하지만 반환 / 리턴 값이 없고 호출 방법이 다르다.
        //  this : 1. 매개변수명과 멤버변수명이 동일할 때 멤버변수의 식별용 2. 현재 메소드 / 생성자를 호출한 주체(객체)자
    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }
    //  3. 메소드 : 객체들 간의 상호작용 / 협력, 행위 / 행동
    public void takeBus(Bus bus){
        bus.take(1000);         // bus에 1000을 대입
        this.money -= 1000;
    }
    public void takeSubway(Subway subway){
        subway.take(1500);
        this.money -= 1500;
    }
    public void takeTaxi(Taxi taxi){
        taxi.take(10000);
        this.money -= 10000;
    }
        //  학생 정보를 출력하는 함수
    public void showInfo(){}
        //  객체 출력 시 객체의 주소값이 아닌 객체의 속성을 호출 시 toString() 메소드 활용
            //  오른쪽 클릭 -> 생성 -> toString()
    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", grade=" + grade +
                ", money=" + money +
                '}';
    }
}
