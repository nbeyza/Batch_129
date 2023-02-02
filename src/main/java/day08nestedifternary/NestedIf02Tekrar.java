package day08nestedifternary;

import java.util.Scanner;

public class NestedIf02Tekrar {
    public static void main(String[] args) {
  /*
          Example 2:Kullanicidan bir ucgenin kenar uzunluklarini aliniz
                    Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
                    Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
                    Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen üçgen için 3 sayı giriniz");

      double a=  input.nextDouble();
      double b = input.nextDouble();
      double c =input.nextDouble();

        boolean ucgenmi = (a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c));



        if(a<=0||b<=0||c<=0){
            System.out.println("üçgenin kenarları negatif olamaz");

        }
        if(ucgenmi){
            System.out.println("üçgen");

            if(a==b&&a==c&&b==c){
                System.out.println("eşkenar üçgen");
            } else if ((a==b||a==c||b==c)) {

            System.out.println("ikizkebat üçken");

            }else {
                System.out.println("çeşitkenar üçgen");
            }
        }else{
            System.out.println("üçgen değil");
        }

















    }

}






