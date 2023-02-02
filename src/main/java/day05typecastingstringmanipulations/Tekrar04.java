package day05typecastingstringmanipulations;

import java.util.Scanner;

public class Tekrar04 {

    public static void main(String[] args) {
         /*
            Example 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun
                        ii)Space characteri password'de olmasin
                        iii)En az bir tane buyuk harf olsun
                        iv)En az bir tane kucuk harf olsun
                        v)En az bir tane sembol olsun
                        vi)En az bir tane rakam olsun
         */
        Scanner input =new Scanner(System.in);
        System.out.println("lütfen şifreyi giriniz");
      String şifre =  input.next();

       boolean a=  şifre.length()>7;
        System.out.println(a);

        boolean b = !şifre.contains(" ");
        System.out.println(b);


        boolean ag = !şifre.contains("[^A-Z]");
        System.out.println(ag);


       boolean d = şifre.replaceAll("[^A-Z]", "").length()>0;
        System.out.println(d);

        boolean az = şifre.replaceAll("[^a-z]", "").length()>0;
        System.out.println(az);

        boolean ad = şifre.replaceAll("[a-zA-Z0-9]", "").length()>0;
        System.out.println(az);

        boolean av = şifre.replaceAll("[^0-9]", "").length()>0;
        System.out.println(az);


    }
}
