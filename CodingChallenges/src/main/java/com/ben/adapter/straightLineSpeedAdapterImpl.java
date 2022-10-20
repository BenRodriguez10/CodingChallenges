package src.main.java.com.ben.adapter;

public class straightLineSpeedAdapterImpl implements straightLineSpeedAdapter{
    public straightLineSpeedAdapterImpl(straightLineSpeed luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    private straightLineSpeed luxuryCars;

    // standard constructors

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.6093333;
    }
}
