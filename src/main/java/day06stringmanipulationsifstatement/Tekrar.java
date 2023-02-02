package day06stringmanipulationsifstatement;

public class Tekrar {


    public static void main(String[] args) {

        //Example 1: Bir String'in bas ve sonunda space caharacter'i varsa siliniz.
        //             "   Ali Can   "     ==>      "Ali Can"
        String a = "   Ali Can   ";
        String b = a.trim();
        System.out.println(b);

        //Example 2: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
         String tv = "$456.99";
         String laptop = "$875.99";

       String tv1=  tv.replace("$", " ");
       String laptop1 = laptop.replace("$", " ");

        double top = Double.valueOf(tv1)+ Double.valueOf(laptop1);
        System.out.println(top);

        //Example 3: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz
        String name = "    ali cAN    ";
        char name1 = name.trim().toUpperCase().charAt(0);
        System.out.println(name1);
        char name2 = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(name2);

        //Example 4: Bir String'in hic character icermedigini(Bos String) kontrol eden kodu yaziniz
        String str = "";
        boolean krk = str.length()==0;
        System.out.println(krk);

       boolean krk1= str.isEmpty();
        System.out.println(krk1);

        //Example 5: Bir String'in space haric hicbir character icermedigini kontrol eden kodu yaziniz
        String t = "        ";
       boolean t1=    t.replace(" ", "").length()==0;
        System.out.println(t1);

        boolean t2 = t.replace(" ", "").isEmpty();
        System.out.println(t2);

        boolean t3 = t.isBlank();
        System.out.println(t3);

        //Example 6: Bir String'de a, i, e character'lerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz
                String az = "Java is easy to learn";

        int az1=   az.indexOf('a');
        int az2 =  az.indexOf('i');
        int az3 = az.indexOf('e');

        System.out.println(az1+az2+az3);


        //Example 7: Bir String'de a, i, e character'lerinin "son" gorunumlerinin indexleri toplamini ekrana yazdiriniz
        String sn= "Java is easy to learn";
       int sn1 = sn.lastIndexOf('a');
      int sn2 =  sn.lastIndexOf('i');
        int sn3 =sn.lastIndexOf('e');
        System.out.println(sn1+sn2+sn3);

        //Example 7: Bir String'de "Java" kelime'sinin ilk olarak kacinci index'de kullanildigini gosteren kodu yaziniz.
        String j=     "Ah Java vah Java sensiz olmuyor Java.";
             int j1 =j.indexOf("Java");
        System.out.println(j1);


        //Example 9: Bir String'deki tekrarsiz character'leri ekrana yazdiriniz.
        String y = "aac";

        char as =y.charAt(0);
       if(y.indexOf(as)==y.lastIndexOf(as)){
            System.out.println(as);
        }
        char as1=y.charAt(1);
       if(y.indexOf(as1)==y.lastIndexOf(as1)){
           System.out.println(as1);

       }
       char as2 = y.charAt(2);
       if(y.indexOf(as2)==y.lastIndexOf(as2)){
           System.out.println(as2);

       }

        //Example 10: Sayi pozitif ise ekrana pozitif yazdirin.
        int num = 12;

       if(num>0){
           System.out.println("pozitif");

       }


       //Example 11: Sayi -1 ile 10 arasinda ekrana "Rakam" yazdirin
        int number = 5;


       if(number>-1 && number<10){
           System.out.println("rakam");

}
       //Example 12: Sayi uc basamakli ise ekrana "Wooow!" yazdirin.
        int n = -123;

       n= Math.abs(n);

       if(n>99&& n<1000){
           System.out.println("woooow");

       }



    }

}