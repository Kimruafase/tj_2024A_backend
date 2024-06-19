package day10.Step1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Product> productList = new ArrayList<>();

        //  2. 무한 루프
        while (true){
            System.out.println(" List 상태 확인 함수 : " + productList);
            System.out.print(" >> 1. 등록 2. 출력 3. 수정 4. 삭제 5. 종료 << 선택 :  ");    // 무한 출력
            int ch = scan.nextInt();                         //  무한 입력, 입력받은 데이터로 기능을 구분짓기 위해
            if (ch==1){
                //  1) 입력 받고
                System.out.print(" >> 제품 코드 입력 : ");
                String code = scan.next();
                System.out.print(" >> 제품명 입력 : ");
                String name = scan.next();
                System.out.print(" >> 제품 가격 입력 : ");
                int price = scan.nextInt();
                //  2) 가공(유효성 검사)
                Product p = new Product(code, name, price);
                //  3) 배열에 저장
                productList.add(p);
            } else if (ch==2) {

            } else if (ch==3) {

            } else if (ch==4) {
                //  1) 입력 받기
                System.out.print(" >> 삭제할 제품 코드 : ");
                String deleteCode = scan.next();

                //  2) 삭제할 제품 코드를 찾는다.
                for (int i = 0; i < productList.size(); i++) {
                    if(productList.get(i).getCode().equals(deleteCode)){
                        productList.remove(i);
                        break;
                    }
                }
            } else if (ch==5) {

            }else{

            }
        }
    }
}
/*
    [메모리 설계]
    1. 객체의 추상적인 구성(특성, 행위)을 클래스로 구현해서 선언
    2. 구성한 개념을 클래스로 구현하기
    3. 해당 클래스 타입의 객체를 여러개 저장하기 위해 배열 선정 / 생성
        > 배열 선언 방법 : 타입[] 배열변수명 = new 타입[길이]

    [화면 구현 설계]
    1. 콘솔에 출력할 내용들을 구성

    [기능 구현]

* */