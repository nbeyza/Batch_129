package ntdtmultideimensionalerreys;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {

        //example 1 Integer bir multidimensionel olusşturunuz elemanların toplamın konsola yazdırınız

        // toplam emenna sayısını konsola uazdırınız

        int a[][]={{13, 213, 4},{12, 87}, {4,7,1,9},{99}};

        System.out.println(Arrays.deepToString(a));

        int sum=0;

        for(int[] w :a){

         sum=sum+w.length;


        }

        System.out.println(sum);










    }
}
