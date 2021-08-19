public class ExPredicat {
    public static void main(String [] args) {
        Predicat<String> p = new Predicat<>(){
            @Override
            public boolean test(String s) {
                return s.length()%2==0;
            }
        };
        Predicat<Integer> p1 = x -> x>5;
        Predicat<Lego> p2 = l -> l.culoare.equals("albastru");
        Predicat<String> p3 = s -> s.length()%2==0;
    }
}