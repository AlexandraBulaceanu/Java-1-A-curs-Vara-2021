public class Pisica {
    String nume;
    int varsta;
    String culoare;
    double greutate;
    
    /*Pisica() {
        
    }*/
    Pisica(String nume, int varsta, String culoare) {
        this.nume = nume;
        this.varsta = varsta;
        this.culoare = culoare;
        this.spuneMiau();
    }
    
    Pisica(Pisica p) {
        this.nume = p.nume;
    }
    
    void spuneMiau() {
       if(this.varsta > 2) System.out.println("Miau! Ma cheama "+this.nume);
    }
}