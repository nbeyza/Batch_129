package day20passbyvaluemethodoverloading;

public class PassByValue01_Tekrar {
    public static void main(String[] args) {


        double shirt = 100;

      double student1=  discount("student", shirt);
      double veteran1=  discount("veteran", shirt);
       double senior1= discount("senior", shirt);

        System.out.println(shirt);

        System.out.println(student1);
        System.out.println(veteran1);
        System.out.println(senior1);

        shirt=discount("veteran",shirt);
        System.out.println(shirt);

    }



    public static double discount(String state,double price) {

        switch (state) {
            case "student":
                price = price * 0.90;
                break;

            case "veteran":
                price=price*0.80;
                break;

            case "senior":
                price=price*0.95;
                break;

            default:
                price=price;
        }
        return price;

    }
}