public class Ex3Exceptii {
    public static void main(String [] args) {
        try {
            System.out.println("A");
            test(3);
            System.out.println("B");
        } catch(MyCheckedException|AnotherCheckedException e) {
            System.out.println(e.getMessage());
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