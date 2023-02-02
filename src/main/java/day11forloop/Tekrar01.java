package day11forloop;

public class Tekrar01 {
    public static void main(String[] args) {

        //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        //           "I love Java" ==> "I love J"
        String s = "I Love Java";

        for (int i = 0; i < s.length(); i++) {


            if (s.charAt(i) == 'a') {
                break;
            }
            System.out.print(s.charAt(i));

        }
        System.out.println();

        String s1 = "Tramvay";

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) == 'v') {
                break;

            }
            System.out.print(s1.charAt(i));
        }

        System.out.println();


        // String "manisa" s den öncekileri büyük yazdır

        String s3 = "manisa";

        for (int i = 0; i < s3.length(); i++) {


            String a = s3.toUpperCase();

            if (a.charAt(i) == 'S') {

                break;


            }
            System.out.print(a.charAt(i));
        }

        System.out.println();

        //Example 2: Verilen bir String'de son 'a' dan sonraki tum character'leri ters sirada yazdiriniz
        //           "Germany" ==> yn

        String a = "Germany";

        for (int i = a.length() - 1; i >= 0; i--) {

            if (a.charAt(i) == 'a') {
                break;

            }
            System.out.print(a.charAt(i));
        }


        System.out.println();

        String ae = "Tramvay";

        for (int i = 0; i < ae.length(); i++) {

            if (ae.charAt(i) == 'm') {
                break;
            }
            System.out.print(ae.charAt(i));
        }

        System.out.println();


    }


}








