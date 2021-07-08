/**
 Se cere afisarea numerelor de la 1 la 10 in consola.
 */
public class ExWhile {
    public static void main(String [] args) {
        int i = 1;
        while(i<=10) {
            System.out.println(i);
            i++;
        }
        
        while(true) {
            break;
        }
        
        System.out.println("niciodata - unreachable statement");
        
       //while(false){}
       boolean a = false;
       while(a) {
           System.out.println("niciodata");
       }
       while(a==false); {//!!!!
           System.out.println("expr booleana validata cu true");
           a = true;
       }
       
       i = 1;
       do {
            System.out.println(i);
            i++;
       }while(i<=10);
       System.out.println("la iesirea din do-while"+i);
    }
}