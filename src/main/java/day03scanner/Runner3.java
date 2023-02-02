package day03scanner;

public class Runner3 {

        public static void main(String[] args) {

            //Object nasil olusturulur?
            //Class Ismi    Object Ismi   Atama Operatoru    "new" keyword     Constructor
            Car1 myCar             =               new Car1();
            System.out.println(myCar.fiyat);
            System.out.println(myCar.model);
            myCar.hareket();
            myCar.dur();

            Student2 tomHanks = new Student2();
            System.out.println(tomHanks.name);
            System.out.println(tomHanks.grade);
            System.out.println(tomHanks.address);
            tomHanks.study();
            tomHanks.feed();

        }
}


