package day12forloopwhileloop;

public class WhileLoop01Tekrar {
    public static void main(String[] args) {

        for (int i = 3; i < 7; i++) {
            System.out.print(i);
        }


        System.out.println();
        int i = 3;

        while (i < 7) {

            System.out.print(i);

            i++;
        }
        System.out.println();

        //Example 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz

        int k = 23;

        while (k > 11) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
            k--;
        }

        System.out.println();



        //Example 3: Verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz
        int num = -578;

       num= Math.abs(num);

       int sum =0;

        while (num>0){

        sum=    sum+num%10;

            num/=10;
        }

        System.out.println(sum);

        System.out.println();

        int a=-6841;
        a=  Math.abs(a);

        int b =0;

        while (a>0){

       b=b+a%10;

            a/=10;
        }
        System.out.println(b);

        System.out.println();


        int azx = 578;

        int d=0;

        for(int s=azx; s>0;s/=10){
            d=d+s%10;

        }
        System.out.println(d);







    }

    }

