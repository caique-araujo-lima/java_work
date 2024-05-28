import java.util.Scanner;

public class URI1015 {
    public static void main(String args[]){
        double x1, y1;
        double x2, y2;
        double distancia;

        Scanner teclado = new Scanner(System.in);

        x1 = teclado.nextDouble();
        y1 = teclado.nextDouble();
        x2 = teclado.nextDouble();
        y2 = teclado.nextDouble();


        distancia = Math.sqrt(Math.pow(x1 - x2, 2.0) + Math.pow(y1 - y2, 2.0));
        System.out.printf("%.4f\n", distancia);

    }
}