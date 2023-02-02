package day13whileloopdowhileloop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays01Tekrar {

    public static void main(String[] args) {

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile son elemanin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.


        String isim[]=new String[3];

        isim[0]="ayşe";
        isim[1]="elif";
        isim[2]="naciye";

        System.out.println(Arrays.toString(isim));



        for(int i=0;i<isim.length;i++){


            System.out.println(isim[i]+"!");


        }



    }
}
