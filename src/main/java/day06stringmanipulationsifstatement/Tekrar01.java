package day06stringmanipulationsifstatement;

public class Tekrar01 {
    public static void main(String[] args) {


//Example 9: Bir String'deki tekrarsiz character'leri ekrana yazdiriniz.
        //           abbccdc ==> ad



        String y = "aac";

       char a = y.charAt(0);

       if(y.indexOf(a)==y.lastIndexOf(a)) {
           System.out.println(a);
       }
      char b = y.charAt(1);
       if(y.indexOf(b)==y.lastIndexOf(b)){
           System.out.println(b);
       }
        char c = y.charAt(2);
        if(y.indexOf(c)==y.lastIndexOf(c)) {
            System.out.println(c);
        }


//Example 3: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "Ali Can" ==> AC
        String name = "    ali cAN    ";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);// A

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second); // C

        System.out.println(""+ first + second);// AC
        System.out.println(  first + second);// 132


    }
}
