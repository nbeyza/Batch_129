package nighttime_08;

public class Edge extends  Browser {

    String adresCubugu;
    public Edge() {
    }

    public Edge(String adresCubugu) {
        this.adresCubugu = adresCubugu;
    }

    @Override
    public void search(){
        System.out.println("Edge Web sayfasinda arastirma yapar");
    }
    @Override
    public void sifreKaydetme(){
        System.out.println("Edge cookiesleri kabul edenlerin istenildiginde sifresini kaydeder");
    }
}