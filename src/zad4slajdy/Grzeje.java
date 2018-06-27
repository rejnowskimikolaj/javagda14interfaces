package zad4slajdy;

public interface Grzeje {

    double pobierzTemp();

    void zwiekszTemp();

    default void wyswietlTemp() {
        System.out.println("Aktualna temperatura wynosi " + pobierzTemp() + " st.");
    }
}
