package day35Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01_01tekrar {
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
        printEvenElements3(nums);
        System.out.println();
        printEvenElements4(nums);
        System.out.println();
        printSquareOfOddElements5(nums);
        System.out.println();
        çiftSayı6(nums);
        System.out.println();
        çiftlerinKaresi7(nums);
        System.out.println();
        çiftSayıKareÇarpımı8(nums);
        System.out.println();
        maxDeğer1(nums);
        System.out.println();
        maxDeğer2(nums);
        System.out.println();
        maxDeğer3(nums);
        System.out.println();


    }
    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void printElements1(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w + " ");
        }
    }

    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printElements2(List<Integer> nums) {
        nums.stream().forEach(t -> System.out.print(t + " "));
    }

    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured),
    public static void printEvenElements3(List<Integer> nums) {
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printEvenElements4(List<Integer> nums) {
        nums.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }
//  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printSquareOfOddElements5(List<Integer> nums) {

        nums.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
    }

    public static void çiftSayı6(List<Integer> nums) {

        nums.stream().filter(t -> t % 2 != 0).distinct().map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }
    //  7  "Belirgin" tekrarsız "çift" öğelerin "karelerinin" "toplamını" hesaplamak için bir yöntem oluşturun

    public static void çiftlerinKaresi7(List<Integer> nums) {
        Integer sum = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(sum);
    }
    // 8 "Belirgin" "çift" öğelerin "karesinin" "çarpımını" hesaplamak için bir yöntem oluşturun

    public static void çiftSayıKareÇarpımı8(List<Integer> nums) {

        Integer sum1 = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(1, (t, u) -> t * u);
        System.out.println(sum1);
    }
    //9 Liste öğelerinden "maksimum değeri" bulmak için bir yöntem oluşturun

    public static void maxDeğer1(List<Integer> nums) {

        Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);

    }

    public static void maxDeğer2(List<Integer> nums) {
       Integer max= nums.stream().distinct().reduce(nums.get(0),(t,u)->t>u?t:u);
        System.out.println(max);

    }
    public static void maxDeğer3(List<Integer>nums){
      Integer max=  nums.stream().sorted().reduce((t,u)->u).get();
        System.out.println(max);

    }
    // 10 Liste öğelerinden minimum değeri bulmak için bir yöntem oluşturun

    public static void minDEğer1(List<Integer> nums){
      Integer mın=  nums.stream().distinct().reduce((t,u)->t > u  ? t : u).get();
        System.out.println(mın);
    }



    }