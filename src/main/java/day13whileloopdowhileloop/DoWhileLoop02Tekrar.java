package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop02Tekrar {
    public static void main(String[] args) {
        /*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
         */

        Scanner input =new Scanner(System.in);


        int b=0;

        do {
            System.out.println("lütfen bir sayı giriniz");
            b = input.nextInt();

            if (b >= 100) {
                System.out.println("kazandınız");



            }

          b++;
        }while (b>=100);
            System.out.println("kaybettiniz");

        }







    }

