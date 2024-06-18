package day09.Step3;

import java.util.Scanner;

public class 제품_CRUD_함수활용객체와배열버전 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        //  제품 메모리 설계
//        product[] productList = new product[3];
//
//        while (true){
//            System.out.print(" >> 1. 등록(C) 2. 출력(R) 3. 수정(U) 4. 삭제(D) : ");  // 무한 출력
//            int ch = scanner.nextInt();                                          // 무한 입력
//            if (ch==1){
//                System.out.print(" >> 제품코드를 입력해주세요.");
//                String productCode1 = scanner.next();
//                System.out.print(" >> 제품명을 입력해주세요.");
//                String productName1 = scanner.next();
//                System.out.print(" >> 제품가격을 입력해주세요.");
//                int productPrice1 = scanner.nextInt();
//                if (productList[0].price == 0){
//                    productList[0].code = productCode1;
//                    productList[0].name = productName1;
//                    productList[0].price = productPrice1;
//                } else if (productList[1].price == 0) {
//                    productList[1].code = productCode1;
//                    productList[1].name = productName1;
//                    productList[1].price = productPrice1;
//                } else if (productList[2].price == 0) {
//                    productList[2].code = productCode1;
//                    productList[2].name = productName1;
//                    productList[2].price = productPrice1;
//                }else{
//                    System.out.println(" [경고] 제품 등록 자리가 부족합니다.");
//                }
//            } else if (ch==2) {
//                System.out.println("============ 제품 목록 ===========");
//                if( !(productList[0].price == 0)){
//                    System.out.printf("%s     %s    %d \n",productList[0].code,productList[0].name,productList[0].price);
//                } if(!(productList[1].price == 0)){
//                    System.out.printf("%s     %s    %d \n",productList[1].code,productList[1].name,productList[1].price);
//                }  if (!(productList[2].price == 0)) {
//                    System.out.printf("%s     %s    %d \n",productList[2].code,productList[2].name,productList[2].price);
//                }
//            } else if (ch==3) {
//                System.out.print(" >> 수정할 제품코드를 입력해주세요.");
//                String updateCode = scanner.next();
//                System.out.print(" >> 새로운 제품명을 입력해주세요.");
//                String productName2 = scanner.next();
//                System.out.print(" >> 새로운 제품 가격을 입력해주세요. ");
//                int productPrice2 = scanner.nextInt();
//                if(productList[0].code.equals(updateCode)) {
//                    productList[0].name = productName2;
//                    productList[0].price = productPrice2;
//                }
//                if(productList[1].code.equals(updateCode)) {
//                    productList[1].name = productName2;
//                    productList[1].price = productPrice2;
//                }
//                if(productList[2].code.equals(updateCode)) {
//                    productList[2].name = productName2;
//                    productList[2].price = productPrice2;
//                }
//            }
//            else if (ch==4) {
//                System.out.print(" >> 삭제할 제품코드를 입력해주세요.");
//                String updateCode = scanner.next();
//
//                if(productList[0].code.equals(updateCode)) {
//                    productList[0].name = "";
//                    productList[0].price = 0;
//                }
//                if(productList[1].code.equals(updateCode)) {
//                    productList[1].name = "";
//                    productList[1].price = 0;
//                }
//                if(productList[2].code.equals(updateCode)) {
//                    productList[2].name = "";
//                    productList[2].price = 0;
//                }
//            } else if (ch==5) {
//                System.out.println(" >> 프로그램을 종료합니다. ");
//                break;
//            }else{
//                System.out.println(" >> 잘못 입력하신 번호입니다. ");
//            }
//        }
//    }
}
