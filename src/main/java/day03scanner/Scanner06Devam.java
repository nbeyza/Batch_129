package day03scanner;

import java.util.Scanner;

public class Scanner06Devam {
    public static void main(String[] args) {

        //Kullanicidan alacaginiz 5 basamakli
        // bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("5 basamakli bir sayi giriniz...");

        int number = input.nextInt();


        int last1 = number%10;
        number = number/10;

        int last2 = number%10;
        number = number/10;

        int last3 = number%10;
        number = number/10;

        int last4 = number%10;
        number = number/10;

        int last5 = number%10;
        number = number/10;

        System.out.println(last1+last2+last4+last5);


    }
}
