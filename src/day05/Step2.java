package day05;

public class Step2 {
    public static void main(String[] args) {

        //  반복문 왜? >> 동일한 실행을 반복으로 실행

        //  조건문 왜? >> 판단의 흐름 제어

        //  1.
        int num = 1;
        num += 2;
        num += 3;
        num += 4;
        num += 5;
        num += 6;
        num += 7;
        num += 8;
        num += 9;
        num += 10;
        System.out.println(num);
        int num2 = 0;
        for (int i = 1; i <= 10; i++) {
            num2 += i;
        }
        System.out.println(num2);

        //  2.
        int num3 = 0;
        int i = 1;

        while (i <= 10){
            num3 += i;
            i++;
        }
        System.out.println(num3);

        //  * 연산하거나 그 값을 가져다 사용하려면 변수에 반드시 어떤 값을 가지고 있어야 한다.
        //  int sum;
        int sum = 0;
        sum = sum + 3;


        //  무한반복 : 24시간 서비스를 제공할 떄 끊임없이 돌아야하는 경우
//        while (true){
//            System.out.println(" >>loop<< ");
//        }

//        for( ; ; ){
//            System.out.println(" >> loop << ");
//        }
        //  do-while
        int num4 = 1;
        int sum2 = 0; // 0을 대입하는 이유 : sum2에 연산하기 위해 초기값 대입

        do {
            sum2 += num4;
            num4++;
        }while (num4 <= 10);
        System.out.println(sum2);

        //  vs for
        sum2 = 0;
        for (int j = 1; j <=10; j++) {
            sum2 += j;
        }
        System.out.println(sum2);

        //  관례
            // while : 무한루프 while(true){}
            // do-while : 반드시 한 번 이상 수행해야 할 때
            // for : 일반적이다.

        //  for문 중첩

            /*
             외부
             i=2
                내부 j = 1~9
             i=3
                내부 j = 1~9
             i=4
                내부 j = 1~9
             i=5
                내부 j = 1~9
             i=6
                내부 j = 1~9
             i=7
                내부 j = 1~9
             i=8
                내부 j = 1~9
             i=9
                내부 j = 1~9

            */
        //  외부 for문
        for (int j = 2; j <= 9; j++) {
            System.out.println(" dan = " + j);
            //  내부 for문
            for (int k = 1; k <= 9; k++) {
                //  %d : 정수형식, %2d : 2칸 차지 정수
                System.out.printf("%2d * %2d = %2d //" ,j ,k, j * k );
            }
            System.out.println(" ========================= ");
        }

        //  continue : 반복문 안에서 continue문을 만나면 문장은 수행하지 않고 for문의 증감식으로 이동
            // 특정 조건에서는 수행하지 않고 건너 뛰어야 할 때
        int total = 0;
        for (int j = 1; j < 100; j++) {
            //  만약에 j가 짝수라면
            if(j % 2 == 0){
                break;      // 코드의 흐름이 continue; 를 만나면 for문의 증감식으로 이동
            }
            total += j;
        }

        // break;

        // 예제 1 : 1부터 1씩 증가하면서 누적합계가 100미만이면 중지
        int sum3 = 0;
        for (i = 0; sum3 < 100; i++) {
            sum3 += i;
        }
        System.out.println(sum3);

        sum3 = 0;
        for (int j = 0; ; j++) {
            sum3 += j;
            if(sum3 >= 100)
                break;
        }
        System.out.println(sum3);

        sum3 = 0;
        i = 0;
        while (sum3 < 100){
            sum3 += i;
            i++;
        }
        System.out.println(sum3);

        //  문제 1
        int a = 10;
        int b = 2;
        char operator = '+';
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("해당 연산자가 없습니다.");
        }

        //  문제 2
        for (int j = 2; j <= 9; j = j + 2) {
            for (int k = 1; k <= 9; k++) {
                System.out.printf("%2d * %2d = %2d //" ,j ,k, j * k );
            }
            System.out.println(" =============== ");
        }

        //  문제 3
        for (int j = 2; j <= 9; j++) {
            for (int k = 1; k <= 9; k++) {
                System.out.printf("%2d * %2d = %2d //" ,j ,k, j * k );
                if(j==k)
                    break;
            }
            System.out.println(" =============== ");
        }

        // 문제 4
        char c = '*';
        for (int j = 1; j <= 8; j += 2) {
            for (int k = 7; k >= j; k -= 2) {
                System.out.print(" ");
            }
            for (int k = 1; k <= j; k++) {
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
