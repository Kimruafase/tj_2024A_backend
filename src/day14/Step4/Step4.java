package day14.Step4;

public class Step4 {
    public static void main(String[] args) {

        //  객체 생성
        Customer customer = new Customer();

        //  customer 타입이 buy 타입으로 변환(자동 타입 변환)
        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        //  customer 타입이 sell 타입으로 변환(자동 타입 변환)
        Sell seller = customer;
        seller.sell();
        seller.order();

        //  seller 타입이 Customer 타입에 포함이 되었다면
        if(seller instanceof Customer){
            Customer customer2 = (Customer) seller;
            customer2.buy();
            customer2.sell();
        }
        customer.order();
    }
}
