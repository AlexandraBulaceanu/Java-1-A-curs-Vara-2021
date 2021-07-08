public class ExIfElse {
    public static void main(String [] args) {
        if(7>8) {
            System.out.println("ramura de adevarat");
        } else {
            System.out.println("ramura de fals");
        }
        
        if(false) {
            System.out.println("nu se afiseaza niciodata");
        }
        if(true) {
            System.out.println("se afiseaza mereu");
        }
        boolean b;
        if(b=true) {
            System.out.println("always");
        }
    }
}