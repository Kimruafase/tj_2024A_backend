package day16.Step1.model.dto;

public class MemberDto {        //  이동객체
    //  1. 멤버변수 -> DB 테이블 필드와 동일
    private int mNo;
    private String mId;
    private String mPw;
    private String mName;
    private String mPhone;
    private String mDate;

    //  2. 생성자 -> 기본(default) 생성자, 풀 생성자
    public MemberDto(){}

    public MemberDto(int mNo, String mId, String mPw, String mName, String mPhone, String mDate) {
        this.mNo = mNo;
        this.mId = mId;
        this.mPw = mPw;
        this.mName = mName;
        this.mPhone = mPhone;
        this.mDate = mDate;
    }

    //  2-1. 회원가입용 생성자
    public MemberDto(String mId, String mPw, String mName, String mPhone) {
        this.mId = mId;
        this.mPw = mPw;
        this.mName = mName;
        this.mPhone = mPhone;
    }

    //  2-2. 아이디 찾기용 생성자
    public MemberDto(String mName, String mPhone) {
        this.mName = mName;
        this.mPhone = mPhone;
    }

    //  2-3. 비밀번호 찾기용 생성자


    //  3. 메소드  1) getter and setter 2) toString
    public int getmNo() {
        return mNo;
    }

    public void setmNo(int mNo) {
        this.mNo = mNo;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmPw() {
        return mPw;
    }

    public void setmPw(String mPw) {
        this.mPw = mPw;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "mNo=" + mNo +
                ", mId='" + mId + '\'' +
                ", mPw='" + mPw + '\'' +
                ", mName='" + mName + '\'' +
                ", mPhone='" + mPhone + '\'' +
                ", mDate='" + mDate + '\'' +
                '}';
    }
}
