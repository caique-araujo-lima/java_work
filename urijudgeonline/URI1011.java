import java.util.Scanner;

public class URI1011 {
    public static void main(String args[]){
        double R, VOLUME;
        double pi = 3.14159;

        Scanner teclado = new Scanner(System.in);

        R = teclado.nextDouble();

        VOLUME = (4.0/3.0) * pi * (Math.pow(R, 3.0));

        System.out.printf("VOLUME = %.3f\n", VOLUME);

    }
}