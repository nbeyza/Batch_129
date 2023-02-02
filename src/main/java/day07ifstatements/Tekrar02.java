package day07ifstatements;

import java.util.Scanner;

public class Tekrar02 {
    public static void main(String[] args) {
        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int a = input.nextInt();

        if(a%2==0){
            System.out.println("çift sayı");

        } else if (a%2!=0) {
            System.out.println("tek sayı");
        }else {

        } System.out.println("yanlış işlem");


    }
}