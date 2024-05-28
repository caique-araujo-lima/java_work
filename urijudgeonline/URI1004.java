import java.util.Scanner;

public class URI1004 {
    public static void main(String args[]){
        int a, b;
        int PROD;

        Scanner teclado = new Scanner(System.in);

        a = teclado.nextInt();
        b = teclado.nextInt();

        PROD = a * b;

        System.out.println("PROD = " + PROD);
    }
}