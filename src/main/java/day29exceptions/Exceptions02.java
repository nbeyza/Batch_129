package day29exceptions;

public class Exceptions02 {

    /*               *******************       IllegalArgumentException            *****************

     */
    /*
     throw ile throws farkı
     primitive ile non_primitive farkı
     Overriding ile Overloading farkı
     Overriding= özellestirmek
     Overloading = aşırı yüklenme


Belli sartlar altinda biz kendimi exception throw edebiliriz.
Mesela kullanici negatif yas girerse java hata vermeyecegi icin
exception throw etmesini biz javaya soylemis oluruz.

Java gercek hayati bilmez. Biz burada tabiri caizse Java'ya age'in negatif olmayacagini soyledik.

                                                        "IllegalArgumentException"
    */
    public static void main(String[] args)throws IllegalArgumentException {

        /*
        "throw" ile "throws" keyword'leri arasindaki fark nedir?
1)"throw" method body'si icinde, "throws" ise method paranetzinden hemen sonra kullanilir.
2)"throw" method body'si icinde istenilen yerde istenildigi kadar kullanilir,
  "throws" ise method paranetzinden hemen sonra sadece bir kere kullanilabilir.
3)"throw" dan sonra "new" keyword ve "constructor" kullanilarak object olusturulur.
  "throws" dan sonra sadece Exception Class ismi yazilir
4)"throw" belli sartlar icin Exception atmada kullanilir, "throws" ise application'i Exception attiktan sonra durdurur.
         */
        try {
            printAge(-18);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

       /* try {
            getMark(-90);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        */

        getMark(-90);

    }


    //"throw" keyword bir method'un body'si icinde istedigimiz yerde, istedigimiz kosullar, istedigimiz kadar icin Exception atmamizi saglar.
    //"throw" keyword yazildiktan sonra bir Exception Class object'i olusturulur.
    //Exception Class constructor'inin parantezi icine istediginiz Exception Mesaj'ini yazabilirsiniz,

    // method Exception atar biz o Exception ı kullanırden Handling ederiz

    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else {
            System.out.println(age);
        }
    }

    //Ogrenci notlari girisi yapan ve notu console'a yazdiran bir method olusturunuz
    public static void getMark(double d) {

        if (d < 0) {
            throw new IllegalArgumentException("Marks cannot be less than zero");
        } else if (d > 100) {
            throw new IllegalArgumentException("Marks cannot be greater than hundred");
        } else {
            System.out.println(d);
        }

    }

}