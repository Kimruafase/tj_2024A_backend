package day10.Step3;

import java.util.ArrayList;

public class Student {
    //  1. 멤버변수 선언
    int studentID;
    String studentName;
    ArrayList<Subject> subjectsList;

    //  2. 생성자
    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectsList = new ArrayList<>();
    }

    //  3. 메소드
    public void addSubject(String name, int score){
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subjectsList.add(subject);
    }
    public void showStudentInfo(){
        int total = 0;
        for(Subject s : subjectsList){
            total += s.getScorePoint();
            System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " + s.getScorePoint() + "입니다. ");
        }
        System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
    }
}
