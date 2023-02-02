package day08nestedifternary;

import java.util.Scanner;

public class NestedIf03Tekrar {
    public static void main(String[] args) {

 /*
                    Password'un ilk harfi buyuk harf ise
                    'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    Alemci ==> Gecerli

                    Passwordun ilk harfi kucuk harf ise
                    'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    zehirli ==> Gecerli
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen şifreyi giriniz");

        String a = input.nextLine();


        char pwd = a.charAt(0);

        if (pwd >='A' && pwd <= 'Z') {

            if (pwd == 'A') {
                System.out.println("geçerli pwd");
            } else {
                System.out.println("geçersiz büyük ama A değil");

            }
        }else if (pwd > 'a' && pwd < 'z') {

            if (pwd=='z'){

                System.out.println("geçerli pwd küçük");
            }else {
                System.out.println("küçük ama z  geğil");

        }
        }else{
            System.out.println("sayı pdw olamaz");
        }
    }
}