package day08.복습;

public class 제품{
    //  1. 멤버변수 / 필드
    private int 제품번호;
    private String 제품명;
    //  2. 생성자
    
    //  3. 메소드 / 함수
    void 구매함수(){
        System.out.println("제품 구매");
    }

    //  반환 타입 : 반환 / 리턴할 값의 타입 (int, void 등등)
    int 환불함수(String 제품명){
        //  매개변수란 ? 함수 내에서 사용할 변수를 호출 시 전달 받을 값들
        return 3;
        //  반환 / 리턴 이란? 함수 내에서 결과를 호출했던 곳으로 전달할 값
    }

    //  getter and setter
        //  > 오른쪽 클릭 -> 생성 -> getter and setter
    public int get제품번호() {
        return 제품번호;
    }
    public void set제품번호(int 제품번호) {
        //  유효성 검사 추가 가능
        this.제품번호 = 제품번호;
    }
    public String get제품명() {
        return 제품명;
    }
    public void set제품명(String 제품명) {
        this.제품명 = 제품명;
    }
}
