package day32collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    public static void main(String[] args) {

        /*
        Insertion order yerleştirdiğimiz sıraya göre
        randum rastgele
                     ****************    iki uçlu demek iki taraftan da çalışılır   *****************

         "Deque" "Double Ended Queue" hem "FIFO" hem de "LIFO" icin kullanilir.
         */

        Deque<Integer>dq = new LinkedList<>();
        dq.add(12);
        dq.add(5);
        dq.add(18);
        dq.add(9);
        dq.add(1);


    }
}