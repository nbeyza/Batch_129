package day11forloop;

public class TekrarLoop03 {
    public static void main(String[] args) {


        //Example 1: Size verilen bir String'i tersten yazdiriniz
        //           "Germany" ==> ynamreG

        String s="Germany";
        String t=" ";

        for(int i=s.length()-1;i>=0;i--){

       t=   t+ s.charAt(i);

        }
        System.out.println(t);

        System.out.println();


        String a="istanbul";
        String z=" ";

        for(int i=a.length()-1;i>=0;i--){

          z=z+a.charAt(i);

        }
        System.out.println(z);

        System.out.println("");



        String k="madagaskar";

        for(int i=k.length()-1;i>=0;i--){

            System.out.print(k.charAt(i));
        }
        System.out.println();

        String l="bugün bize gelsen";
        for(int i=l.length()-1;i>=0;i--){

            System.out.print(l.charAt(i));

        }


        System.out.println();



        String duz = "Civic";
        String ters= " ";

        for(int i=duz.length()-1;i>=0;i--){

          ters=  ters +duz.charAt(i);

        }


          if(duz.equalsIgnoreCase(ters)){
              System.out.println("poliğrpmdue");

}else {
              System.out.println("değildir");
          }



    }

}








