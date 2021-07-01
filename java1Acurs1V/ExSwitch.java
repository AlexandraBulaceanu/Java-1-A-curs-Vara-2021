//Avem o variabila de tip int de la 1 la 7. In functie de valoarea variabilei voi afisa ziua saptamanii 
//ce corespunde numarului zilei din saptamana.
//de ex: 1 - Luni; 3 - Miercuri
//Pt zilele de weekend(sambata si duminica) - afisare mesaj "E weekened"
//Pt o zi invalida - "Invalid" 
public class ExSwitch {
    public static void main(String [] args) {
        int zi = 11;
        switch(zi) {
            case 1: System.out.println("Luni");
                    break;
            case 2: System.out.println("Marti");
                    break;
            case 3: System.out.println("Miercuri");
                    break;
            case 4: System.out.println("Joi");
                    break;
            case 5: System.out.println("Vineri");    
                    break;
            case 6:
            case 7: System.out.println("Este weekend!");
                    break;
            default: System.out.println("Invalid!");
        }
    }
}