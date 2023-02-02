package day20passbyvaluemethodoverloading;

public class PassByValue02_Tekrar{

    public static void main(String[] args) {

        String name =   "tom Hanks";
        String ad =ad(name, "jr");
        System.out.println(name);
        System.out.println(ad);


    }
    public static String ad(String name, String add){
       name= name+" "+add;
       return name;

    }


}
