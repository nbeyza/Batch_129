package intor;

import java.util.Arrays;
import java.util.Scanner;

public class Boş {
    public static void main(String[] args) {
        //bu soeuyu hocaya sor yukarısı i=0 olunca asağısı i+1 de yine alt tarfa ne olacak


        Scanner input= new Scanner(System.in);
        System.out.println("kac öğrenci ismi gireceksiniz");
        int numOfElement =input.nextInt();

        String std[]=new String[numOfElement];

        for (int i=0;i<=numOfElement;i++){

            System.out.println("lütfe "+ (i+1)+". öğrenci adını giriniz");

            String stdName= input.next();

            std[i]=stdName;
        }

        System.out.println(Arrays.toString(std));


        }
    }
