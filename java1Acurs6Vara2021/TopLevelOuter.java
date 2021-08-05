public class TopLevelOuter {
    int x;
    private static int y;
    
    public class InnerNonStatica {
        //clasa TopLevelOuter devine clasa outer pentru InnerNonStatica
        //outer != superioara
        int z;
        int x;
        
        public void m1() {
            this.x = 5;
            //din clasa outer -> outer.this.camp
            TopLevelOuter.this.x = 10;
        }
    }
    
    public static class InnerStatica {
        public void m2() {
            y = 7;
            //x = 5; -> x este non-static => nu e accesibil din inner statica
        }
    }
}
class AltaClasaToplevel{
    
}
