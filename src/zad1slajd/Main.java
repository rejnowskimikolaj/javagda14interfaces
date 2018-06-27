package zad1slajd;

public class Main {

    public static void main(String[] args) {

        Beben beben = new Beben();
        beben.graj();
        beben.peknij();
        Gitara gitara = new Gitara();

        Instrumentalny bebenek = new Beben();

        Beben naprawdeBebenek = (Beben) bebenek;
        gitara.graj();
    }
}
