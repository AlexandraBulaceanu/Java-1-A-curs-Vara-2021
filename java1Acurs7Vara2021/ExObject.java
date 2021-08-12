public class ExObject {
    public static void main(String [] args) {
        Persoana p1 = new Persoana();
        p1.varsta = 23;
        Persoana p2 = new Persoana();
        p2.varsta = 23;
        System.out.println(p1.equals(p2));
        System.out.println(p1==p2);
        Persoana p3 = p1;
        System.out.println(p1.equals(p3));
        System.out.println(p1==p3);
        
        System.out.println(p1.toString());
        System.out.println(p2);
    }
}