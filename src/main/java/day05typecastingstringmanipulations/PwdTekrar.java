package day05typecastingstringmanipulations;

import java.util.Scanner;

public class PwdTekrar {
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
        System.out.println("lütfen pwd yi giriniz");
       String pwd = input.nextLine();


        boolean a =pwd.length()>7;
        System.out.println(a);

        boolean b=!pwd.contains(" ");
        System.out.println(b);

        boolean c= pwd.replace("[^A-Z]", "").length()>0;
        System.out.println(c);

        boolean d =pwd.replace("[^a-z]", "").length()>0;
        System.out.println(d);

        boolean e= pwd.replace("[A-Za-z0-9]", "").length()>0;
        System.out.println(e);

        boolean f= pwd.replace("[^A-Za-z]", "").length()>0;
        System.out.println(f);










    }
}
