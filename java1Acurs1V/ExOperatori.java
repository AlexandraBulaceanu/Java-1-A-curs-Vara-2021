public class ExOperatori {
    public static void main(String [] args) {
        boolean b1 = 4>5;//false
        boolean b2 = 6==6;//true
        boolean b3 = 7!=8;//true
        boolean b4 = 5<=9;//true
        boolean b6 = true;
        boolean b7 = false;
        int a=8;
        int b=2;
        
        boolean b9 = b7&&((a=b)==b);//false, fara evaluarea expresiei ((a=b)==b)
        boolean b10 = b7||((a=b)==b);//true, s-a uitat in dreapta
        boolean b11 = ((a=b)==b)||b7;//true, nu se mai uita in dreapta
        boolean b12 = 7>3&&false;//false, s-a uitat in dreapta
    }
}