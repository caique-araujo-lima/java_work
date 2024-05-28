import java.util.Scanner;

public class URI1005 {
    public static void main(String args[]){
        double A, B;
        double MEDIA;

        Scanner teclado = new Scanner(System.in);

        A = teclado.nextDouble();
        B = teclado.nextDouble();

        MEDIA = ((A * 0.35) + (B * 0.75))*(10.0/11.0);

        System.out.printf("MEDIA = %.5f\n", MEDIA); 
    }
}