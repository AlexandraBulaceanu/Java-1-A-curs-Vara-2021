import java.util.*;
public class Producator extends Thread {
    public Producator(String nume) {
        super(nume);
    }
    private Random r = new Random();
    @Override
    public void run() {
        try{
            while(true) {
                synchronized(ExProdCons.list) {
                    if(ExProdCons.list.size()<20) {
                        int el = r.nextInt();
                        ExProdCons.list.add(el);
                        ExProdCons.list.notifyAll();//producatorul anunta consumatorii ca au fost adugate elem in lista
                        //scot din asteptare
                        System.out.println("A fost adaugat: "+el);
                    }else {
                        ExProdCons.list.wait();//producatorul asteapta ca un consumator sa elimine elemente
                    }
                
                }
                
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}