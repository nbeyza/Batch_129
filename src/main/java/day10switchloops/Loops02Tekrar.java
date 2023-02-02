package day10switchloops;

public class Loops02Tekrar {
    public static void main(String[] args) {

        //Example 2: Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan caharacter'lerini buyuk harf yapiniz


        //           ankara ==> AKR

        String a="ankara";

        for(int i=0;i<a.length();i++){

            String b= a.substring(i, i+1);

            if(i%2==0){



                System.out.println((b.toUpperCase()));

            }


        }



     //   String a="ankara";

      //  for(int i=0;i<a.length();i++){

        //    String b= a.substring(i, i+1);

       //     if(i%2==0){

        //       String as=  b.toUpperCase();

          //      System.out.println((as));

    }
}
