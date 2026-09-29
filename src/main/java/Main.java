import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Setup
        Scanner sc = new Scanner(System.in);
        
        //Input
        double salario = sc.nextDouble();

        int percentual;

        //Logic
        if (salario <= 400.00) {
            percentual = 15;
        } else if (salario <= 800.00) {
            percentual = 12;
        } else if (salario <= 1200.00) {
            percentual = 10;
        } else if (salario <= 2000.00) {
            percentual = 7;
        } else {
            percentual = 4;
        }

        //Operation
        double reajuste = salario * (percentual / 100.0);
        double novoSalario = salario + reajuste;

        //Output
        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.println("Em percentual: " + percentual + " %");

        sc.close();
    }
}