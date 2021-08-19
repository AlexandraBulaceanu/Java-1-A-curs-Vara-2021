public class Cutie<T> {
    //int continut;
    T continut;
    //static T y;
    public Cutie(T continut) {
        this.continut = continut;
    }
    public Cutie(){}
    public T metoda() {
        return continut;
    }
    public void metoda2(T p) {}
    //public static void metoda3(T a){}
    public static <Q> void metoda3(Q a){} //Cutie.<Integer>metoda3(3) - apelul
}