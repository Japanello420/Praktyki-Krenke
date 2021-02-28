public class Zadanie6
{
    public static void main(String[] args)
    {
        double[] a = {23.45, -2.22, 45.90, 67.45, -56, 234.11,-34.8, 90.4, -77};

        for(int i = 0; i < 9; i++ )
        {
            System.out.println("element [" + i + "]" + a[i] );
        }

        System.out.println();

        for (int j = 0; j < 9; j++)
        {
            System.out.println("element [" + j + "]" + a[8 - j] );
        }
    }
}