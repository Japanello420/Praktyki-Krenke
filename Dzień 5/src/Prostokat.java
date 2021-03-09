import java.lang.Math;
public class Prostokat
{
    private int bokA;
    private int bokB;

    public Prostokat(int bokA, int bokB)
    {
        this.bokA = bokA;
        this.bokB = bokB;
    }
    public int PoleProstokat() {
        return bokA * bokB;
    }
    public int Przekatne() {
        return (int) Math.sqrt(bokB * bokB + bokA * bokA);
    }
    public int getBokA() {
        return bokA;
    }
}