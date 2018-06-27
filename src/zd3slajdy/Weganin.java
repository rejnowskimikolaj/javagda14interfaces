package zd3slajdy;

public class Weganin implements Jedzacy {
    private int gramy;
    private int iloscPosilkow;

    @Override
    public void jedz(Pokarm pokarm) {

        if (pokarm.getTypPokarmu() == TypPokarmu.NABIAL || pokarm.getTypPokarmu() == TypPokarmu.MIESO) {
            System.out.println("nie zjem tego! " + pokarm);
        } else {
            System.out.println("zjadam " + pokarm);
            iloscPosilkow++;
            gramy += pokarm.getGramy();
        }
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
        return "Weganin{" +
                "gramy=" + gramy +
                ", iloscPosilkow=" + iloscPosilkow +
                '}';
    }
}
