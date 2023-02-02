package öğrenci;

import java.util.Scanner;

public class S_02 {
    public static void main(String[] args) {

        String b = "Ali 12 ?_";


        System.out.println(b.replaceAll("\\d", "*"));

       System.out.println(b.replaceAll("\\D", "*"));

      System.out.println(b.replaceAll("\\S", "*"));

      System.out.println(b.replaceAll("\\w", "*"));








    }
}