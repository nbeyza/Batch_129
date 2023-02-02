package day08nestedifternary;

import java.util.Scanner;

public class NestedIf01Tekrar {
    public static void main(String[] args) {

        /*
          Example 1: Kullanicidan 3 tane sayi aliniz.
                     Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                     Eger ucgen ise “eskenar”
                     Ucgen olma durumunu
                     kontrol ediniz.
                     INFO :
                     Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                       herhangi iki kenar farki ucuncu kenardan kucuk olmali
                     a+b>c>a-b
                     a+c>b>a-c
                     b+c>a>b-c
                     a=b=c ise eskenar ucgen

                     && ne bu
                     || veya bu

         */
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen üçgen icin üç sayı giriniz");

     //   double a = Math.abs(input.nextDouble());
     //   double b = Math.abs(input.nextDouble());
      //  double c = Math.abs(input.nextDouble());

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if(a<=0||b<=0||c<=0){
            System.out.println("üçgenin kenarları negatif olamaz");

        }else if (a + b > c && c > Math.abs(a - c) && a + c > b && b > Math.abs(a - c) && b + c > a && b > Math.abs(b - c)) {
            System.out.println("sen üçegnsin");

        if (a == b && a == c && b == c) {
            System.out.println("sen üçgensin hemde eşkenar üçgen");
        } else {
            System.out.println("üçgensin ama eşkenar üçken geğil");
        }
    }else

    {
        System.out.println("sen üçgen değilsin");
    }











    }
}
