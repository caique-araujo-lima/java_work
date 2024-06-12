import java.util.Scanner;

public class URI1021{
    public static void main(String args[]){
        float N;
        int reais, centavos;
        int notas100, notas50, notas20, notas10, notas5, notas2;
        int moedas50, moedas25, moedas10, moedas5, moedas1;

        Scanner teclado = new Scanner(System.in);

        N = teclado.nextFloat();
        reais = (int)N;
        centavos = (int)(N*100) - reais*100;
        System.out.println("NOTAS:");
        notas100 = reais / 100;
        reais = reais % 100;
        System.out.printf("%d nota(s) de R$ 100.00\n", notas100);

        notas50 = reais / 50;
        reais = reais % 50;
        System.out.printf("%d nota(s) de R$ 50.00\n", notas50);

        notas20 = reais / 20;
        reais = reais % 20;
        System.out.printf("%d nota(s) de R$ 20.00\n", notas20);

        notas10 = reais / 10;
        reais = reais % 10;
        System.out.printf("%d nota(s) de R$ 10.00\n", notas10);

        notas5 = reais / 5;
        reais = reais % 5;
        System.out.printf("%d nota(s) de R$ 5.00\n", notas5);

        notas2 = reais / 2;
        reais = reais % 2;
        System.out.printf("%d nota(s) de R$ 2.00\n", notas2);
        
        System.out.println("MOEDAS:");
        moedas1 = reais;
        System.out.printf("%d moeda(s) de R$ 1.00\n", moedas1);

        moedas50 = centavos / 50;
        centavos = centavos % 50;
        System.out.printf("%d moeda(s) de R$ 0.50\n", moedas50);

        moedas25 = centavos / 25;
        centavos = centavos % 25;
        System.out.printf("%d moeda(s) de R$ 0.25\n", moedas25);

        moedas10 = centavos / 10;
        centavos = centavos % 10;
        System.out.printf("%d moeda(s) de R$ 0.10\n", moedas10);


        moedas5 = centavos / 5;
        centavos = centavos % 5;
        System.out.printf("%d moeda(s) de R$ 0.05\n", moedas5);


        moedas1 = centavos;
        System.out.printf("%d moeda(s) de R$ 0.01\n", moedas1);
    }
}