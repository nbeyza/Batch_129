package intor;

import java.util.Scanner;

public class DenemeTekrer {
    public static void main(String[] args) {
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         *
         */

        String ı = "ısparta";

       Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir isim giriniz");
       String a= input.nextLine();



       for(int i=0;i<=0;i++){

           char ch =a.charAt(i);

           System.out.print('ı');


           for (int k=ı.length()-1; k>0; k++){

               char ch2=  a.charAt(k);

               System.out.print('a');
           }
           System.out.println();

       }









       /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

          /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */



    }
}
