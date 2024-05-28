import java.util.Scanner;

public class URI1014 {
    public static void main(String args[]){
        int X;
        float Y, consumoMedio;

        Scanner teclado = new Scanner(System.in);

        X = teclado.nextInt();
        Y = teclado.nextFloat();

        consumoMedio = (float)X/Y;

        System.out.printf("%.3f km/l\n", consumoMedio);
    }
}