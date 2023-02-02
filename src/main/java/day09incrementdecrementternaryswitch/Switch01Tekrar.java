package day09incrementdecrementternaryswitch;

import java.util.Scanner;

public class Switch01Tekrar {
    public static void main(String[] args) {

        //Example 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //           Sunday==>1  . . .  Saturday==>7

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen günü giriniz");
        String day =input.next();

        if(day.equalsIgnoreCase("pazartesi")){
            System.out.println(1);
        } else if (day.equalsIgnoreCase("salı")) {
            System.out.println(2);

        }else {
            System.out.println("gecerli bir gün giriniz");
        }





        switch (day.toLowerCase()){
            case "pazartesi":
                System.out.println(1);
                break;
            case "salı":
                System.out.println(2);
                break;
            default:
                System.out.println("gecerli girin");
        }

    }
}
