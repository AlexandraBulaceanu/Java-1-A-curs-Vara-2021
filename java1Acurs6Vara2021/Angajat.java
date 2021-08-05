public class Angajat {
    String nume;
    int vechime;
    double salariu;
    
    public Angajat(String nume, int vechime, double salariu) {
        this.nume = nume;
        this.vechime = vechime;
        this.salariu = salariu;
    }
    
    public double calculeazaSalariu() {
        if(this.vechime > 5) {
            this.salariu = this.salariu + 500;
        }
        return this.salariu;
    }
}