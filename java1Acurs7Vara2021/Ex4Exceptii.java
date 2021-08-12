public class Ex4Exceptii {
    public static void main(String [] args) {
        try {
            System.out.println("A");
            test(6);
            System.out.println("B");
        } catch(E2 e) {
            System.out.println("D");
        } catch(E1 e) {
            System.out.println("C");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void test(int x) throws E1{
        if(x > 10) {
            throw new E2();
        }
        if(x < 4) {
            throw new E1();
        }
    }
}