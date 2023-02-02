package day30exceptionsinterface;

public class HondaRunnar {
    public static void main(String[] args) {

        //multiple inheritance

        Civic myCivic = new Civic();
        myCivic.cool();

        System.out.println(Ac.price);
        System.out.println(Engine.price);
        System.out.println(Security.price);

        System.out.println(Ac.model);

        Accord myAccord = new Accord();
        myAccord.cool();

    }
}
