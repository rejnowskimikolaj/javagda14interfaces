package zd3slajdy;

public class Programista implements Jedzacy {
    private int gramy;
    private int iloscPosilkow;

    @Override
    public void jedz(Pokarm pokarm) {
        System.out.println("zjadam " + pokarm);
        iloscPosilkow++;
        gramy += pokarm.getGramy();
    }

    @Override
    public int ilePosilkowZjedzone() {
        return iloscPosilkow;
    }

    @Override
    public int ileGramowZjedzone() {
        return gramy;
    }

    @Override
    public String toString() {
        return "Programista{" +
                "gramy=" + gramy +
                ", iloscPosilkow=" + iloscPosilkow +
                '}';
    }
}
