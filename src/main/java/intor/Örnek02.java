package intor;

import java.util.Scanner;

public class Örnek02 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Lütfen kelime");
        String Word = input1.nextLine();


        Scanner input2 = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int repeat = input2.nextInt();


        char firstwr = Word.charAt(0);
        char lastwr = Word.charAt(Word.length() );

        for (int i = 1; i <= repeat; i++) {

            System.out.print(firstwr);
            System.out.print(lastwr);


        }
    }
}