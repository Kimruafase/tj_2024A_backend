package day09.Step3;

import java.util.Scanner;

public class 제품_CRUD_배열버전 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  제품 메모리 설계
        String[] productCode = new String[3];
        String[] productName = new String[3];
        int[] productPrice = new int[3];

        while (true){
            System.out.print(" >> 1. 등록(C) 2. 출력(R) 3. 수정(U) 4. 삭제(D) : ");  // 무한 출력
            int ch = scanner.nextInt();                                          // 무한 입력
            if (ch==1){
                System.out.print(" >> 제품코드를 입력해주세요.");
                String productCode1 = scanner.next();
                System.out.print(" >> 제품명을 입력해주세요.");
                String productName1 = scanner.next();
                System.out.print(" >> 제품가격을 입력해주세요.");
                int productPrice1 = scanner.nextInt();
                if (productPrice[0] == 0){
                    productCode[0] = productCode1;
                    productName[0] = productName1;
                    productPrice[0] = productPrice1;
                } else if (productPrice[1] == 0) {
                    productCode[1] = productCode1;
                    productName[1] = productName1;
                    productPrice[1] = productPrice1;
                } else if (productPrice[2] == 0) {
                    productCode[2] = productCode1;
                    productName[2] = productName1;
                    productPrice[2] = productPrice1;
                }else{
                    System.out.println(" [경고] 제품 등록 자리가 부족합니다.");
                }
            } else if (ch==2) {
                System.out.println("============ 제품 목록 ===========");
                if( !(productPrice[0] == 0)){
                    System.out.printf("%s     %s    %d \n",productCode[0],productName[0],productPrice[0]);
                } if(!(productPrice[1] == 0)){
                    System.out.printf("%s     %s    %d \n",productCode[1],productName[1],productPrice[1]);
                }  if (!(productPrice[2] == 0)) {
                    System.out.printf("%s     %s    %d \n",productCode[2],productName[2],productPrice[2]);
                }
            } else if (ch==3) {
                System.out.print(" >> 수정할 제품코드를 입력해주세요.");
                String updateCode = scanner.next();
                System.out.print(" >> 새로운 제품명을 입력해주세요.");
                String productName2 = scanner.next();
                System.out.print(" >> 새로운 제품 가격을 입력해주세요. ");
                int productPrice2 = scanner.nextInt();
                if(productCode[0].equals(updateCode)) {
                    productName[0] = productName2;
                    productPrice[0] = productPrice2;
                }
                if(productCode[1].equals(updateCode)) {
                    productName[1] = productName2;
                    productPrice[1] = productPrice2;
                }
                if(productCode[2].equals(updateCode)) {
                    productName[2] = productName2;
                    productPrice[2] = productPrice2;
                }
            }
            else if (ch==4) {
                System.out.print(" >> 삭제할 제품코드를 입력해주세요.");
                String updateCode = scanner.next();

                if(productCode[0].equals(updateCode)) {
                    productName[0] = "";
                    productPrice[0] = 0;
                }
                if(productCode[1].equals(updateCode)) {
                    productName[1] = "";
                    productPrice[1] = 0;
                }
                if(productCode[2].equals(updateCode)) {
                    productName[2] = "";
                    productPrice[2] = 0;
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
