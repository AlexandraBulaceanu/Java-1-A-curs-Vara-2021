public class ExPolimorfism {
    public static void main(String [] args) {
        Reptila r1 = new Reptila();
        Crocodil c1 = new Crocodil();
        Reptila a = new Crocodil(); //polimorfismul
        //Reptila -> forma
        //a -> referinta de tipul cls superioare si arata catre o instanta de Crocodil
        //Crocodil -> instanta efectiva care se creeaza in memorie, dar ia forma de Reptila
        a.greutate = 40;
        //a.lungimeCoada = 5; -> am incercat sa accesez o caracteristica ce nu apartine formei
                                 //caracteristici = atribute + comportamente
        System.out.println(a.temperaturaCorp);// pt atribute -> pastreaza valoarea din forma
        a.afisareDenumire();//se apeleaza suprascrierea pt comportamente -> instanta
        
        Reptila s = new Sarpe();
        Reptila b = new SarpeBoa();
        
        Crocodil c2 = (Crocodil)a;
        c2.lungimeCoada = 6;
       //Crocodil c3 = (Crocodil)r1; --> ClassCastException
       //Crocodil c5 = new Reptila();
       Object o = new Reptila();
       Reptila r = (Reptila)o;
       
       Object o1 = new Sarpe();
       r = (Reptila)o1;
       
       String mesaj = "nup";
       //Crocodil c4 = (Crocodil)mesaj; --> eroare de compilare
       //SarpeBoa s1 = (SarpeBoa)s; --> ClassCastException
         SarpeBoa s2 = (SarpeBoa)b;
         
         //instanceof
         if(c1 instanceof Crocodil) {
            System.out.println("c1 este un crocodil");
         }
         if(s instanceof SarpeBoa) {
            System.out.println("s este un sarpe boa");
         }
         if(null instanceof Reptila) {
            System.out.println("nup");
         }
    }
}