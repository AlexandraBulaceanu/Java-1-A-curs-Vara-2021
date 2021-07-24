public class ExMostenire {
    String test;
    
    public static void main(String [] args) {
        //test = "Fail";
        //ExMostenire ex = new ExempluMostenire();
       // ex.m();
       Cerc c = new Cerc(2.4);
       c.y = 40;
       Cilindru cil = new Cilindru();
       System.out.println("aria cercului "+ c.getArie());
       System.out.println("aria cilindrului "+ cil.getArie());
    }
    
    static void m() {}
}