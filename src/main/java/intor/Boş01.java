package intor;

import java.util.Arrays;
import java.util.Scanner;

public class Boş01 {
    public static void main(String[] args) {


        int arr[] = {2, 11, 0, 23, 7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println();
        for(int i=4; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }





    }
}
