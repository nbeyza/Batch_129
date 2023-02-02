package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03Tekrar {
    public static void main(String[] args) {

          /*
                Gecerli Username="admin" ve Password="pwd123" dur.
                Kullanicidan username ve password'u alin.
                Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
                Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
                Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
         */

        Scanner input= new Scanner(System.in);



        int i=0;
        do{
            if(i==4) {
                System.out.println("hesabınız blole oldu");
                break;
            }

            System.out.println("lütfen ismi giriniz");
            String isim=  input.next();

            System.out.println("lütfen şifreyi giriniz");
            String şifre =  input.next();

            if(isim.equals("admin")&&şifre.equals("pwd123")) {
                System.out.println("hesabınıza hoşgeldiniz");
                break;
            }

            i++;
        }while (true);








    }
}
