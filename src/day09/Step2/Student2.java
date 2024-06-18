package day09.Step2;

public class Student2 {
    //  정적변수 / 클래스변수
    private static int serialNum = 1000;
    //  멤버변수 / 필드
    public String studentName;
    public int studentId;

    // 생성자
    public Student2(){
        serialNum++;
        this.studentId = serialNum;
    }

    // 메소드
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static int getSerialNum() {
//        studentName = "이지원";
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student2.serialNum = serialNum;
    }
}
