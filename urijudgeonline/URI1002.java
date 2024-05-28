import java.util.Scanner;

public class URI1002 {
    public static void main(String args[]){
        double area, raio;
        double n = 3.14159;

        Scanner teclado = new Scanner(System.in);

        raio = teclado.nextDouble();
        area = n * raio * raio;

        System.out.printf("A=%.4f\n", area);

    }
}