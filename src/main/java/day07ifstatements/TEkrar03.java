package day07ifstatements;

import java.util.Scanner;

public class TEkrar03 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int a =input.nextInt();

        //Example 3: Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz

        if(a>0){
            System.out.println("pozitif");
        } else if (a<0) {
            System.out.println("negatif");

        }else {
            System.out.println("nötr");
        }


    }
}
