package day07ifstatements;

import java.util.Scanner;

public class Tekrar05 {
    public static void main(String[] args) {
        //Example 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.


        Scanner input = new Scanner(System.in);
        System.out.println("lütfen hangi ay olduğunu giriniz");
        String a = input.next();


        if (a.equalsIgnoreCase("ocak")) {
            System.out.println(1);
        } else if (a.equalsIgnoreCase("şubat")) {
            System.out.println(2);
        } else if (a.equalsIgnoreCase("mart")) {
            System.out.println(3);
        } else if (a.equalsIgnoreCase("nisan")) {
            System.out.println(4);
        } else if (a.equalsIgnoreCase("mayıs")) {
            System.out.println(5);
        } else if (a.equalsIgnoreCase("haziran")) {
            System.out.println(6);
        } else if (a.equalsIgnoreCase("temmuz")) {
            System.out.println(7);
        } else if (a.equalsIgnoreCase("agustos")) {
            System.out.println(8);
        } else if (a.equalsIgnoreCase("eylül")) {
            System.out.println(9);
        } else if (a.equalsIgnoreCase("ekim")) {
            System.out.println(10);
        }  else if (a.equalsIgnoreCase("kasım")) {
        System.out.println(11);
        } else if (a.equalsIgnoreCase("aralık")) {
            System.out.println(12);
        }else{
            System.out.println("yanliş ay girdiniz");
        }
    }
}