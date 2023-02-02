package ntdtmultideimensionalerreys;

import java.util.Arrays;

public class MdTekrar01 {
    public static void main(String[] args){

      //MultiDimensional Array nasil olusturulur?
        int a[][] = new int[3][2];

        //MultiDimensional Array'ler nasil yazdirilir?
        System.out.println(Arrays.deepToString(a));// [ [0, 0], [0, 0], [0, 0] ]

        //MultiDimensional Array'lere eleman nasil eklenir?
        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;

        System.out.println(Arrays.deepToString(a));


        System.out.println(Arrays.toString(a[0]));

        System.out.println(a[0][0]);


        System.out.println(Arrays.toString(a[1]));
        System.out.println(a[2][1]);









    }
}


