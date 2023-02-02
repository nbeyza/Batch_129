package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01Tekrar {
    public static void main(String[] args) {
        //Example 1: Kullanici ile beraber bir array olusturunuz

        Scanner input =new Scanner(System.in);

        System.out.println("kaç öğenci gireceksiniz");
        int numOf= input.nextInt();

        System.out.println("Girisi sonlandirmak icin Q tusuna basiniz...");

     String std[]=new String[numOf];


       for(int i=1;i<=numOf; i++){

           System.out.println("lütfen "+ 1 +  " . öğrenciyi giriniz");

          String stdName1= input.next();
           if(stdName1.equalsIgnoreCase("Q")){
               break;

           }


         std[i-1]=stdName1;

       }
        System.out.println(Arrays.toString(std));









    }

}
