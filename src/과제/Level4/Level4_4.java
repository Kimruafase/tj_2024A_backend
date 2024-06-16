package 과제.Level4;

public class Level4_4 {
    public static void main(String[] args) {
        product product1 = new product();
        product product2 = new product();

        product1.productCode = 10245;
        product2.productCode = 24123;

        product1.productName = "신라면";
        product2.productName = "육개장";

        product1.productPrice = 1200;
        product2.productPrice = 800;

        product1.productRegDate = "2000-11-23";
        product2.productRegDate = "2004-05-14";

        System.out.println(" 제품 코드 : " + product1.productCode);
        System.out.println(" 제품명 : " + product1.productName);
        System.out.println(" 가격 : " + product1.productPrice);
        System.out.println(" 등록일 : " + product1.productRegDate);
        System.out.println();
        System.out.println(" 제품 코드 : " + product2.productCode);
        System.out.println(" 제품명 : " + product2.productName);
        System.out.println(" 가격 : " + product2.productPrice);
        System.out.println(" 등록일 : " + product2.productRegDate);
    }
}
