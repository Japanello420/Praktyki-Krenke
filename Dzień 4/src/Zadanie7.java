import java.util.Random;

public class Zadanie7
{
    public static void main(String[] args)
    {
        Random random = new Random();
        double[] A = {23.45, -2.22, 45.90, 67.45, -56, 234.11,-34.8, 90.4, -77};
        int los = random.nextInt(9);
        int los2 = random.nextInt(9);
        if (A[los] > A[los2])
        {
            System.out.println("Liczba " + A[los] + " jest większa od liczby " + A[los2]);
        }
        if (A[los] < A[los2])
        {
            System.out.println("Liczba " + A[los] + " jest mniejsza od liczby " + A[los2]);
        }
        if (A[los] == A[los2])
        {
            System.out.println("Liczba " + A[los] + " jest równa liczbie " + A[los2]);
        }
    }
}