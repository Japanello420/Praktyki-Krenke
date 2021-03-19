import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int tab[]=new int[4];
        try
        {
            for (int i = 0; i < 5; i++)
            {
                tab[i] = scanner.nextInt();
            }
        }
        catch (InputMismatchException inputmismatchexception)
        {
            System.out.println("Nie podano liczb typu int - całkowitych");
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("Podano za dużo liczb do tablicy");
        }
    }
} 