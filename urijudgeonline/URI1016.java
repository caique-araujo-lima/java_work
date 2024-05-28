import java.util.Scanner;

public class URI1016 {
    public static void main(String args[]){
        int X = 60;
        int Y = 90;
        int distancia, tempo;

        Scanner teclado = new Scanner(System.in);

        distancia = teclado.nextInt();
        
        tempo = distancia *  60 / (Y - X);

        System.out.println(tempo + " minutos");

    }
}