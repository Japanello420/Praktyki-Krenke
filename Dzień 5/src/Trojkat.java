public class Trojkat
{
    private int podstawa;
    private int bokA;
    private int wysokosc;
    private int pole;

    public Trojkat(int podstawa, int bokA, int wysokosc)
    {
        this.podstawa = podstawa;
        this.bokA = bokA;
        this.wysokosc = wysokosc;
    }

    public void ObliczPole(){
        pole = (podstawa * wysokosc) /2;
    }
    public int getPodstawa() {
        return podstawa;
    }
    public void setPodstawa(int podstawa) {
        this.podstawa = podstawa;
    }
    public int getBokA() {
        return bokA;
    }
    public void setBokA(int bokA) {
        this.bokA = bokA;
    }
    public int getWysokosc() {
        return wysokosc;
    }
    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }
    public int getPole() {
        return pole;
    }
    public void setPole(int pole) {
        this.pole = pole;
    }
}