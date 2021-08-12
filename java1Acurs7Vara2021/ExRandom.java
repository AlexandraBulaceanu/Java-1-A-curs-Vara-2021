import java.util.*;
public class ExRandom {
    public static void main(String [] args) {
        Random r = new Random();
        System.out.println(r.nextInt(301));
        
        System.out.println("Spune un numar: ");
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        //System.out.println("Buna "+line);
        int nr = Integer.parseInt(line);
        System.out.println(nr);
    }
}

