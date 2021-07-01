/**
         Aceasta este o clasa ce exemplifica primitivele.
         @author Alexandra
         @version 1.01
 */

public class ExPrimitive {
    public static void main(String [] args) {
        byte b1;
        b1 = 10;
        byte b2 = 20;
        b2 = 90;
        short s1 = 10, s2 = 9, s3 = 8;
        
        short s4, s5, s6;
        s4 = s5 = s6 = 10;
        int i1 = 34;
        long l1 = 10;
        int q1 = 04;
        int q2 = 0xFA;
        int q3 = 0b1010101;
        System.out.println(q3);
        long l2 = 1_000_000;
        long l3 = 10000000000L;
        //int a = 10L;
        float f1 = 10.5f;
        float f2 = (float)10.7;
        double d1 = 10.8;
        boolean bool1 = true;
        boolean bool2 = false;
        char c1 = 'a';
        char c2 = '\u0235';
        char c3 = '\n';
        System.out.println(c2);
        System.out.println(l1);
        /*
         acesta
         este
         un comentariu
         pe mai multe linii
        */
        String sir = "cuvant";
        System.out.println(sir);
        
    }
}