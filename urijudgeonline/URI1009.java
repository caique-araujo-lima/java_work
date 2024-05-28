import java.util.Scanner;

public class URI1009 {
    public static void main(String args[]){
        String nome;
        double salarioBase, totalVendas, salarioFinal;

        Scanner teclado = new Scanner(System.in);

        nome = teclado.nextLine();
        salarioBase = teclado.nextDouble();
        totalVendas = teclado.nextDouble();

        salarioFinal = salarioBase + (totalVendas*0.15);

        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);

    }
}