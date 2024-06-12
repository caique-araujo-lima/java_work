import java.util.Scanner;

public class URI1020{
    public static void main(String[]){
        int N;
        int anos, meses, dias;

        Scanner teclado = new Scanner(System.in);

        N = teclado.nextInt();

        anos = N / 365;
        N = N % 365;
        System.out.println(anos + " ano(s)");
        meses = N / 30;
        N = N % 30;
        System.out.println(meses + " mes(es)");
        dias = N;
        System.out.println(dias + " dia(s)");
    }
}