package day35Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {


    /*
     1)Lambda "Functional programming" dir, digeri "Structured Programming"
     2)"Functional programming" "Ne yapmak gerekir?(What to do?)" ile ilgilenir "Nasil yapmak gerekir?(How to do?)" ile ilgilenmez.
     3)"Functional programming" Collection'lar ve Array'lerde kullanilir.
     4)Lambda, Java'ya "Java 8"de eklendi.

     "stream()" elemanlari yukardan asagiya dizer."Lambda" list'i "stream" e cevirir öyle calisir.
     "filter()" filtrelemek icin kullanilir.
     "map()" u var olan elemani degistirmek icin kullanilir.
     "distinct()" u tekrarli elemanlari sadece bir kere gosterir ve tekrarsizlari olduklari kadar gosterir.
     Note : Distinct methodu ilk baslara konulursa "Lambda" ya daha az is yaptirmis oluruz.
     "reduce()" u  kullanildiginda cok sayidaki deger bir tane degere donusmus olur.
     Orn; reduce(0,(t,u)->t+u) ==> "t" ilk degeri "sifir" dan alir, daha sonraki degerleri toplamanin sonucundan alir.
     "u" ise degerlerini her zaman "stream" den alir
     get()==> methodu optional data type'ini Integer'a cevirir. reduce tek paremetre ile çalışırsa .get() yapılması lazım
     sorted() methodu ==> elemanlari kucukten buyuge siralar.
 */


    /*
        1)Lambda "Functional(method) programming" dir, digeri "Structured Programming" (yapıyı kendimiz oluşturuyoruz)
          "methodları kullanarak kod yazma"
        2)"Functional programming" "Ne yapmak gerekir?(What to do?)" ile ilgilenir
          "Nasil yapmak gerekir?(How to do?)" ile ilgilenmez.
        3)"Functional programming" Collection'lar ve Array'lerde kullanilir.
        4)Lambda, Java'ya "Java 8"de eklendi.
        5)"Functional programming" hizli ve hatasiz calisir
    */

    /*
    //"stream" elemanlari yukardan asagiya dizer."Lambda" list'i "stream" e cevirir öyle calisir
   //map() methodu varolan elemani "update" etmek (değiiştirmek  )icin kullanilir. var olan değeri değiştirir, set gibi
   //distinct() methodu list'te tekrar eden elemenlari tekrarsiz aldirir.
           //distinct() methodu stream() method'undan sonra almak eleme yapilacak elemani basta almamiza
           // ve method'un hızlı calismasina neden olur.
           //redece() coklu degerleri azaltmak icin kullanilir.
           sorted() methodu ==> elemanlari kucukten buyuge siralar.
     */
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printElements1(nums);
        System.out.println();
        printElements2(nums);
        System.out.println();
        printEvenElements1(nums);
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printSquareOfOddElements(nums);
        System.out.println();
        printCubeOfDistinctOddElements(nums);
        System.out.println();
        printSumOfSquaresOfDistinctEvenElements(nums);
        System.out.println();
        printProductOfSquareOfDistinctEvenElements(nums);
        System.out.println();
        getMaxValue1(nums);
        System.out.println();
        getMaxValue2(nums);
        System.out.println();
        getMaxValue3(nums);
        System.out.println();
        getMinValue1(nums);
        System.out.println();
        getMinValue2(nums);
        System.out.println();
        getMinValue3(nums);
        System.out.println();
        getMinValue4(nums);
        System.out.println();
        getMinGreaterThanSevenEven(nums);

    }

    //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void printElements1(List<Integer> nums){
        for(Integer w : nums){
            System.out.print(w + " ");
        }
    }

    //2)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Functional)
    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printElements2(List<Integer> nums){
        //12 9 131 14 9 10 4 12 15
        nums.stream().forEach(t -> System.out.print(t + " "));
    }

    //3)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void printEvenElements1(List<Integer> nums){
        for(Integer w : nums){
            if(w%2==0){
                System.out.print(w + " ");
            }
        }
    }

    //4)Create a method to print the "even" list elements on the console in the same line with a space between two consecutive elements.(Functional)
    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printEvenElements2(List<Integer> nums){
        nums.//12 9 131 14 9 10 4 12 15
                stream().
                filter(t->t%2==0).
                forEach(t-> System.out.print(t + " "));
    }

    //5)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
    //  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printSquareOfOddElements(List<Integer> nums){
        nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(t-> System.out.print(t + " "));
    }

    //6)Create a method to print the "cube" of "distinct" "odd" list elements on the console in the same line with a space between two consecutive elements.
    //  Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printCubeOfDistinctOddElements(List<Integer> nums){
        nums.
                stream().
                distinct().
                filter(t->t%2!=0).
                map(t->t*t*t).
                forEach(t-> System.out.print(t + " "));
    }

    //7)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements
    //"Belirgin" "çift" öğelerin "karelerinin" "toplamını" hesaplamak için bir yöntem oluşturun
    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums){
        Integer sum = nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, (t, u)->t+u);
        System.out.print(sum);
    }

    //8)Create a method to calculate the "product" of the "square" of "distinct" "even" elements
    // "Belirgin" "çift" öğelerin "karesinin" "çarpımını" hesaplamak için bir yöntem oluşturun
    public static void printProductOfSquareOfDistinctEvenElements(List<Integer> nums){
        Integer product = nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(1, (t,u)->t*u);
        System.out.print(product);
    }

    //9)Create a method to find the "maximum value" from the list elements
   // Liste öğelerinden "maksimum değeri" bulmak için bir yöntem oluşturun
    //1.Yol:
    public static void getMaxValue1(List<Integer> nums){
        //Maximum degeri ararken Integer.MIN_VALUE kullanmak genel partiktir.
        //Minimum degeri ararken Integer.MAX_VALUE kullanmak genel partiktir.
        Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)->t>u ? t : u);
        System.out.print(max);
    }
    //2.Yol:
    public static void getMaxValue2(List<Integer> nums){
        Integer max = nums.stream().distinct().reduce(nums.get(0), (t,u)->t>u ? t : u);
        System.out.print(max);
    }

    //3.Yol:
    public static void getMaxValue3(List<Integer> nums){
        Integer max = nums.stream().distinct().sorted().reduce((t,u)->u).get();
        System.out.print(max);
    }

    //10)Create a method to find the minimum value from the list elements
   // Liste öğelerinden minimum değeri bulmak için bir yöntem oluşturun
    //1.Yol:
    public static void getMinValue1(List<Integer> nums){
        Integer min = nums.stream().distinct().reduce((t,u)->t>u ? u : t).get();
        System.out.print(min);
    }

    //2.Yol:
    public static void getMinValue2(List<Integer> nums){
        Integer min = nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t, u)->u).get();
        System.out.print(min);
    }

    //3.Yol:
    public static void getMinValue3(List<Integer> nums){
        Integer min = nums.stream().distinct().sorted().reduce((t,u)->t).get();
        System.out.print(min);
    }

    //4.Yol:
    public static void getMinValue4(List<Integer> nums){
        Integer min = nums.stream().distinct().reduce((t,u)->Math.min(t,u)).get();
        System.out.print(min);
    }

    //11)Create a method to find the minimum value which is greater than 7 and even from the list
    //   12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi 10 imiş
    public static void getMinGreaterThanSevenEven(List<Integer> nums){
        Integer min = nums.stream().filter(t->t>7 && t%2==0).sorted().reduce((t,u)->t).get();
        System.out.print(min);
    }
}


