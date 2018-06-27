package zad4slajdy;

public class Klimatyzacja implements Grzeje, Chlodzi{

    private double temp;

    @Override
    public void schlodz() {

        temp--;
    }

    @Override
    public double pobierzTemp() {
        return temp;
    }

    @Override
    public void zwiekszTemp() {

        temp++;
    }

    @Override
    public void wyswietlTemp() {
        System.out.println("Aktualna temperatura wynosi "+pobierzTemp()+" st.");
    }
}
