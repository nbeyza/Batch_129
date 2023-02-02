package day03scanner;

public class RunnerDeneme {

    public static void main(String[] args) {
        Car1 mycar = new Car1();

        System.out.println(mycar.fiyat);
        System.out.println(mycar.model);
        mycar.dur();
        mycar.hareket();

        Student2 tomHangs = new Student2();
        System.out.println(tomHangs.address);
        System.out.println(tomHangs.grade);
        System.out.println(tomHangs.name);
        tomHangs.study();

    }
}
