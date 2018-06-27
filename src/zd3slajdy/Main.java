package zd3slajdy;

public class Main {

    public static void main(String[] args) {
        Pokarm udko = new Pokarm("udko z kurczaka",100,TypPokarmu.MIESO);
        Pokarm banan = new Pokarm("banan chicita",100,TypPokarmu.OWOCE);
        Pokarm kefir = new Pokarm("kefir",50,TypPokarmu.NABIAL);

        Krokodyl dundee = new Krokodyl();
        Jedzacy javaDev = new Programista();
        Jedzacy weganinAdas = new Weganin();

        dundee.jedz(udko);
        dundee.jedz(banan);
        dundee.jedz(kefir);

        javaDev.jedz(udko);
        javaDev.jedz(banan);
        javaDev.jedz(kefir);

        weganinAdas.jedz(udko);
        weganinAdas.jedz(banan);
        weganinAdas.jedz(kefir);

        System.out.println(weganinAdas);
        System.out.println(dundee);
        System.out.println(javaDev);

        Jedzacy[] jedzacies = {dundee,weganinAdas,javaDev};

        Krokodyl krokodylZtablicy = (Krokodyl) jedzacies[0];

    }
}
