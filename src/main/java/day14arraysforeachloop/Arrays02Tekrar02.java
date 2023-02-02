package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02Tekrar02 {
    public static void main(String[] args) {

//Example 2: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
     //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        int ages[] = new int[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;


        System.out.println(Arrays.toString(ages));

        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        System.out.println(ages[0]+ages[ages.length-1]);



        int mini=ages[0];
        int maxi=ages[0];

        for (int w:ages){

            mini=Math.min(mini, w);
            maxi=Math.max(maxi, w);


        }
        System.out.println(mini+maxi);
    }

}