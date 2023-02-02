package day29exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

    public static void main(String[] args) {
        /*     *************      FileNotFoundException ve IOException

         */                            //ya adres yanlışsa veya yada dosya silinmişse//

    /*
        1)FileNotFoundException ve IOException Compile Time Exception'lardir, yani code'u yazarken hata aliriz.
        2)FileNotFoundException path'in dogrulugu ve dosya'nin varligi ile ilgilidir.
          IOException tum input ve output islemleri ile ilgilidir.
        3)IOException Class, FileNotFoundException Class'in parent'idir.
        4)Istenirse FileNotFoundException yerine IOException da kullanilabilir.
        5)IOException Class ve FileNotFoundException beraber kullanilacaksa FileNotFoundException ustte, IOException altta kullanilmalidir.

        FileNotFoundException  dosya bulunamadı hatası            child      adres doğru mu dosya var mı
         IOException           input outpot hatası                parent

         okuyacak hiç karakter kalmadığında -1 verir

     */



            try {
                FileInputStream fis = new FileInputStream("src/main/java/day29exceptions/File01.txt");
                int k = 0;
                while((k= fis.read()) != -1 ){
                    System.out.print((char)k);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Path is wrong or the file does not exist");
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println();
            System.out.println("Hi!");

        }


}