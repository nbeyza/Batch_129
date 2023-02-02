package day05typecastingstringmanipulations;

public class Tekrar01 {
    public static void main(String[] args) {

        String s = "Java is easy";

        // büyük harf

        String büyük = s.toUpperCase();
        System.out.println(büyük);

        // küçük harf//java kolaydır
       String küçük = s.toLowerCase();
        System.out.println(küçük);

        // ilk karakter
       char ilk = s.charAt(0);

    char iki =   s.charAt(1);
        System.out.print(iki);

      char sondanİki= s.charAt(10);
        System.out.println(sondanİki);


        System.out.println(iki +""+ sondanİki);


       int karekte = s.length();
        System.out.println(karekte);

        String  a = s.substring(0,4);
        System.out.println(a);

       String b = s.substring(5,7);
        System.out.println(b);

      String c=  s.substring(8);
        System.out.println(c);

      Boolean az =  s.contains("money");
        System.out.println(az);

       boolean azx= s.startsWith("Java");
        System.out.println(azx);











    }
}
