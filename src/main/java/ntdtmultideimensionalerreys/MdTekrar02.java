package ntdtmultideimensionalerreys;

import java.util.Arrays;

public class MdTekrar02 {
    public static void main(String[] args) {

        //example 1 Integer bir multidimensionel olusşturunuz elemanların toplamın konsola yazdırınız

        // toplam emenna sayısını konsola uazdırınız

        int a[][]={{13, 213, 4},{12, 87}, {4,7,1,9},{99}};

        System.out.println(Arrays.deepToString(a));

        int b=0;
        for (int[] w:a){
            b=b+w.length;
        }

        System.out.println(b);


    }
}
