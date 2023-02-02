package day07ifstatements;

import java.util.Scanner;

public class Tekrar06 {
    public static void main(String[] args) {
        /*
             Example 1:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfan yasınızı giriniz");
        int a = input.nextInt();

        if (a < 0) {
            System.out.println("geçerli bir yaş giriniz");

        } else if (a<5) {
            System.out.println("bebek");

        } else if (a<12) {
            System.out.println("çocuk");

         } else if (a<20) {
        System.out.println("genç");

        } else if (a<30) {
        System.out.println("yetişkin");

       } else if (a<30) {
        System.out.println("tanımlanmamış");

        }else {
            System.out.println("Tanimlanmamis yas...");
        }


    }


}