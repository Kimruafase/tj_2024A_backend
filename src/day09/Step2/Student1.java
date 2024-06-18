package day09.Step2;

public class Student1 {
    //  정적변수 / 클래스변수
    public static int serialNum = 1000;
    //  멤버변수 / 필드
    public String studentName;
    public int studentId;

    // 생성자
    public Student1(){
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
}
