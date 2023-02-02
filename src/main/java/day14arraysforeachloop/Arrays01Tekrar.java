package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01Tekrar {
    public static void main(String[] args) {

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile son elemanin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.
        String name[]=new String[5];


        name[0]="ayse";
        name[1]="ali";
        name[2]="veli";
        name[3]="osman";
        name[4]="hasan";

        System.out.println(Arrays.toString(name));

        System.out.println(name[0].length()+name[name.length-1].length());


        //Example 2: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.


      String brr[]=new String[5];

        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Athena";

        System.out.println(Arrays.toString(brr));
        int a=0;

        for(int i=0; i<brr.length;i++){

            a=a+brr[i].length();

        }
        System.out.println(a);
///// ikinci yol

        int sum=0;

        for(String w:brr){
            sum=sum+w.length();

        }
        System.out.println(sum);




    }
}