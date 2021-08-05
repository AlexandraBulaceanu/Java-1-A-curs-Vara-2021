public class ExTipuriAnonime {
    public static void main(String [] args) {
        Angajat a1 = new Angajat("Razvan",7,3000);
        Angajat a2 = new Angajat("Mihaela",3,1000);
        Angajat a3 = new Angajat("Alexandra",6,4000);
        Angajat a4 = new Angajat("Marcel",1,1500){
            @Override
            public double calculeazaSalariu() {
                this.salariu = 5000;
                return this.salariu;
            }
        };
        
        System.out.println(a1.calculeazaSalariu());
        System.out.println(a2.calculeazaSalariu());
        System.out.println(a3.calculeazaSalariu());
        System.out.println(a4.calculeazaSalariu());
        
        Instrument i = new Instrument(){
            @Override
            public void play() {
                
            }
        };
        
        Instrument i2 = () -> {};
    }
}