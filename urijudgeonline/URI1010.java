import java.util.Scanner;


public class URI1010 {
    public static void main(String args[]){
        int codigoPeca1, codigoPeca2;
        int numeroPecas1, numeroPecas2;
        double valorPeca1, valorPeca2;
        double totalPagar;

        Scanner teclado = new Scanner(System.in);

        codigoPeca1 = teclado.nextInt();
        numeroPecas1 = teclado.nextInt();
        valorPeca1 = teclado.nextDouble();
        
        codigoPeca2 = teclado.nextInt();
        numeroPecas2 = teclado.nextInt();
        valorPeca2 = teclado.nextDouble();

        totalPagar = ((float)numeroPecas1 * valorPeca1) + ((float)numeroPecas2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalPagar);
    }
}