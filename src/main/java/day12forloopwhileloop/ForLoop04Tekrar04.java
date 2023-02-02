package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop04Tekrar04 {
    public static void main(String[] args) {

         /*
        Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
        9 - 14 ==> 10  12  14
     */

        Scanner input = new Scanner(System.in);

        System.out.println("başlangıç değerini  giriniz...");
        int Start = input.nextInt();

        System.out.println("bitiş değerini giriniz...");
        int end = input.nextInt();

        if (Start > end) {
            System.out.println("balşangoç büyük olamaz");
        } else {

            for (int i = Start; i < end; i++) {
                if (i % 2 == 0) {

                    System.out.print(i);


                }

            }
        }

//Example 1: Hic sayi kullanmadan 1 den 100'e kadar olan sayilari console'a yazdiriniz

        for (int i = 'd' / 'd'; i < 'd'; i++) {

            if (i % 2 == 0) {
                System.out.print(i +" ");

            }


        }
    }

}