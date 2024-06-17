package 과제.Level1;

public class Level1_6 {
    public static void main(String[] args) {
        short s = 48;
        byte s1 = (byte)s;
        System.out.println("byte <- short : "+s1);
        int i = -27648;
        short i1 = (short)i;
        System.out.println("short <- int : "+i1);
        long l = 1345294336L;
        int l1 = (int)l;
        System.out.println("int <- long : "+l1);
        float f = 3.123123123F;
        long f1 = (long) f;
        System.out.println("long <- float : "+f1);
        double d = 3.123123123;
        float d1 = (float)d;
        System.out.println("float <- double : "+d1);
    }
}
