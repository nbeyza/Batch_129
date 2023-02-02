package intor;

public class Test01 {

    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {

            System.out.print(i + " ");

            i++;

        }

        System.out.println();

        int product = 1;

        for (int i = 5; i >= 0; i--) {

            product = product * i;

        }

        System.out.println(product);

        System.out.println();


        int sum = 0;

        for (int i = 1; i < 6; i++) {

            sum = sum + i;

        }

        System.out.println("Toplam: " + sum);


        System.out.println();


        for (int j = 0; j <= 10; j = j + 3) {

            System.out.println(j + " ");


        }

        System.out.println();


        for (int i = 1; i <= 5; i++) {

            for (int j = (5 - i); j > 1; j--) {

                System.out.println(i + j);

            }

            System.out.println();

        }
        for (char i = 'f'; i > 'a'; i--) {

            System.out.println(i + " ");

            i--;

        }

        System.out.println();


        int num = 1;

        while (num < 3) {

            System.out.println(num + " ");

            num++;

        }

        int num1 = 1;

        while (num1 < 1) {

            System.out.println(num1 + " ");

            num1++;

        }
        int num2 = 1;

        while (num2 == 1) {

            System.out.println(num2 + " ");

            num2++;

        }
        System.out.println();

        /*
        int num3 = 1;


        while(num3<=1) {

            System.out.println(num3 + " ");

            num3--;

        }
*/
        for (int i = 1; i < 10; i = i + 1) {

            if (i % 3 == 0) {

                System.out.print(i + " ");

            }

        }

        System.out.println();

        char ch = 'a';

        while (ch < 'd') {

            System.out.println(ch + " ");

            ch++;

        }
        System.out.println("*****");

        int sum5 = 0;

        int num6 = 1;

        while (num6 < 5) {

            sum5 = sum5 + num6;

            num6++;

        }

        System.out.println(sum5);//10

        System.out.println();


        int sum7 = 5;

        int num8 = 1;

        while (num8 < 5) {

            sum7 = sum7 + num8;

            num8++;

        }

        System.out.println(sum7);//15


        System.out.println();


        int product1 = 1;

        int num9 = 1;

        while (num9 < 5) {

            product1 = product1 * num9;

            num9++;

        }

        System.out.println(product1);//24
        System.out.println();


        int product2 = 1;

        int num12 = 1;

        while (num12 < 5) {

            product2 = product2 * num12;

            product2++;

        }

        System.out.println(product2);


    }


}




