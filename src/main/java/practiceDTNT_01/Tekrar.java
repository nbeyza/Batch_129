package practiceDTNT_01;

import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        System.out.println(" Lutfen yapacaginiz islemi giriniz");
        String islem = input.next();

        if (islem.equals("+")) {
            System.out.println("Toplama isleminin sonucu ="+ sayi1 + sayi2);
        } else if (islem.equals("-")) {
            System.out.println("Cikarma isleminin sonucu ="+ (sayi1 - sayi2));
        } else if (islem.equals("*")) {
            System.out.println("Carpma isleminin sonucu ="+sayi1 * sayi2);
        } else if(islem.equals("/")){
            System.out.println("Bolme isleminin sonucu ="+sayi1 / sayi2);
        }else{
            System.out.println("Islem yapmak icin gecerli sembolu giriniz");
        }


    }
}
