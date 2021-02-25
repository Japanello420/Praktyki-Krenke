public class Zadanie2 {
    public static void main(String[] args) {
        int x = 7;
        int A = 0;
        int B = 1;
        int Fib;
        for(int i = 1; i <= x; i++)
        {
            Fib = A + B;
            System.out.print(Fib + "\t");
            A = B;
            B = Fib;
        }
    }
}