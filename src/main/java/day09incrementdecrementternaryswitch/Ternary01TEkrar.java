package day09incrementdecrementternaryswitch;

public class Ternary01TEkrar {
    public static void main(String[] args) {


        //Example 4: Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        int a = -350;

       int b= Math.abs(a);

        String rst = b > 99 && b < 1000 ? a +  "   üç basamaklıdır" :a + "  üç basamaklıdeğıldir";

        System.out.println(rst);


        // sart ? true veren kısım : falso veren kısım;


//Example 3: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
        //           mesaji veren kodu yaziniz.
        int m = 5;
        int n = 6;


     Object x =   (m>0 && n>0) || (m<0 && n<0) ? m*n : "Farkli isaretli sayilari carpamiyorum";

        System.out.println(x);




    }
}






