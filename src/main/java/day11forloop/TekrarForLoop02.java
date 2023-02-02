package day11forloop;

public class TekrarForLoop02 {
    public static void main(String[] args) {

        //Example 1: Verilen bir String'de 'a' character'i haric tum character'leri yazdiriniz.
        //           "Madagaskar" ==> Mdgskr

        String w = "Madagaskar";

        String aş = w.replace("a", "");
        System.out.println(aş);

        System.out.println();


        for (int i = 0; i < w.length(); i++) {

            if (w.charAt(i) != 'a') {
                System.out.print(w.charAt(i));
            }

        }
        System.out.println();


        for(int i=0;i<w.length();i++){

            if(w.charAt(i)=='a'){
                continue;
            }
            System.out.print(w.charAt(i));
        }
    }
}