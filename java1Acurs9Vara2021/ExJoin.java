public class ExJoin {
    public static void main(String [] args) {
        long tStart = System.currentTimeMillis();
        /*collectDataFromDB1();
        collectDataFromDB2();*/
        Thread t1 = new Thread(()->collectDataFromDB1());
        Thread t2 = new Thread(()->collectDataFromDB2());
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();//main asteapta dupa terminarea lui t1 si t2
            //colectarea/preluarea de date -> in paralel pe 2 fire de executie(t1,t2)
            //procesarea se realizeaza dupa terminarea ambelor fire, pe main
        }catch(InterruptedException e) {
            //tratam
        }
        long tFinal = System.currentTimeMillis();
        System.out.println(tFinal - tStart);
    }
    public static void collectDataFromDB1() {
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void collectDataFromDB2() {
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}