package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03Tekrar03 {
    public static void main(String[] args) {
        //Example 1: String bir array olusturunuz, 6 tane eleman yerlestiriniz, character sayisi 5 den cok olan elemanlari siliniz.

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        int a=0;
        for(String w:colors){

            if(w.length()<=5){
                a++;

            }

        }
        System.out.println(a);

        String as[]=new String[a];

        int b=0;

        for (String w:colors){

            if (w.length()<=5){

               as[b]=w;

               b++;
            }

        }

        System.out.println(Arrays.toString(as));



    }
}