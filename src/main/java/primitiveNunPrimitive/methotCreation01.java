package primitiveNunPrimitive;



/////main nasıl oluşturulur
// *** Main method un dışında oluşturulur
/////*** Access modifler + Return Type  +
////// *** add toplama


     /* method nasıl kullanılır
  ***main method un içine konulur
 * method un ismini +() yazın
 * işlem yapacağınız sayıları parantezin içine yazın
 *
 */

/// multıply çarpma
/// add toplama
///extraction çıkarma
///divide bölme

import org.w3c.dom.ls.LSOutput;

public class methotCreation01{


    public static void main(String[] args) {
      int sonuç =   add(30, 50);
        System.out.println(sonuç);

        long çarpmaSonucu = multiply(3,6);
        System.out.println(çarpmaSonucu);

        int ucluSonuc = ilkİkisayiyiCarpUcuncuyuTopla(2, 5, 8);

        System.out.println(ucluSonuc);

       double kup = kupal(5);
        System.out.println(kup);


    }


    public static int add(int a, int b){

      return a+b;
    }

    protected static long multiply(int a, int b) {
        return a * b;
    }

    private static int ilkİkisayiyiCarpUcuncuyuTopla(int a, int b, int c){

        return a * b + c;

    }
      static double kupal(double a){
       return a*a*a;
 }


    }
