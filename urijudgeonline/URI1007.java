import java.util.Scanner;

public class URI1007 {
    public static void main(String args[]){
        int A, B, C, D;
        int DIFERENCA;

        Scanner teclado = new Scanner(System.in);

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        DIFERENCA = (A * B) - (C * D);

        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}