import java.util.Scanner;

public class URI1019{
    public static void main(String[] args){
        int N;
        int horas, minutos, segundos;

        Scanner teclado = new Scanner(System.in);

        N = teclado.nextInt();

        horas = N / 3600;
        N = N % 3600;
        minutos = N / 60;
        N = N % 60;
        segundos = N;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }
}