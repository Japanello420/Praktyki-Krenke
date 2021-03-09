import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //
        //          ZADANIE 1
        //
        System.out.println();
        System.out.println("ZADANIE 1");
        System.out.println();
        Trojkat trojkat = new Trojkat(1,2,30);
        trojkat.ObliczPole();
        System.out.println(trojkat.getPole());
        //
        //          ZADANIE 2
        //
        System.out.println();
        System.out.println("ZADANIE 2");
        System.out.println();
        Prostokat prostokat = new Prostokat(5,6);
        prostokat.PoleProstokat();
        System.out.println(prostokat.PoleProstokat());
        prostokat.Przekatne();
        System.out.println(prostokat.Przekatne());
        //
        //          ZADANIE 3
        //
        System.out.println();
        System.out.println("ZADANIE 3");
        System.out.println();

        if(trojkat.getBokA()> prostokat.getBokA()){
            System.out.println("Bok trójkąta = "+trojkat.getBokA()+" jest większy od boku prostokąta = "+prostokat.getBokA());
        }
        if(trojkat.getBokA()< prostokat.getBokA()) {
            System.out.println("Bok prostokąta = " + prostokat.getBokA() + " jest większy od boku trójkąta = " + trojkat.getBokA());
        }
        //
        //          ZADANIE 4 CZĘŚĆ 1
        //
        System.out.println();
        System.out.println("ZADANIE 4 1/2");
        System.out.println();
        Scanner scan = new Scanner(System.in);
        boolean dzialaProgram = true;
        while(dzialaProgram) {
            Kalkulator Kalkulator = new Kalkulator();
            System.out.println("1-dodawanie, 2-odejmowanie, 3-mnożenie, 4-dzielenie, 5-stop");
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Wybrałeś dodawanie. Wybierz liczby: ");
                    double a = scan.nextDouble();
                    double b = scan.nextDouble();
                    System.out.println("Dodawnie = "+Kalkulator.dodawanie(a,b));
                    break;
                case 2:
                    System.out.println("Wybrałeś odejmowanie. Wybierz liczby: ");
                    double c = scan.nextDouble();
                    double d = scan.nextDouble();
                    System.out.println("Odejmnowanie = "+Kalkulator.odejmowanie(c,d));
                    break;
                case 3:
                    System.out.println("Wybrałeś mnożenie. Wybierz liczby: ");
                    double e = scan.nextDouble();
                    double f = scan.nextDouble();
                    System.out.println("Mnożenie = "+Kalkulator.mnozenie(e,f));
                    break;
                case 4:
                    System.out.println("Wybrałeś dzielenie. Wybierz liczby: ");
                    double g = scan.nextDouble();
                    double h = scan.nextDouble();
                    System.out.println("Dzielenie = "+Kalkulator.dzielenie(g,h));
                    break;
                case 5:
                    System.out.println("Dziękujemy za użycie kalkulatora!");
                    dzialaProgram = false;
                    break;
            }
        }
        //
        //          ZADANIE 4 CZĘŚĆ 2
        //
        System.out.println();
        System.out.println("ZADANIE 4 2/2");
        System.out.println();
        Okrag Okrag = new Okrag(8,5);
        System.out.println("Pole = "+Okrag.Pole()+"\nObwód = "+Okrag.Obwod());
        System.out.println("Promień okręgu = " + Okrag.getPromien());

    }
}