/**
 Se cere afisarea numerelor de la 1 la 10 in consola. -  cu for
 */
public class ExFor {
    public static void main(String [] args) {
       
        for(int i = 1; i<=10; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        int i = 1;
        for(;;) {
            if(i<=10) {
                System.out.println(i);
                i++;
            } else {
                break;
            }
            
        }
        for(int k=2,h=3;(k<=5)&&(h>=4);k++,h--) {
            System.out.println(k+" "+h);
        }
    }
}