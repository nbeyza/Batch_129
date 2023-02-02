package day10switchloops;

public class ForLoopTekrar01 {
    public static void main(String[] args) {

        //Example 2: 11'den 14'e kadar tum tamsayilari ekrana yazdiran kodu yaziniz

        for (int i = 11; i <= 14; i++) {
            System.out.println(i);

        }

        //5 defa "Hİ" yazdır

        for (int i = 1; i <= 5; i++) {
            System.out.println("   " + i);
        }
//Example 3: 40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz
        for (int i = 40; i > 23; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //Example 4: 18'den 56'ya kadar tum tek tamsayilari ekrana yazdiran kodu yaziniz
        for (int i = 18; i < 56; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
        System.out.println();
//Example 1: 21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari ekrana yazdiran kodu yaziniz
        for (int i = 21; i <= 180; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.println(i);
            }
        }

        //Example 2: Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan caharacter'lerini buyuk harf yapiniz

        String s = "ankara";

        for (int i = 0; i < s.length(); i++) {

            if (i % 2 == 0) {


                String a = s.substring(i, i + 1);


                System.out.println(a.toUpperCase());

            }
        }










    }
        }








