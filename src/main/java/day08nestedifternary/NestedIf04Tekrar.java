package day08nestedifternary;

import java.util.Scanner;

public class NestedIf04Tekrar {
    public static void main(String[] args) {

          /*
               Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

               Eger calisan kadin ise;

                60 yasindan buyukse "Emekli Olabilir "yazdirin


               Eger calisan erkek ise;
                65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
            */

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen cinsiyetinizi giriniz");
        String gender = input.next();

        System.out.println("lütfen yasınızı diriniz");
        int age =input.nextInt();

        if(age<0 || age>120){
            System.out.println("liüfen 0 ile 120 arası bir sayı giriniz ");

        }else if(gender.equalsIgnoreCase("kadın")) {
            if (age > 60) {
                System.out.println("emekli olabilir");

            } else {
                System.out.println("çalişmalıdır");
            }


        } else if (gender.equalsIgnoreCase("erkek")) {
            if(age>65){
                System.out.println("emekli olabilir");
            }else {
                System.out.println("kesinlikle çaılişmalı");
            }

        }else {
            System.out.println("gererli bir yaş giriniz");
        }

    }
}
