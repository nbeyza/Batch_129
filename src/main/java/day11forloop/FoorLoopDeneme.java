package day11forloop;

public class FoorLoopDeneme {
    public static void main(String[] args) {

        String t = "Germany";

        for (int i=0;i<t.length();i++){

            char as = t.charAt(i);

            if(as=='m'){
                break;
            }
            System.out.print(as);
        }
        System.out.println();


        String h = "Germany";

        for (int i=h.length()-1; i>=0; i--){


            char az = h.charAt(i);



            System.out.print(az );
        }










    }
}
