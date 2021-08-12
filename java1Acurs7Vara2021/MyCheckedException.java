public class MyCheckedException extends Exception {
    public MyCheckedException() {
        super("Aceasta este o exceptie checked care trebuie fie tratata fie propagata");
    }
}