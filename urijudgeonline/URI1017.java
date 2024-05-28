import java.util.Scanner;

public class URI1017 {
    public static void main(String args[]){
        double tempoGasto, velocidadeMedia;
        double qtdeLitros;

        Scanner teclado = new Scanner(System.in);

        tempoGasto =  (double)teclado.nextInt();
        velocidadeMedia = (double)teclado.nextInt();

        qtdeLitros = tempoGasto * velocidadeMedia / 12.0;

        System.out.printf("%.3f\n", qtdeLitros);
    }
}