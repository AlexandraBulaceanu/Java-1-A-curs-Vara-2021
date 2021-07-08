public class ExPisica {
    public static void main(String [] args) {
        Pisica p1;
        int a;
        a = 3;
        Pisica p2;
        p1 = new Pisica("Kitty",18,"gri");
        Pisica p3 = new Pisica("Tom",2,"alb");
        System.out.println(p1.nume);//"Kitty"
        System.out.println(p1.greutate);//0.0
        System.out.println(p3.varsta);//2
        Pisica p = new Pisica(p3);
        
        p2 = p1;
        System.out.println(p2.nume);
        p2.greutate = 4.5;
        System.out.println(p2.greutate);
        
        p1.spuneMiau();
        p3.spuneMiau();
    }
}