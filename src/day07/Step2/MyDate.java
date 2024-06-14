package day07.Step2;

public class MyDate {

    //  멤버변수 / 필드
    private int day;
    private int month;
    private int year;
    private boolean isValid = true;
    //  생성자 : 객체 생성 시 객체의 멤버변수를 초기화
        //  객체 내 멤버변수와 생성자의 매개변수명이 동일할 때
        //  1) 다르게 변수명을 사용하자. > 만일 다르면 코드 작성 시 가독성 down
        //  2) 가독성을 위해 변수명을 동일하게 할 때 this 키워드를 이용해 구분
            //  > this.멤버변수 : 현재 객체의 멤버변수를 호출한다.
    MyDate(int day, int month, int year){
        //  저장 뿐만 아니라 유효성 검사도 가능하다.
        if (day < 1 || day > 31) {
            isValid = false;
        }
        if (month < 1 || month > 12) {
            isValid = false;
        }
        //  윤년
        if ((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0){
            if(day < 1 || day > 29){
                isValid = false;
            }else{  // 윤년이 아닐 때
                if(day < 1 || day > 28){
                    isValid = false;
                }
            }
        }
        if (year < 1900 || year > 9999) {
            isValid = false;
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //  메소드
        // 해당 날짜가 유효한 지 유효성 검사 함수
    public String isValid(){
        if(isValid) {
            return "유효한 날짜입니다.";
        }else {
            return "유효하지 않은 날짜입니다.";
        }
    }

        // getter and setter
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}

//  1. 저장할 데이터를 생각
//  2. 멤버변수의 접근 제한 선택
//  3. 만일 멤버면수가 private이면 getter and setter 생성
