package day05typecastingstringmanipulations;

import java.util.Scanner;

public class Tekrar03 {
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

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen prolanızı giriniz");
        String pwd = input.nextLine();

        boolean bir = pwd.length()>7;
        System.out.println(bir);

       boolean iki = !pwd.contains(" ");
        System.out.println(iki);

      boolean üç=  pwd.replaceAll("[A-Z]", "").length()>0;
        System.out.println(üç);

       boolean dört= pwd.replaceAll("[a-z]", "").length()>0;
        System.out.println(dört);

       boolean beş = pwd.replaceAll("[^a-zA-Z0-9]", "").length()>0;
        System.out.println(beş);

       boolean altı = pwd.replaceAll("[0-9]", "").length()>0;
        System.out.println(altı);




    }
}
