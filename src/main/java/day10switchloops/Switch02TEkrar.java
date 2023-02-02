package day10switchloops;

import java.util.Scanner;

public class Switch02TEkrar {
    public static void main(String[] args) {

        //Example 1: Kullanicidan iki sayi ve yapilacak islemi alan ve +,-,*,/,% islemlerini yapan kodu yaziniz

        Scanner input = new Scanner (System.in);
        System.out.println("İki sayi giriniz ...");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("yapılacak işlemi giriniz +,-,*,/,% " );
        char opr= input.next().charAt(0);

        switch (opr){
            case '+':
                System.out.println(a+"+"+b+"="+  (a+b));
                break;
            case '-':
                System.out.println(a+"-"+b+"="+(a-b));
                break;
            default:
                System.out.println("gecerli gir");
        }



    }
}
