public class Zadanie5
{
    public static void main(String[] args)
    {
        double[] a = {23.45, -2.22, 45.90, 67.45, -56, 234.11,-34.8, 90.4, -77};
        double min = a[0];
        double max = a[0];
        int pmin = 0;
        int pmax = 0;
        for(int i = 0; i < 9; i++)
        {
            if(max < a[i])
            {
                max = a[i];
                pmax = i;
            }
            if(min > a[i])
            {
                min = a[i];
                pmin = i;
            }
            System.out.println("element [" + i + "] = " + a[i]);
        }
        a[pmax] = min;
        a[pmin] = max;

        System.out.println();

        for( int j = 0; j < 9; j++)
        {
            System.out.println("element [" + j + "] = " + a[j]);
        }
    }
}