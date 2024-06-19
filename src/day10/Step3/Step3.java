package day10.Step3;

import java.util.Scanner;
/*
    [학생 등록]
    * 1. 학번과 이름을 입력받아 학생 객체 생성 후 학생 목록 리스트에 저장하기
    * 학생 목록 리스트를 만들어주세요.
    [점수 등록]
    * 1. 학번을 입력 받아서 동일한 학번이 있을 경우
    * 2. 과목명과 점수를 입력받아서 해당 학번 학생의 점수 리스트에 저장
    [점수 확인]
    * 1. 학번을 입력 받아서 동일한 학번이 있을 경우
    * 2. 해당 학번의 학생의 모든 점수 리스트를 출력
* */


public class Step3 {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 50);

        Student studentKim = new Student(1002, "Kim");
        studentKim.addSubject("국어", 70);
        studentKim.addSubject("수학", 85);
        studentKim.addSubject("영어", 100);

        studentLee.showStudentInfo();
        System.out.println(" ======================================= ");
        studentKim.showStudentInfo();
        Scanner scan = new Scanner(System.in);
//        while (true){
//            System.out.println(" >> 1. 학생 등록 2. 점수 등록 3. 점수 확인 4. 프로그램 종료 << 선택 : ");
//            int ch = scan.nextInt();
//            if (ch == 1) {
//
//            } else if (ch == 2) {
//
//            } else if (ch == 3) {
//
//            } else if (ch == 4) {
//
//            }else {
//                System.out.println(" >> 잘못 입력하신 번호입니다.");
//            }
//        }
    }
}
