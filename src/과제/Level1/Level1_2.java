package 과제.Level1;

public class Level1_2 {
    public static void main(String[] args) {
        System.out.printf("type               value                     range\n");
        System.out.printf("---------------------------------------------------\n");
        boolean b = true;
        System.out.printf("boolean            %s              true of false\n" ,b);
        byte b1 = 100;
        System.out.printf("byte               %d                  -128 ~ 127\n" ,b1);
        char c = 'A';
        System.out.printf("char               %c        0 ~ 65535[character 1]\n" ,c);
        short s = 30000;
        System.out.printf("short              %d            -32768 ~ 32767\n" ,s);
        int i = 2000000000;
        System.out.printf("int                %d       +-2000 million\n" ,i);
        long l = 40000000000L;
        System.out.printf("long               %d +-2000 million Excess\n" ,l);
        float f = 3.123f;
        System.out.printf("float              %.3f          8 decimal places \n" ,f);
        double d = 3.123123123d;
        System.out.printf("double             %.8f    16 decimal places" ,d);
    }
}
