public class ExString {
    public static void main(String [] args) {
        String s = "programare";
                 // 0123456789  
        System.out.println(s.charAt(2));
        System.out.println(s.indexOf('m'));
        System.out.println(s.contains("gra"));
        System.out.println("buna".compareTo("Bau"));
        System.out.println("buna".compareToIgnoreCase("Bau"));
        System.out.println("buna".equals("buna"));
        System.out.println(s.startsWith("pro"));
        System.out.println(s.endsWith("nare"));
        System.out.println(s.length());
        System.out.println("AbC".toLowerCase());
        System.out.println("AbC".toUpperCase());
        System.out.println(s.substring(2,6)); //=>[2,6)
        System.out.println(s.substring(5));
        //System.out.println(s.substring(6,2));
        System.out.println(s.substring(2,10));
        //System.out.println(s.substring(2,11));
        System.out.println(" buna hei ".trim());
        System.out.println("buna".concat("Andrei"));
        System.out.println(s.replace("ro","jk"));
        System.out.println(String.valueOf(5));
        
        //J15
        /*
        String text = """ Textul acesta
                          este pe mai multe
                          linii """;*/ //text blocks
    }
}