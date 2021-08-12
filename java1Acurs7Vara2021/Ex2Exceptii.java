public class Ex2Exceptii {
    public static void main(String [] args) {
        try {
            System.out.println("A");
            test(6);
            System.out.println("B");
        } catch(MyCheckedException e) {
            System.out.println("C");
        } catch(AnotherCheckedException e) {
            System.out.println("D");
        }
    }
    public static void test(int x) throws MyCheckedException, AnotherCheckedException{
        if(x > 10) {
            throw new MyCheckedException();
        }
        if(x < 4) {
            throw new AnotherCheckedException();
        }
    }
}