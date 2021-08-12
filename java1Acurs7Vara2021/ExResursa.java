public class ExResursa {
    public static void main(String [] args) {
        ConexiuneBD con1 = null;
        ConexiuneBD con2 = null;
        try {
            con1 = new ConexiuneBD();
            con2 = new ConexiuneBD();
            //folosim resurse
        } catch(Exception e) {
            //tratez exceptia aparuta
        } finally {
            if(con1 != null) {con1.close();}
            if(con2 != null) {con2.close();}
        }
    }
}