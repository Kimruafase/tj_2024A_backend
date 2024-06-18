package day09.Step2;

public class Step2 {
    public static void main(String[] args) {
        //  1. 학생
        Student studentLee = new Student();
        studentLee.setStudentName("이지원");
        System.out.println(studentLee.serialNum);

        studentLee.serialNum++;

        //  2. 학생
        Student studentSon = new Student();
        studentSon.setStudentName("손수경");
        System.out.println(studentLee.serialNum);
        System.out.println(studentSon.serialNum);

        // ======================================= //

        Student1 studentLee1 = new Student1();
        studentLee1.setStudentName("이지원");
        System.out.println(studentLee1.serialNum);
        System.out.println(studentLee1.studentName + " 학번 : " + studentLee1.studentId);

        Student1 studentSon1 = new Student1();
        studentSon1.setStudentName("손수경");
        System.out.println(studentSon1.serialNum);
        System.out.println(studentSon1.studentName + " 학번 : " + studentSon1.studentId);

        // ======================================= //
        System.out.println(Student1.serialNum);
        // ======================================= //
        System.out.println(Student2.getSerialNum());
    }
}
