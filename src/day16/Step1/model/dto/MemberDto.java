package day16.Step1.model.dto;  // 패키지 day 16의 Step1 패키지 안에 model 패키지 안에 dto 패키지를 의미합니다.

public class MemberDto {        //  이동객체 // public 으로 선언된 MemberDto 클래스입니다.
    //  1. 멤버변수 -> DB 테이블 필드와 동일
    private int mNo;    // private 로 선언된 int 타입의 mNo 멤버변수입니다.
    private String mId; // private 로 선언된 String 타입의 mId 멤버변수입니다.
    private String mPw; // private 로 선언된 String 타입의 mPw 멤버변수입니다.
    private String mName;   // private 로 선언된 String 타입의 mName 멤버변수입니다.
    private String mPhone;  // private 로 선언된 String 타입의 mPhone 멤버변수입니다.
    private String mDate;   // private 로 선언된 String 타입의 mDate 멤버변수입니다.

    //  2. 생성자 -> 기본(default) 생성자, 풀 생성자
    public MemberDto(){}    // public 으로 선언된 MemberDto 클래스의 기본 생성자입니다. 기본 생성자 시작과 end

    public MemberDto(int mNo, String mId, String mPw, String mName, String mPhone, String mDate) {  // public 으로 선언된 MemberDto 클래스의 생성자인데 int mNo, String mId, String mPw, String mName, String mPhone, String mDate 의 매개변수를 받아서 생성됩니다. 오버로딩으로 쓰여진 생성자입니다.
        this.mNo = mNo; // int mNo 매개변수를 받아서 MemberDto 클래스의 mNo 멤버변수에 저장합니다.
        this.mId = mId; // String mId 매개변수를 받아서 MemberDto 클래스의 mId 멤버변수에 저장합니다.
        this.mPw = mPw; // String mPw 매개변수를 받아서 MemberDto 클래스의 mPw 멤버변수에 저장합니다.
        this.mName = mName; // String mName 매개변수를 받아서 MemberDto 클래스의 mName 멤버변수에 저장합니다.
        this.mPhone = mPhone;   // String mPhone 매개변수를 받아서 MemberDto 클래스의 mPhone 멤버변수에 저장합니다.
        this.mDate = mDate; // String mDate 매개변수를 받아서 MemberDto 클래스의 mDate 멤버변수에 저장합니다.
    }   // MemberDto 생성자 end

    //  2-1. 회원가입용 생성자
    public MemberDto(String mId, String mPw, String mName, String mPhone) { // public 으로 선언된 MemberDto 클래스의 생성자인데 String mId, String mPw, String mName, String mPhone 의 매개변수를 받아서 생성됩니다. 오버로딩으로 쓰여진 생성자입니다.
        this.mId = mId; // String mId 매개변수를 받아서 MemberDto 클래스의 mId 멤버변수에 저장합니다.
        this.mPw = mPw; // String mPw 매개변수를 받아서 MemberDto 클래스의 mPw 멤버변수에 저장합니다.
        this.mName = mName; // String mName 매개변수를 받아서 MemberDto 클래스의 mName 멤버변수에 저장합니다.
        this.mPhone = mPhone;   // String mPhone 매개변수를 받아서 MemberDto 클래스의 mPhone 멤버변수에 저장합니다.
    }   // MemberDto 생성자 end

    //  2-2. 아이디 찾기용 생성자
    public MemberDto(String mName, String mPhone) { //  public 으로 선언된 MemberDto 클래스의 생성자인데 String mName, String mPhone 의 매개변수를 받아서 생성됩니다. 오버로딩으로 쓰여진 생성자입니다.
        this.mName = mName; // String mName 매개변수를 받아서 MemberDto 클래스의 mName 멤버변수에 저장합니다.
        this.mPhone = mPhone;   // String mPhone 매개변수를 받아서 MemberDto 클래스의 mPhone 멤버변수에 저장합니다.
    }   // MemberDto 생성자 end

    //  2-3. 비밀번호 찾기용 생성자


    //  3. 메소드  1) getter and setter 2) toString
    public int getmNo() {   // public 으로 선언된 int 타입을 반환하는 getmNo 메소드입니다.
        return mNo; // mNo를 반환합니다.
    }   // getmNo 메소드 end

    public void setmNo(int mNo) {   // public 으로 선언된 반환 타입이 없고 매개변수로 int mNo를 받는 메소드입니다.
        this.mNo = mNo; //  매개변수 mNo를 MemberDto 클래스의 멤버변수 mNo에 저장합니다.
    }   //  setmNo 메소드 end

    public String getmId() {    // public 으로 선언된 String 타입을 반환하는 getmId 메소드입니다.
        return mId; // mId를 반환합니다.
    }   // getmId 메소드 end

    public void setmId(String mId) {    // public 으로 선언된 반환 타입이 없고 매개변수로 String mId 받는 메소드입니다.
        this.mId = mId; //  매개변수 mId 를 MemberDto 클래스의 멤버변수 mId 에 저장합니다.
    }   //  setmId 메소드 end

    public String getmPw() {    //  public 으로 선언된 String 타입을 반환하는 getmPw 메소드입니다.
        return mPw; // mPw를 반환합니다.
    }   // getmPw 메소드 end

    public void setmPw(String mPw) {    // public 으로 선언된 반환 타입이 없고 매개변수로 String mPw 를 받는 메소드입니다.
        this.mPw = mPw; //  매개변수 mPw 를 MemberDto 클래스의 멤버변수 mPw 에 저장합니다.
    }   //  setmPw 메소드 end

    public String getmName() {  // public 으로 선언된 String 타입을 반환하는 getmName 메소드입니다.
        return mName;   // mName 를 반환합니다.
    }   // getmName 메소드 end

    public void setmName(String mName) {    // public 으로 선언된 반환 타입이 없고 매개변수로 String mName를 받는 메소드입니다.
        this.mName = mName; //  매개변수 mName 를 MemberDto 클래스의 멤버변수 mName 에 저장합니다.
    }   //  setmName 메소드 end

    public String getmPhone() { // public 으로 선언된 String 타입을 반환하는 getmPhone 메소드입니다.
        return mPhone;  // mPhone 를 반환합니다.
    }   // getmPhone 메소드 end

    public void setmPhone(String mPhone) {  // public 으로 선언된 반환 타입이 없고 매개변수로 String mPhone 를 받는 메소드입니다.
        this.mPhone = mPhone;   //  매개변수 mPhone 를 MemberDto 클래스의 멤버변수 mPhone 에 저장합니다.
    }   //  setmPhone 메소드 end

    public String getmDate() {  // public 으로 선언된 String 타입을 반환하는 getmDate 메소드입니다.
        return mDate;   // mDate 를 반환합니다.
    }   // getmDate 메소드 end

    public void setmDate(String mDate) {    // public 으로 선언된 반환 타입이 없고 매개변수로 String mDate 받는 메소드입니다.
        this.mDate = mDate; //  매개변수 mDate 를  MemberDto 클래스의 멤버변수 mDate 에 저장합니다.
    }   //  setmDate 메소드 end

    @Override   // 인터페이스나 클래스에서 이미 선언된 메소드나 추상메소드를 재정의해서 쓰겠다는 의미입니다.
    public String toString() {  // public 으로 선언된 String 타입의 문자열을 반환하는 toString 메소드입니다.
        return "MemberDto{" +    // "MemberDto{" 와
                "mNo=" + mNo +  //  "mNo=" + 멤버변수 mNo에 저장된 값 + 와
                ", mId='" + mId + '\'' +    //  ", mId='" + 멤버변수 mId에 저장된 값 + '\'' + 와
                ", mPw='" + mPw + '\'' +    //  ", mPw='" + 멤버변수 mPw에 저장된 값 + '\'' + 와
                ", mName='" + mName + '\'' +    //   ", mName='" + 멤버변수 mName 에 저장된 값 + '\'' + 와
                ", mPhone='" + mPhone + '\'' +  // ", mPhone='" + 멤버변수 mPhone 에 저장된 값 + '\'' + 와
                ", mDate='" + mDate + '\'' +    //  ", mDate='" + 멤버변수 mDate 에 저장된 값 + '\'' + 와
                '}';    //  '}' 를 반환합니다.
    }   // toString 메소드 end
} //    MemberDto 클래스 end
