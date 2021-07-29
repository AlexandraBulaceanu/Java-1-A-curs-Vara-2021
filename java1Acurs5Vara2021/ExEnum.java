public class ExEnum {
    public static void main(String [] args) {
        Cafea c1 = Cafea.BIG;
        switch(c1) {
            case BIG:
            case EXTRA_LARGE:
                                System.out.println("Mai bine dormi");
                                break;
            case MEDIUM:     System.out.println("E ok");
                            break;
            case SMALL:     System.out.println("E ok");
                            break;
        }
        
        for(Cafea c : Cafea.values()) {
            System.out.println(c+" "+c.ordinal()+" "+c.name());
        }
    } 
}