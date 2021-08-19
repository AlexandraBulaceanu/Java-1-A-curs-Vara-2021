public class ExGenerice {
    public static void main(String [] args) {
        Cutie c1;
        
        Cutie<?> c2;
        Cutie<Lego> c3;
        Cutie<Integer> c4;
        Cutie<Number> c5;
        Cutie<? extends Number> c6;
        Cutie<? super Integer> c7;
        
        c1 = new Cutie();
        c2 = new Cutie<Integer>();//instanta c2 o sa aiba un atribut continut de tip Integer
        c2 = new Cutie<int []>();//array e un obiect deci este tip referinta
        c3 = new Cutie<Lego>();
        c4 = new Cutie<Integer>();
        c5 = new Cutie<>();//J7 - sintaxa Diamond
        //c5 = new Cutie<Integer>();//nu tine cont de polimorfism daca e constrangere directa
        c6 = new Cutie<Number>();
        c6 = new Cutie<Integer>();
        c7 = new Cutie<Integer>();
        c7 = new Cutie<Number>();
        c7 = new Cutie<Object>();
    }
}