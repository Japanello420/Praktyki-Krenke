import java.util.Scanner;

public class Zadanie3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean programIsRunning = true;

        while(programIsRunning)
        {
            System.out.print("Podaj numer drzwi, aby wydostać się z lochu: ");
            String userInput = sc.next();

            switch (userInput)
            {
                case "1": {
                    System.out.println("Wybrałeś złe drzwi");
                    break;
                }
                case "2": {
                    System.out.println("Wybrałeś złe drzwi");
                    break;
                }
                case "3": {
                    programIsRunning = false;
                    break;
                }
                case "4": {
                    System.out.println("Wybrałeś złe drzwi");
                    break;
                }
                case "5": {
                    System.out.println("Wybrałeś złe drzwi");
                    break;
                }
                default: {
                    System.out.println("Podałeś złe dane!");
                }
            }
        }

        System.out.println("Brawo udało ci się wyjść z lochu!");
    }
}