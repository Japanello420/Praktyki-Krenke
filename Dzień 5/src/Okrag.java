public class Okrag {
    private double srednica;
    private double promien;

    public Okrag(double srednica, double promien)
    {
        this.srednica = srednica;
        this.promien = srednica/2;
    }

    public double Pole(){
        return promien * promien * 3;
    }
    public double Obwod(){
        return 2*3*promien;
    }

    public double getSrednica()
    {
        return srednica;
    }

    public void setSrednica(double srednica)
    {
        this.srednica = srednica;
    }

    public double getPromien() {
        return promien;
    }

}