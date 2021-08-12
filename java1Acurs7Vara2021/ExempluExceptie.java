public class ExempluExceptie{
    public static void main(String [] args) {
        System.out.println("incercam sa scoatem 500 de lei de pe card");
        //extragereBani(500);//aici trebuie tratata - TEMA
        System.out.println("operatiune realizata cu succes");
    }
    public static void extragereBani(double suma) throws MyCheckedException{
        if(suma > 300) {
            MyCheckedException e = new MyCheckedException();
            throw e; // arunc instanta de exceptie = semnalat aparitia situatiei de exceptie
        }
    }
}