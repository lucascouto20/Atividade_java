import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do colaborador: R$ ");
        double salario = scanner.nextDouble();

        double percentualAumento = 0;
        double aumento = 0;
        double novoSalario = 0;
        double aumentoReal = 0;
        double inflacao = 3.8;

        if (salario <= 280) {
            percentualAumento = 20;
        } else if (salario > 280 && salario <= 700) {
            percentualAumento = 15;
        } else if (salario > 700 && salario <= 1500) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }

        aumento = salario * (percentualAumento / 100);
        novoSalario = salario + aumento;
        aumentoReal = aumento - (salario * (inflacao / 100));

        System.out.println("\n--- Resultado ---");
        System.out.printf("1. Salário antes do reajuste: R$ %.2f%n", salario);
        System.out.printf("2. Percentual de aumento aplicado: %.1f%%%n", percentualAumento);
        System.out.printf("3. Valor do aumento: R$ %.2f%n", aumento);
        System.out.printf("4. Novo salário, após o aumento: R$ %.2f%n", novoSalario);
        System.out.printf("5. Valor do aumento real, descontado a inflação: R$ %.2f%n", aumentoReal);

        scanner.close();
    }
}
