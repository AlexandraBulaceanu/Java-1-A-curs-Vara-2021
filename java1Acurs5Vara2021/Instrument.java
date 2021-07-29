public interface Instrument {
    //int x;
    public static final int x = 10;
    String mesaj = "Muzica";
    
    //void play(){}
    public void play();//abstract este pus automat
    
    default void metodaConcreta(){}
    static void metodaStatica(){}
    
    private void metodaPrivata(){}
    
    
}