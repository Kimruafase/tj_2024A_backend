package day08.복습;

public class 게시판{

    //  1. 멤버변수 / 필드
    int 번호;
    String 제목;

    //  2. 생성자
        //  클래스 내 생성자를 1개도 선언하지 않으면 기본 생성자를 자동 생성
            //  > 생성자가 1개 이상이면 자동 생성 X
        //  생성자명은 클래스명과 동일하면 식별이 깨진다.
            //  > 생성자명이 동일해도 식별 가능하게 해주는 기능 -> 오버로딩
                //  > 매개변수의 개수, 위치, 타입에 따라 식별 / 단) 변수명은 아니다.
    게시판(){}
    게시판(int 번호, String 제목){
        //  this란 ? 매개변수와 멤버변수가 변수명이 동일할 때 구별하기 위해 현재 객체의 멤버변수를 칭할 때
        this.번호 = 번호;
        this.제목 = 제목;
    }
    게시판(int 번호){
        this.번호 = 번호;
    }
    //  3. 메소드
}
