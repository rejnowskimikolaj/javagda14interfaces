package zad4slajdy;

public class Wiatrak implements Chlodzi {

    private double temp;

    @Override
    public double pobierzTemp() {
        return temp;
    }

    @Override
    public void schlodz() {

        temp--;
    }
}
