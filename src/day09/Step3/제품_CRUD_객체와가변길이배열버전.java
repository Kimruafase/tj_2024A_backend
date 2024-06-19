package day09.Step3;

import java.util.Scanner;

public class 제품_CRUD_객체와가변길이배열버전 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  제품 메모리 설계
        int count = 0;
        Product[] productList = new Product[count];  //  [ null ] [ null ] [ null ]


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

                count++;

                Product[] newProductList = new Product[count];

                for( int i = 0 ; i<productList.length; i++ ){
                    newProductList[i] = productList[i];
                }
                Product product = new Product();

                product.setCode( productCode1 );
                product.setName( productName1 );
                product.setPrice( productPrice1 );

                newProductList[count-1] = product;

                productList = newProductList;

            } else if (ch==2) {
                System.out.println("============ 제품 목록 ===========");
                for (int i = 0; i < productList.length; i++) {
                    if( !(productList[i] == null)){
                        System.out.printf("%s     %s    %d \n", productList[i].getCode(), productList[i].getName(), productList[i].getPrice());
                    }
                }
            } else if (ch==3) {
                System.out.print(" >> 수정할 제품코드를 입력해주세요.");
                String updateCode = scanner.next();
                System.out.print(" >> 새로운 제품명을 입력해주세요.");
                String productName2 = scanner.next();
                System.out.print(" >> 새로운 제품 가격을 입력해주세요. ");
                int productPrice2 = scanner.nextInt();
                for (int i = 0; i < productList.length; i++) {
                    if (!(productList[i] == null) && productList[i].getCode().equals(updateCode)){

                        productList[i].setName(productName2);
                        productList[i].setPrice(productPrice2);

                        break;
                    }
                }
            }
            else if (ch==4) {
                System.out.print(" >> 삭제할 제품코드를 입력해주세요.");
                String updateCode = scanner.next();
                for (int i = 0; i < productList.length; i++) {
                    if (!(productList[i] == null) && productList[i].getCode().equals(updateCode)){

                        productList[i] = null;


                        break;
                    }
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
