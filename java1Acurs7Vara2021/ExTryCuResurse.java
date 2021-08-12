public class ExTryCuResurse {
    public static void main(String [] args) {
        try(ConexiuneBD con1 = new ConexiuneBD();
            ConexiuneBD con2 = new ConexiuneBD()){
            //utilizam resursele
        }catch(Exception e) {
            //e = exceptie principala = prima exceptie care se va arunca
            //restul exceptiilor vor fi ascunse -> stocate intr un vector suppresed
            System.out.println(e.getMessage());
            Throwable[] suppressed = e.getSuppressed();
            for(Throwable t:suppressed) {
                System.out.println(t);
            }
        }finally {
            System.out.println("finally explicit");
        }
    }
}