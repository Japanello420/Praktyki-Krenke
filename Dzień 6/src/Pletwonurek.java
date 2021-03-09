public class Pletwonurek extends Praca{
    boolean niebezpieczna;
    public Pletwonurek(int pensja, String etat, boolean oplacalna, boolean niebezpieczna) {
        super(pensja, etat, oplacalna);
        this.niebezpieczna = niebezpieczna;
    }
    @Override
    public void wykonujePrace(){
        System.out.println("Spawa");
    }
}