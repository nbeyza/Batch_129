package day15arrays;

import java.util.Arrays;

public class ArraysTekrar03 {

    public static void main(String[] args) {

        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]

        int a []= {0, 2, 3, 0, 12, 0};

        int b[]=new int[a.length];

        int c=0;
        for(int w:a)
            if(w!=0){
                b[c]=w;
                c++;
            }
            System.out.println(Arrays.toString(b));
        }







    }

