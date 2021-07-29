public abstract class Forma {
    String nume;
    int l;
    
    public abstract double getArie();// metoda abstracta -> fara corp de metoda/fara functionalitate
    //ceva general
    public void afisareNume() {
        System.out.println(nume);// metoda concreta
    }
    
    //final + abstract -> eroare de compilare
}