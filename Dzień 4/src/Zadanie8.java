import java.util.Scanner;

public class Zadanie8
{
    public static void main(String[] args)
    {
        Scanner postac = new Scanner(System.in);
        String nazwa;
        String rasa;
        String pochodzenie;
        String płeć;
        String klasa;
        String bron;
        System.out.println("Wybierz imię postaci:");
        nazwa = postac.nextLine();
        System.out.println("Wybierz rasę postaci:");
        rasa = postac.nextLine();
        System.out.println("Wpisz miasto pochodzenia postaci:");
        pochodzenie = postac.nextLine();
        System.out.println("Wpisz płeć postaci:");
        płeć = postac.nextLine();
        System.out.println("Wybierz klasę postaci:");
        klasa = postac.nextLine();
        System.out.println("Wybierz główną broń postaci:");
        bron = postac.nextLine();
        System.out.println("Stworzona przez ciebie postać to:");
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Rasa: " + rasa);
        System.out.println("Pochodzenie: " + pochodzenie);
        System.out.println("Płeć: " + płeć);
        System.out.println("Klasa: " + klasa);
        System.out.println("Broń: " + bron);



    }
}