package zd3slajdy;

public class Pokarm {

    private String nazwa;
    private int gramy;
    private TypPokarmu typPokarmu;

    public Pokarm(String nazwa, int gramy, TypPokarmu typPokarmu) {
        this.nazwa = nazwa;
        this.gramy = gramy;
        this.typPokarmu = typPokarmu;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getGramy() {
        return gramy;
    }

    public TypPokarmu getTypPokarmu() {
        return typPokarmu;
    }

    @Override
    public String toString() {
        return "Pokarm{" +
                "nazwa='" + nazwa + '\'' +
                ", gramy=" + gramy +
                ", typPokarmu=" + typPokarmu +
                '}';
    }
}
