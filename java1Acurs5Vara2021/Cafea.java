public enum Cafea {
    SMALL, MEDIUM, BIG(500), EXTRA_LARGE;
    
    private int cantitate;
    
    Cafea() {}
    Cafea(int cantitatea) {
        this.cantitate = cantitate;
    }
    
    public void afisareCantitate() {
        System.out.println(cantitate);
    }
}