import java.util.Scanner;

public class URI1001 {
    public static void main(String args[]){
        int A;
        int B;
        int X;
        Scanner teclado = new Scanner(System.in);

        A = teclado.nextInt();
        B = teclado.nextInt();

        X = A + B;
        System.out.println("X = " + X);
    }
}