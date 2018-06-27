package zad4slajdy;

public interface Chlodzi {

    double pobierzTemp();

    void schlodz();

    default void wyswietlTemp() {
        System.out.println("Aktualna temperatura wynosi " + pobierzTemp() + " st.");
    }
}
