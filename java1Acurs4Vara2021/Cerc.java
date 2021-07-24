public class Cerc extends Punct {
    double raza;//adaugare de atribut
    String x;//modificare atribut = ascunderea campurilor = hiding fields
    //o clasa finala nu mai poate sa fie mostenita
    public double getArie() {
        return 3.14*this.raza*this.raza; //adaugare de comportament
    }
    //metofa final -> nu mai poate fi suprascrisa
    
    public double getLungime() {
        return 2*3.14*this.raza;
    }
    
    public Cerc() {
        this(0);
    }
    
    public Cerc(double raza) {
        super(0,1);
        this.raza = raza;
        this.x = "seara";
        //this.x = 10;
        super.x = 10;
        super.y = 23;
        this.y = 12;
        //super.raza = 2.3;
    }
    
}