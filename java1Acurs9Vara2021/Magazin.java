import java.util.*;
public class Magazin {
    
    private Magazin(){
        
    }
    private List<Produs> produse = new ArrayList<>();
    private static Magazin instance;
    public static Magazin getInstance() {
        if(instance == null) {
            instance = new Magazin();
        }
        return instance;
    }
    
    public void adaugaProdus(Produs p) {
        if(produse.size()<20) {
            produse.add(p);
        } else {
            throw new PreaMulteProduseException();
        }
    }
    
    public void afisareProduse() {
        produse.forEach(System.out::println);
    }
    
    public void afisareCioco() {
        for(Produs p:produse) {
            if(p instanceof Cioco) {
                System.out.println(p);
            }
        }
    }
    
    public void sterge(String nume) {
        for(int i=0; i< produse.size(); i++) {
            if(produse.get(i).nume.equals(nume)) {
                produse.remove(produse.get(i));
            }
        }
    }
}