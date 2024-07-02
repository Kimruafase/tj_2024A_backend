package day16.Step1.model.dto;

public class ReplyDto {
    //  DTO : Data Transfer Object
    //  MVC 패턴에서의 역할 : 각 구역별(VIEW, CONTROLLER, DAO) 데이터 변수들을 묶어서 이동하는 객체
        //  1. 멤버변수는 private, 2. 생성자 : 빈 생성자, 풀 생성자 + n개, 3. 메소드 : getter and setter , toString()
    //  1. 멤버변수
    private String rContent;
    private String rDate;
    private int mNo;
    private int bNo;
    private int rNo;
    private String mId;

    //  2. 생성자
    public ReplyDto(){}
    public ReplyDto(String rContent, String rDate, int mNo, int bNo, int rNo) {
        this.rContent = rContent;
        this.rDate = rDate;
        this.mNo = mNo;
        this.bNo = bNo;
        this.rNo = rNo;
    }

    //  3. 메소드
        // 3-1. getter and setter
    public String getrContent() {
        return rContent;
    }

    public void setrContent(String rContent) {
        this.rContent = rContent;
    }

    public String getrDate() {
        return rDate;
    }

    public void setrDate(String rDate) {
        this.rDate = rDate;
    }

    public int getmNo() {
        return mNo;
    }

    public void setmNo(int mNo) {
        this.mNo = mNo;
    }

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public int getrNo() {
        return rNo;
    }

    public void setrNo(int rNo) {
        this.rNo = rNo;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    //  3-2. toString()
    @Override
    public String toString() {
        return "ReplyDto{" +
                "rContent='" + rContent + '\'' +
                ", rDate='" + rDate + '\'' +
                ", mNo=" + mNo +
                ", bNo=" + bNo +
                ", rNo=" + rNo +
                '}';
    }
}
