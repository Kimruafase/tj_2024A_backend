package day03;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        문제1 : 하나의 정수형으로  입력받아 7의 배수 이면 'O' 아니면 'X' 출력 하시오.
        System.out.print(" >> 정수 입력 : ");
        int int1 = scanner.nextInt();
        System.out.println(int1 % 7 == 0 ? " O " : " X ");
//
//        문제2 : 하나의 정수형으로  입력받아 홀수 이면 'O' 아니면 'X' 출력 하시오.
        System.out.print(" >> 정수 입력 : ");
        int int2 = scanner.nextInt();
        System.out.println(int2 % 2 == 0 ? " 홀수 : X " : " 홀수 : O ");
//
//        문제3 : 하나의 정수형으로  입력받아 7의 배수 이면서 짝수 이면 'O' 아니면 'X' 출력 하시오.
        System.out.print(" >> 정수 입력 : ");
        int int3 = scanner.nextInt();
        System.out.println(int3 % 7 == 0 && int3 % 2 == 0 ? " 7의 배수이면서 짝수 : O " : " 7의 배수이면서 짝수 : X ");
//
//        문제4 : 하나의 정수형으로  입력받아 11의 배수 이거나 짝수 이면 'O' 아니면 'X' 출력 하시오.
        System.out.print(" >> 정수 입력 : ");
        int int4 = scanner.nextInt();
        System.out.println(int4 % 11 == 0 || int4 % 2 == 0 ? " 11의 배수이거나 짝수 : O " : " 11의 배수이거나 짝수 : X ");
//
//        문제5 : 두개의 정수형으로 입력받아 더 큰수 출력 하시오.
        System.out.print(" >> 정수 1 입력 : ");
        int int5 = scanner.nextInt();
        System.out.print(" >> 정수 2 입력 : ");
        int int6 = scanner.nextInt();
        System.out.println((int5 == int6) ? " 두 정수가 같음 " + int5 : (int5 > int6) ? " 정수 1이 더 크다 " + int5 : " 정수 2가 더 크다 " + int6);

//
//        문제6 : 정수형으로 반지름을 입력받아 원 넓이 출력 하시오. 소수점 둘째 자리 까지 출력하시오.
//        계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
        System.out.print(" >> 반지름 : ");
        double r = scanner.nextDouble();
        double a = r * r * 3.14;
        System.out.println(" >> 원의 넓이 : " + a);
//
//        문제7 : 실수형으로 두번 입력받아 앞 실수의 값이 뒤의 값의 몇% 인지 소수점 첫째 자리까지 출력하시오.
//        예) 54.5   84.3 실수 2개입력시 결과는   64.285714%
        System.out.print(" >> 실수 1 : ");
        double d1 = scanner.nextDouble();
        System.out.print(" >> 실수 1 : ");
        double d2 = scanner.nextDouble();
        double d3 = d1 / d2 * 100;
        System.out.printf(" >> 비율 : %.1f%% \n", d3);
//
//        문제8 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 , 소수점 첫째 자리까지 출력하시오.
//        계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2
        System.out.print(" >> 윗변 : ");
        double up = scanner.nextDouble();
        System.out.print(" >> 밑변 : ");
        double down = scanner.nextDouble();
        System.out.print(" >> 밑변 : ");
        double h = scanner.nextDouble();
        double a1 = (up + down) * h / 2;
        System.out.printf(" >> 사다리꼴 넓이 : %2.0f \n", a1);
//
//        문제9 : 키를 정수를 입력받아 표준체중 출력하기 , 정수형으로 출력하시오.
//                계산식) 표준체중 계산식 = > (키 - 100) * 0.9
        System.out.print(" >> 키 입력 : ");
        int height = scanner.nextInt();
        int weight = (height - 100) * 9 / 10 ;
        System.out.println(" >> 표준 체중 : " + weight + "kg");
        System.out.println(" >> 계산식 : (" + height + " - 100) * 0.9 = " + weight + "kg");
//
//        문제10 : 키와 몸무게를 입력받아 BMI 출력하기 , 소수점 둘째 자리 까지 출력하시오.
//        계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
        System.out.print(" >> 키 : ");
        double h1 = scanner.nextDouble();
        System.out.print(" >> 몸무게 : ");
        double w1 = scanner.nextDouble();
        double bmi = w1 / ((h1 / 100) * (h1 / 100));
        System.out.printf(" >> BMI : %.2f \n" , bmi);

//
//        문제11 : inch 를 입력받아 cm 로 변환하기  , 소수점 둘째 자리까지 출력하시오.
//                계산식) 1 inch -> 2.54cm
        System.out.print(" >> inch : ");
        double inch = scanner.nextDouble();
        double cm = inch * 2.54;
        System.out.printf(" >> 변환한 cm : %.2f \n", cm);
//
//        문제12:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오
//        계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %
        System.out.print(" >> 중간고사 점수 : ");
        int middle = scanner.nextInt();
        System.out.print(" >> 기말고사 점수 : ");
        int last = scanner.nextInt();
        System.out.print(" >> 수행평가 점수 : ");
        int perf = scanner.nextInt();

        double ratio1 = middle * 0.3;
        double ratio2 = last * 0.3;
        double ratio3 = perf * 0.4;
        double total = ratio1 + ratio2 + ratio3;
        System.out.printf(" >> 총점 : %.2f \n", total);
//
//        문제13 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
//        int x = 10;
//        int y = x-- + 5 + --x;
//        printf(" x의 값 : %d , y의값 :  %d ", x, y)
        int x = 10;
        int y = x-- + 5 + --x;
        System.out.printf(" x의 값 : %d , y의값 :  %d \n", x, y);
        // x = 10,
        // 1. y = x-- + 5 => y = 10 + 5 = 15    [x--는 연산 후 1 차감]
        // 2. y = 15 + --x => y = 15 + 8 = 23   [--x는 연산 전 1 차감]
//
//        문제14 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
        System.out.print(" >> 나이 입력 : ");
        int age = scanner.nextInt();
        System.out.println(age >= 40 ? " >> 중년 " : age >= 20 ? " >> 성인 " : age >= 10 ? " >> 학생 " : " >> 유아 ");
//
//        문제15 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력
        System.out.print(" >> 수학 점수 : ");
        double math = scanner.nextDouble();
        System.out.print(" >> 영어 점수 : ");
        double eng = scanner.nextDouble();
        System.out.print(" >> 국어 점수 : ");
        double kor = scanner.nextDouble();

        double total1 = math + eng + kor;
        double mean = total1 / 3;
        System.out.printf(" >> 총점 : %.0f \n" , total1);
        System.out.printf(" >> 평균 : %.2f \n" , mean);
//
//        문제16 : 3개의 정수형으로 입력받아 가장 큰수 출력 [같은 입력 값 배제]
        System.out.print(" >> 정수 1 : ");
        int int7 = scanner.nextInt();
        System.out.print(" >> 정수 2 : ");
        int int8 = scanner.nextInt();
        System.out.print(" >> 정수 3 : ");
        int int9 = scanner.nextInt();

        int large = int7 > int8 && int7 > int9 ? int7 : int8 > int9 ? int8 : int9;
        System.out.println(" >> 가장 큰 정수 : " + large);
//
//        문제17 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 '로그인성공' 아니면 '로그인실패' 출력 하시오
            // 문자열(String)은 비교 연산자 사용 불가능 [객체]
            // 객체 비교 메소드 : 객체.equals()
            // 문자열 비교 : "문자열".equals("비교 문자열");
        System.out.print(" >> ID 입력 : ");
        String id = scanner.next();
        System.out.print(" >> PW 입력 : ");
        String pw = scanner.next();
            // id == "admin" && pw == "1234" [불가능]
        System.out.println(id.equals("admin") && pw.equals("1234") ? " >> 로그인 성공 " : " >> 로그인 실패 ");
    }
}
