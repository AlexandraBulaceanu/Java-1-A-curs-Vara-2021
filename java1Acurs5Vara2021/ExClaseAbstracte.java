public class ExClaseAbstracte {
    public static void main(String [] args) {
        //Forma f = new Forma(); -> nu am voie sa instantiez in mod direct
        Forma f1 = new Dreptunghi();
        System.out.println(f1.getArie());
        
        Forma[] forme = new Forma[3];
        forme[0] = new Dreptunghi();
        forme[1] = new Patrat();
        forme[2] = new Sfera();
        
        Instrument i1;
        i1 = new Pian();
        i1.play();
    }

}