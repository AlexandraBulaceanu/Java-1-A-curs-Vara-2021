public class Dreptunghi extends Forma {
    int h = 6;
    
    @Override
    public double getArie() {
        return this.l*this.h; // obligatie de a suprascrie metoda abstacta mostenita 
                    // daca las cls Dreptunghi concreta
    }
}