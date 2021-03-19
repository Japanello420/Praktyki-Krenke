

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Zad 1
        System.out.println("Zadanie 1");
        Scanner scanner = new Scanner(System.in);
        List<String> array = new ArrayList<>();
        for(int i=0;i<10;i++) {
            String x = scanner.nextLine();
            boolean z=false;
            for(int j=0;j< array.size();j++) {
                if (array.get(j).equals(x)) {
                    z = true;
                }
            }
            if (z==false) {
                array.add(x);
            } else {
                System.out.println("Liczba sie powtarza, nie zostanie zapisana do tablicy");
            }
        }


        //Zad 2
        for(int i = 0; i < array.size(); i++){
            System.out.println("Array["+i+"] = "+array.get(i));
        }
        System.out.println("Zadanie 2");
        try {
            for(int j=0;j<5;j++){
                System.out.println("Podaj indeks");
                array.remove(scanner.nextInt());
            }
        }catch (java.util.InputMismatchException InputMismatchException){
            System.out.println("Zły typ danych");
        }

        //Zad 3
        System.out.println("Zadanie 3");
        for(int h=0;h<2;h++){
            System.out.println("Podaj idenks elemntu który chcesz podmienić");
            int x1=scanner.nextInt();
            scanner.nextLine();
            System.out.println("na co chesz podmienić el "+array.get(x1));
            String y1=scanner.nextLine();
            array.set(x1,y1);
        }
        for(int i = 0; i < array.size(); i++){
            System.out.println("Array["+i+"] = "+array.get(i));
        }
    }
}