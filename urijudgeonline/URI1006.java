import java.util.Scanner;

public class URI1006 {
    public static void main(String args[]){
        double A, B, C;
        double MEDIA;

        Scanner teclado = new Scanner(System.in);

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        MEDIA = (A * 0.2) + (B * 0.3) + (C * 0.5);
        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }
}