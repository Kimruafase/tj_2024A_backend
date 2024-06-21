package day12.Step1;

public class Customer {
    //  1. 멤버변수 : 객체 내 속성을 저장함. 접근제한자 static 타입 변수명
        //  접근 제한자
        //  private : 다른 클래스로부터 접근 제한, 현재 클래스에서만 호출이 가능
        //  public  : 다른 클래스로부터 접근 가능, 현재 외 다른 클래스에서도 호출이 가능
        //  정적변수
        //  static : 메소드 영역에 저장되는 변수로서 객체가 없어도 사용이 가능하다.
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRatio;

    //  2. 생성자 : 객체 생성(new) 시 사용되는 메소드, 반환타입이 없다.
        //  오버로딩 : 생성자명이 동일해도 매개변수나 타입, 선언순서가 *다르다면 * 여러개 선언 가능
        //  클래스 내 생성자가 1개도 없으면 기본(default) 생성자가 자동으로 생성되지만
        //  > 생성자가 1개 이상 존재하면 기본 생성자는 자동으로 생성되지 않는다.
        //  > 주로 객체 생성 시 멤버변수의 초기화 또는 유효성 검사를 진행할 때
    public Customer(){
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }
    public Customer(int customerID){}

    //  3. 메소드 : 함수, 객체의 사용 방법 / 행위 / 행동
        //  접근제한자 static 반환타입 메소드명(타입 매개변수1, 타입 매개변수2){실행문; return 값}
    public int calcPrice(int price){
        //  this 란? 매개변수와 멤버변수를 구분하기 위해, 해당함수를 실행한 객체를 식별용
        this.bonusPoint += price * this.bonusRatio;
        return price;   // return 값, 값은 메소드 타입과 일치한 값, 반환 값이 없으면 void 타입
    }
    public String showCustomerInfo(){
        return customerName + " 님의 등급은 " + customerGrade + " 이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
}
