package day07ifstatements;

import java.util.Scanner;

public class Tekrar04 {
    public static void main(String[] args) {

        //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen günü giriniz");
       int a=  input.nextInt();

if(a==1){
    System.out.println("pazar");
} else if (a==2) {
    System.out.println("pazartesi");
} else if (a==3) {
    System.out.println("salı");
} else if (a==4) {
    System.out.println("çarşamba");
} else if (a==5) {
    System.out.println("perşembe");
} else if (a==6) {
    System.out.println("cuma");
} else if (a==7) {
    System.out.println("cumartesi");
}else {
    System.out.println("yanlış gün girdiniz");
}


    }


}
