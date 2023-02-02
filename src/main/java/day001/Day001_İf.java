package day001;

import java.util.Scanner;

public class Day001_İf {
    public static void main(String[] args) {

// if it rains , I will cancel the picnic
        // Eger yagmur yagarsa;piknigi iptal edecegim

        //Ex 1) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran kodu olusturunuz
        char ch = 'G';
        if(ch>='A' && ch<='Z'){
            System.out.println("Büyük Harf");


            char ch1 = '*';

            if(ch1>='A' && ch1<='Z'){
                System.out.println("Büyük Harf");}

            char ch2 = 'A';
            if(ch2>='A' && ch2<='Z'){
                System.out.println("Büyük Harf");

            }


        }// if body

        //Ex 2) Verilen bir sayi cift sayi ise ekrana cift sayi yazdiran kodu olusturunuz
         byte sayı = 20;
        if(sayı%2 == 0){
            System.out.println("Çİft Sayi");
        }

        byte sayi01 =25;
        if(sayi01%2==0){
            System.out.println("Çift Syı");
        }

        byte sayi02 =0;
        if(sayi02%2==0){
            System.out.println("Çift Sayı Göster");
        }
//Ex 3) Verilen bir sayi 300'den kucuk veya
// 1200'den buyuk ise ekrana "Harika Sayi" yazdiran
// kodu olusturunuz

        int number = 509;

        if(number<300||number>1200){
            System.out.println("Harika sayı");
        }

int abc = 256;
        if(abc<300||number>1200) {
            System.out.println("harika Sayı");
        }

        // Ex 4) Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz



       Scanner input = new Scanner(System.in);
        System.out.println("lütfeb sayı giriniz");

        int num = input.nextInt();

        if(num%2 ==0){
            System.out.println("çift sayı");

            if(num%2!=0){
                System.out.println("tek sayı");
            }


        }
//ikinci yol





    }//main body


}//class body
