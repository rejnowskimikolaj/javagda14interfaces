package zd3slajdy;

public class Krokodyl implements Jedzacy{

    private int gramy;
    private int iloscPosilkow;
    @Override
    public void jedz(Pokarm pokarm) {

        if(pokarm.getTypPokarmu()==TypPokarmu.MIESO){
            System.out.println("zjadam "+pokarm);
            iloscPosilkow++;
            gramy+=pokarm.getGramy();
        }
        else{
            System.out.println("ble! "+pokarm);
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
        return "Krokodyl{" +
                "gramy=" + gramy +
                ", iloscPosilkow=" + iloscPosilkow +
                '}';
    }
}
