public class ExInner {
    public static void main(String [] args) {
        TopLevelOuter.InnerStatica is = new TopLevelOuter.InnerStatica();
       // TopLevelOuter.InnerNonStatica ins = new TopLevelOuter.InnerNonStatica();
        TopLevelOuter o = new TopLevelOuter();
        TopLevelOuter.InnerNonStatica ins = o.new InnerNonStatica();// instanta ins a clasei 
                                                                  //InnerNonStatica apartine 
                                                                  //instantei o a clasei outer
        System.out.println(o.x);
        ins.m1(); // se comporta ins, dar se modifica o
        System.out.println(o.x);
        System.out.println(ins.x);
        
        Masina masina = new Masina();
        Masina.Motor motor = masina.new Motor();//motorul apartine masinii
        System.out.println(masina.x);
        motor.ruleaza();
        System.out.println(masina.x);
        motor.ruleaza();
        System.out.println(masina.x);
        motor.ruleaza();
        System.out.println(masina.x);
        motor.ruleaza();
        System.out.println(masina.x);
    }
}