package day09.Step3;

import java.util.Scanner;

public class 제품_CRUD_변수버전 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  제품 메모리 설계
        String productCode1 = "";
        String productCode2 = "";
        String productCode3 = "";
        String productName1 = "";
        String productName2 = "";
        String productName3 = "";
        int productPrice1 = 0;
        int productPrice2 = 0;
        int productPrice3 = 0;
        while (true){
            System.out.print(" >> 1. 등록(C) 2. 출력(R) 3. 수정(U) 4. 삭제(D) : ");  // 무한 출력
            int ch = scanner.nextInt();                                          // 무한 입력
            if (ch==1){
                System.out.print(" >> 제품코드를 입력해주세요.");
                String productCode = scanner.next();
                System.out.print(" >> 제품명을 입력해주세요.");
                String productName = scanner.next();
                System.out.print(" >> 제품가격을 입력해주세요.");
                int productPrice = scanner.nextInt();

                if(productPrice1 == 0){
                    productCode1 = productCode;
                    productName1 = productName;
                    productPrice1 = productPrice;
                } else if (productPrice2==0) {
                    productCode2 = productCode;
                    productName2 = productName;
                    productPrice2 = productPrice;
                } else if (productPrice3 == 0) {
                    productCode3 = productCode;
                    productName3 = productName;
                    productPrice3 = productPrice;
                } else{
                    System.out.println(" [경고] 제품 등록 자리가 부족합니다.");
                }
            } else if (ch==2) {
                System.out.println("============ 제품 목록 ===========");
                if( !productCode1.equals("")){
                    System.out.printf("%s     %s    %d \n",productCode1,productName1,productPrice1);
                } if(!productCode2.equals("")){
                    System.out.printf("%s     %s    %d \n",productCode2,productName2,productPrice2);
                }  if (!productCode3.equals("")) {
                    System.out.printf("%s     %s    %d \n",productCode3,productName3,productPrice3);
                }
            } else if (ch==3) {
                System.out.print(" >> 수정할 제품코드를 입력해주세요.");
                String updateCode = scanner.next();
                System.out.print(" >> 새로운 제품명을 입력해주세요.");
                String productName = scanner.next();
                System.out.print(" >> 새로운 제품 가격을 입력해주세요. ");
                int productPrice = scanner.nextInt();
                if(updateCode.equals(productCode1)) {
                    productName1 = productName;
                    productPrice1 = productPrice;
                }
                if(updateCode.equals(productCode2)) {
                    productName2 = productName;
                    productPrice2 = productPrice;
                }
                if(updateCode.equals(productCode3)) {
                    productName3 = productName;
                    productPrice3 = productPrice;
                }
            }
            else if (ch==4) {
                System.out.print(" >> 수정할 제품코드를 입력해주세요.");
                String updateCode = scanner.next();

                if(updateCode.equals(productCode1)) {
                    productName1 = "";
                    productPrice1 = 0;
                }
                if(updateCode.equals(productCode2)) {
                    productName2 = "";
                    productPrice2 = 0;
                }
                if(updateCode.equals(productCode3)) {
                    productName3 = "";
                    productPrice3 = 0;
                }
            } else if (ch==5) {
                System.out.println(" >> 프로그램을 종료합니다. ");
                break;
            }else{
                System.out.println(" >> 잘못 입력하신 번호입니다. ");
            }
        }
    }
}
