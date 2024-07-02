package day16.Step1.model.dto;

public class BoardDto {
    //  1. 멤버변수
    private String bTitle;
    private String bContent;
    private String bDate;
    private int bView;
    private int mNo;
    private int bNo;
    // - 작성자 ID
    private String mId;
    //  2. 생성자
    public BoardDto(){}
    public BoardDto(String bTitle, String bContent, String bDate, int bView, int mNo, int bNo) {
        this.bTitle = bTitle;
        this.bContent = bContent;
        this.bDate = bDate;
        this.bView = bView;
        this.mNo = mNo;
        this.bNo = bNo;
    }

    //  3. 메소드
        //  1. getter and setter
    public String getbTitle() {
        return bTitle;
    }
    public void setbTitle(String bTitle) {
        this.bTitle = bTitle;
    }
    public String getbContent() {
        return bContent;
    }
    public void setbContent(String bContent) {
        this.bContent = bContent;
    }
    public String getbDate() {
        return bDate;
    }
    public void setbDate(String bDate) {
        this.bDate = bDate;
    }
    public int getbView() {
        return bView;
    }
    public void setbView(int bView) {
        this.bView = bView;
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

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    //  2. toString
    @Override
    public String toString() {
        return "BoardDto{" +
                "bTitle='" + bTitle + '\'' +
                ", bContent='" + bContent + '\'' +
                ", bDate='" + bDate + '\'' +
                ", bView=" + bView +
                ", mNo=" + mNo +
                ", bNo=" + bNo +
                '}';
    }
}
