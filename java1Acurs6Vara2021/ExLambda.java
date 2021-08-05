public class ExLambda {
    public static void main(String [] args) {
        Predicat p1 = (x) -> x>10;
        Predicat p2 = x -> x<3; // pot sa lipseasca parantezele pt un sg param fara tip
        Predicat p3 = (int x) -> x>7;
        Predicat p4 = x -> {return x>4;};
        Predicat p5 = x -> false;
        
        Functie f1 = (x,y) -> 20;
        Functie f2 = (int x, int y) -> x+y;
        Functie f3 = (int x, int y) -> {return x+y;};
        
        m((x,y)->x+y,10,20);
        //(10,20)->10+20=30
        m((x,y)->x*y,10,20);
        m(f1,10,20);
    }
    
    public static void m(Functie f, int a, int b) {
        System.out.println(f.operatie(a,b));
    }
    
    //Operator de referinta la metoda
    //(e) -> System.out.println(e); => System.out::println
    //metoda statica -> NumeClasei::numeMetodaStatica
    //metoda non-statica -> NumeInstanta::numeComportament
}