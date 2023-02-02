package day10switchloops;

import java.util.Scanner;

public class Switch01Tekrar {
    public static void main(String[] args) {

        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
        //           yazdiran kodu yaziniz.
        //           8 ==> August - September - October - November - December

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen ay numarsını giriniz");
       int month= input.nextInt();

       if(month==1){
           System.out.println("ocak");
       } else if (month==2) {
           System.out.println("subat");
       }






       switch (month){
           case 1:
               System.out.println("ocak");
           case 2:
               System.out.println("şubat");
           case 3:
               System.out.println("mart");
               break;
           default:
               System.out.println("geçerl bir ay griiniz");
       }










    }
}
