public class ClaseLocale {
    int x;
    static int y;
    
    public void m1() {
        int z = 20;
        class LocalaInContextNonStatic {
            //nu am voie cu mod de acces
            public void m() {
                //z = 9;
            }
        }
    }
    
    public static void m2() {
        class LocalaInContextStatic {
            public void m3() {
                y = 4;
            }
        }
    }
}