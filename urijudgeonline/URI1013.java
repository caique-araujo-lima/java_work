import java.util.Scanner;

public class URI1013 {
    public static void main(String args[]){
        int a, b, c;
        int maiorAB, maior;

        Scanner teclado = new Scanner(System.in);

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        maiorAB = (a + b + Math.abs(a - b))/2;
        maior = (c + maiorAB + Math.abs(c - maiorAB))/2;

        System.out.println(maior + " eh o maior");

    }
}