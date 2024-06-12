import java.util.Scanner;

public class URI1018{
    public static void main(String args[]){
        int N;
        int notas100, notas50, notas20, notas10, notas5, notas2, notas1;

        Scanner teclado = new Scanner(System.in);

        N = teclado.nextInt();


        System.out.printf("%d\n", N);
        
        notas100 = N / 100;
        N = N % 100;
        System.out.printf("%d nota(s) de R$ 100,00\n", notas100);
        notas50 = N / 50;
        N = N % 50;
        System.out.printf("%d nota(s) de R$ 50,00\n", notas50);
        notas20 = N / 20;
        N = N % 20;
        System.out.printf("%d nota(s) de R$ 20,00\n", notas20);
        notas10 = N / 10;
        N = N % 10;
        System.out.printf("%d nota(s) de R$ 10,00\n", notas10);
        notas5 = N / 5;
        N = N % 5;
        System.out.printf("%d nota(s) de R$ 5,00\n", notas5);
        notas2 = N / 2;
        N = N % 2;
        System.out.printf("%d nota(s) de R$ 2,00\n", notas2);
        notas1 = N;
        System.out.printf("%d nota(s) de R$ 1,00\n", notas1);

    }
}