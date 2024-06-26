package day08.복습;

public class 복습 {
    public static void main(String[] args) {
        /*

            데이터 / 자료 저장
                > 리터럴 , 객체를 저장
                > 자료형 변수명 = 리터럴 or 객체 or 메소드반환값
        * */
        //  1. 회원정보의 이름 , 나이 1명 저장
            String name = "유재석";
            int age = 40;
                //  vs
            회원 m1 = new 회원();
            m1.name = "유재석";
            m1.age = 40;
        //  2. 100명 저장해주세요.
            //  name 변수와 age 변수를 x100 생성
            //  가능하지만, 변수가 많아지면 관리가 힘들다.
            //  붕어빵 만들기 위해 붕어빵틀을 만드는 것 처럼
            //  회원 1명을 만들기 위해 회원 틀을 만들자 -> 클래스 생성
        //  자바에서의 배열은 같은 타입의 자료끼리만 저장 가능
            //  1.
            String[] names = new String[100];
            int[] ages = new int[100];

            //  2.
            회원[] members = new 회원[100];

        //  생성자 : 클래스에서 생성(만드는 것)
            //  클래스를 만드는 이유 : (다양하기 때문에, 추상적) 객체를 만들기 위해
                //  객체를 왜 만들죠? > 객체는 속성 / 고유성질과 메소드 / 행위로 구성된 실체
                //  실체가 필요한 이유? > 현실세계의 속성들을 디지털화 시키기 위해서
                //  디지털화가 필요한 이유? > 컴퓨터에게 일을 시키기 위해서
                    //  ex_ 쿠팡 물류 공장에서 내가 제품을 포장하는 역할
                    //  > 사람은 피로도, 급여
                    //  > 포장하는 행위 / 메소드를 객체화 시켜서 -> 사람 대신에 컴퓨터가 포장하는 행위 / 메소드
                        //  > 포장을 어떻게 하는지의 순서? -> 알고리즘 / 순서도
                        //  > 박스 선택 -> 박스 접고 -> 제품 넣고 -> 박스 테이핑 -> 점검

            //  1. 기본[디폴트] 생성자
            게시판 b1 = new 게시판();
            b1.번호 = 1;
            b1.제목 = "안녕하세요";

                // vs
//            게시판 b2 = new 게시판("안녕하세요", 2);
                //  > 선언된 생성자와 생성자가 대입한 데이터 타입이 달라서 오류
            게시판 b3 = new 게시판(2, "안녕하세요");

            //  메소드 사용
            //  1. 객체 생성
            제품 p1 = new 제품();

            //  2. 객체를 통해 메소드 호출
            p1.구매함수();
                //  객체 없이 메소드를 호출하면 안 될까? X
                    //  메소드란? 여러 개의 실행문 / 로직 묶음의 행위
                    // 약속 / 규칙
            int result1 = p1.환불함수("코카콜라");

            //  public(공개용) vs private(비공개용)
                //  > 현재 클래스 기준으로 다른 클래스에게 공개 여부
                //  > 관례적으로 멤버변수는 private 사용
//            p1.제품번호 = "사이다";
                //  오류 이유 : 제품번호 멤버변수는 private라서 접근 불가능
            //  getter and setter 사용
            p1.set제품명("사이다");

        System.out.println(p1.get제품명());
    }
}
