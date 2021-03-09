public class Praca {
    private int pensja;
    private String etat;
    boolean fajna;

    public Praca(int pensja, String etat, boolean fajna)
    {
        this.pensja = pensja;
        this.etat = etat;
        this.fajna = fajna;
    }
    public void wykonujePrace(){
        System.out.println("Wykonuje czynność");
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}