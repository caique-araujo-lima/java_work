import java.util.Scanner;

class URI1003 {
    public static void main(String args[]){
        int A, B;
        int SOMA;
        Scanner teclado = new Scanner(System.in);

        A = teclado.nextInt();
        B = teclado.nextInt();

        SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
    }
}