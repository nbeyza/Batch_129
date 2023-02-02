package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop03Tekrar03 {
    public static void main(String[] args) {

         /*
            Example 1: Asagidaki sekli cizdiren kodu yaziniz
                * * * *
                * * *
                * *
                *
        */

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen satır sayısını giriniz");
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int k = row; i >= i; i--) {

                System.out.println( "* ");

            }

            System.out.println();

        }
    }
}