package day07ifstatements;

import java.util.Scanner;

public class Tekarrrrrrr {
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
        System.out.println("lütfen yaşı giriniz");

        byte age = input.nextByte();

        if (age < 0) {
            System.out.println("geçerli bir yaş giriniz");
        } else if (age < 5) {
            System.out.println("bebek");
        } else if (age < 13) {
            System.out.println("cocuk");
        } else if (age < 21) {
            System.out.println("genç");
        } else if (age < 30) {
            System.out.println("yetişkin");
         } else if (age > 30) {
           System.out.println("tanımlanmamış");
        }else{
            System.out.println("geçerli bir yaş giriniz");
        }




            }


        }


