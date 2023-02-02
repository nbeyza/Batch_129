package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays04Tekrar04 {
    public static void main(String[] args) {

        //Example 1: String bir array olusturnuz, 6 eleman ekleyiniz, Yellow'dan onceki elemanlari yazdiriniz

        String colors[] = new String[6];


        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";


        for(String w : colors) {

            if(w.equals( "Yellow")){
                break;
            }
            System.out.println(w);
        }




        String color[] = new String[6];


        color[0] = "Red";
        color[1] = "Orange";
        color[2] = "Blue";
        color[3] = "Yellow";
        color[4] = "Green";
        color[5] = "Brown";

        System.out.println();

        for(int i=color.length-1;i>=0;i--){

            if (color[i].equals("Yellow")){
                break;

            }
            System.out.println(color[i]);
        }


















    }
}