import java.util.Scanner;

public class URI1012 {
    public static void main(String args[]) {
        double A, B, C;
        double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        double pi = 3.14159;

        Scanner teclado = new Scanner(System.in);

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        areaTriangulo = (A * C)/2.0;
        areaCirculo = pi * C * C;
        areaTrapezio = ( A + B ) * C / 2.0;
        areaQuadrado = B * B;
        areaRetangulo = A * B;
        
        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
        
    }
}