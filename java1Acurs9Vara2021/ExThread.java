public class ExThread {
    public static void main(String [] args) {
        
        NrImpareThread t1 = new NrImpareThread();//NEW
        //t1.run(); -> as rula instructiunile pe ac fir cu main
        t1.start();//RUNNABLE -> JVM  o sa decida cand trece in RUNNING
        NrPareThread task = new NrPareThread();
        Thread t2 = new Thread(task);//mecanismul efectiv de fir de executie - NEW
        t2.start();
        
        System.out.println("de pe main");
    }
}