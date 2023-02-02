package day29exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03_tekrar {
    public static void main(String[] args) {


        try {
            FileInputStream  fis = new FileInputStream("src\\main\\java\\day29exceptions\\File01.txt");
            int k =0;
            while ((k=fis.read())!=-1){
                System.out.print((char) k);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
