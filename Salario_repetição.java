import java.util.Scanner;

public class Salario_repetição {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        double taxaInflacao = 3.8;

        while (true) {
            System.out.print("\nDigite o salário atual do colaborador (ou digite 'sair' para encerrar): ");
            String entrada = entradaUsuario.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa...");
                break;
            }

            double salario;
            try {
                salario = Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, insira um número válido ou 'sair'.");
                continue; 
            }

            double taxaReajuste = 0;
            double valorReajuste = 0;
            double salarioAjustado = 0;
            double ganhoReal = 0;

            if (salario <= 280) {
                taxaReajuste = 20;
            } else if (salario > 280 && salario <= 700) {
                taxaReajuste = 15;
            } else if (salario > 700 && salario <= 1500) {
                taxaReajuste = 10;
            } else {
                taxaReajuste = 5;
            }

            valorReajuste = salario * (taxaReajuste / 100);
            salarioAjustado = salario + valorReajuste;
            ganhoReal = valorReajuste - (salario * (taxaInflacao / 100));

            System.out.println("\n--- Resultado ---");
            System.out.printf("1. Salário antes do reajuste: R$ %.2f%n", salario);
            System.out.printf("2. Percentual de aumento aplicado: %.1f%%%n", taxaReajuste);
            System.out.printf("3. Valor do aumento: R$ %.2f%n", valorReajuste);
            System.out.printf("4. Novo salário, após o aumento: R$ %.2f%n", salarioAjustado);
            System.out.printf("5. Valor do aumento real, descontado a inflação: R$ %.2f%n", ganhoReal);
        }

        entradaUsuario.close();
    }
}
