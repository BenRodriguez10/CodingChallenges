package src.main.java.com.ben.adapter;


public class LuxuryCarSpeed {
    public static void main(String args[]) {

    straightLineSpeed audi = new Audi();
    straightLineSpeedAdapter audiAdapter = new straightLineSpeedAdapterImpl(audi);

    audiAdapter.getSpeed();
    System.out.println(audiAdapter.getSpeed());
    }
}
