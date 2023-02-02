package day05typecastingstringmanipulations;

public class Tekrar02 {
    public static void main(String[] args) {
        String s = "Learn Java earn money";

        //Example 1: "s" String'inin "money" ile bitip bitmediğini kontrol ediniz

        boolean a = s.endsWith("money");
        System.out.println(a);

        //Example 2: "s" String'indeki "money" kelimesini "dollar" kelimesine çeviriniz
        String b =s.replace("money", "dolar");
        System.out.println(b);

        //Example 3: "s" String'indeki "earn" kelimesini "win" kelimesine çeviriniz
      String c=  s.replace("earn", "win");
        System.out.println(c);

        //Example 4: "s" String'indeki "a" harflerini "*" a çeviriniz
       String abc = s.replace("a", "*");
        System.out.println(abc);

        // Example 5: "s" String'indeki "n" harflerini "XXX" a çeviriniz

       String az = s.replace("n", "XXX");
        System.out.println(az);

        //Example 6: "s" String'indeki tüm "e" harflerini siliniz
       String as= s.replace("e", " ");
        System.out.println(as);


        String t = "Ali 13 yasindadir!...";

        //Example 7: "t" String'indeki tüm rakamları "*" a çeviriniz

       String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t);

        //Example 8: "t" String'indeki tüm rakamları ve harfleri "!" e çeviriniz
        String t2 =t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);

        //Example 9: "t" String'indeki tüm sesli harfleri "?" e çeviriniz
       String t3 = t.replaceAll("[aeiouAEİOU]", "?");
        System.out.println(t3);

        //Example 10: "t" String'indeki küçük harfler dışındaki tüm karakterleri "<>" çeviriniz
       String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);

        //Example 11: "t" String'indeki tüm harfler dışındaki tüm karakterleri "+" çeviriniz
       String t5 =  t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);
        //Example 12: "t" String'indeki space'ler disindaki tum character'leri "+" ceviriniz
       String t6 = t.replaceAll("[^ ]", "+");
        System.out.println(t6);


        //Example 13: "t" String'indeki sesli harfler dışındaki tüm karakterleri "&" çeviriniz
       String t7 = t.replaceAll("[^aeiouAEİOU]", "&");
        System.out.println(t7);
    }
}
