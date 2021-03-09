public class Kot extends Zwierze{
    private String sierść;
    private int dlugoscogona;

    public Kot(int wiek, int ilosckonczyn, String nazwa, String sierść, int dlugoscogona) {
        super(wiek, ilosckonczyn, nazwa);
        this.sierść = sierść;
        this.dlugoscogona = dlugoscogona;
    }
    @Override
    public void dajGlos(){
        System.out.println("Miauuuuu");
    }

    public String getSierść() {
        return sierść;
    }

    public void setSierść(String sierść) {
        this.sierść = sierść;
    }

    public int getDlugoscogona() {
        return dlugoscogona;
    }

    public void setDlugoscogona(int dlugoscogona) {
        this.dlugoscogona = dlugoscogona;
    }
}