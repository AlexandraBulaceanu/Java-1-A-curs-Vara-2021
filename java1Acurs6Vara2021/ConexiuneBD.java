public class ConexiuneBD {
    //singleton
    private ConexiuneBD() {
        
    }
    
    private static ConexiuneBD SINGLETON;
    
    public static ConexiuneBD getInstance() {
        if(SINGLETON == null) {
            SINGLETON = new ConexiuneBD();
        }
        return SINGLETON;
    } 
    
    
}