import java.util.Scanner;

public class URI1008 {
    public static void main(String args[]){
        int number, horasTrabalhadas;
        double valorHora, salario;

        Scanner teclado = new Scanner(System.in);

        number = teclado.nextInt();
        horasTrabalhadas = teclado.nextInt();
        valorHora = teclado.nextDouble();
        
        salario = (double)horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salario); 
        
    }
}