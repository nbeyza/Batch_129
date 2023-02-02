package day11forloop;

public class Tekrar05 {
    public static void main(String[] args) {

        //Example 1: 5'den 8'e kadar tamsayilarin toplamini veren kodu yaziniz.
        //           5 + 6 + 7 + 8 ==> 26
        int sum= 0;

        for(int i=5;i<9;i++){
         sum=   sum+i;
        }
        System.out.print("toplama :" + sum);

        System.out.println();

        //Example 2: 7'den 9'a kadar tamsayilarin carpimini veren kodu yaziniz.
        //           7*8*9 ==> 504

        int sum1=1;

        for(int i=7;i<10;i++){
          sum1=  sum1*i;
        }
        System.out.println("çarpma :" +  sum1);

/*
            Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
        */











    }
}
