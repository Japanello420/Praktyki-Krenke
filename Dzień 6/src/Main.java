public class Main {
    public  static void main(String[] args){
        //
        // ZADANIE 1
        //
        System.out.println("");
        System.out.println("ZADANIE 1");
        System.out.println("");
        Kwadrat kwadrat = new Kwadrat(4);
        System.out.println(kwadrat.Pole());

        Prostokat prostokat = new Prostokat(5,8);
        System.out.println(prostokat.Pole());

        //
        // ZADANIE 2
        //
        System.out.println("");
        System.out.println("ZADANIE 2");
        System.out.println("");
        Kot kot = new Kot(2,4,"Sergei","Szara",4);
        kot.dajGlos();

        //
        // ZADANIE 3
        //
        System.out.println("");
        System.out.println("ZADANIE 3");
        System.out.println("");
        Pletwonurek Pletwonurek = new Pletwonurek(4000,"pełny",true,true);
        Pletwonurek.wykonujePrace();

        //
        // ZADANIE 4
        //
        System.out.println("");
        System.out.println("ZADANIE 4");
        System.out.println("");
        System.out.println(" Która metoda przysłania metodę z klasy nadrzędnej/superclass?\n (bez methodOne bo jest to inny typ zmiennej), methodTwo, methodFour");
        System.out.println(" Która metoda jest ukryta/niewidzialna w klasie B?\nmethodThree i medtodOne");


    }

}