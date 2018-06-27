package zad4slajdy;

public class Farelka implements Grzeje {

    private double temp;

    @Override
    public double pobierzTemp() {
        return temp;
    }

    @Override
    public void zwiekszTemp() {
        temp++;
    }
}
