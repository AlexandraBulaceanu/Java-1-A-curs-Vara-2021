public class Consumator extends Thread {
    public Consumator(String nume) {
        super(nume);
    }
    
    @Override
    public void run() {
        try{
            while(true) {
                synchronized(ExProdCons.list){
                    //monitor = lista, deoarece e vizibila pt toti
                    //un singfur fir de executie poate sa intre la un moment dat pe aici
                    //pana nu eliberez lista, nu o poate utiliza nimeni
                    if(!ExProdCons.list.isEmpty()) {
                        int elem = ExProdCons.list.get(0);
                        ExProdCons.list.remove(0);
                        ExProdCons.list.notifyAll();//consumatorul va anunta producatorul de micsorarea dimensiunii listei
                        System.out.println("A fost eliminat: "+elem);
                    }else{
                        ExProdCons.list.wait();//consumatorul asteapta ca un producator sa adauge un element in lista
                    }
                }
                
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}