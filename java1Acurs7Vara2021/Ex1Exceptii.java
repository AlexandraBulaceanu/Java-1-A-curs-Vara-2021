public class Ex1Exceptii {
    public static void main(String [] args) {
        try {
            System.out.println("A");
            if(5==5) throw new MyRuntimeException();
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
    }
}