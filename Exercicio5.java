/*Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)

*/
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o valor do seu salário: ");
        double salarioUsuario = scanner.nextDouble();

        // Cálculo da quantidade de salários mínimos
        double quantidadeSalarios = salarioUsuario / salarioMinimo;

        // Saída
        System.out.println("Você ganha o equivalente a " + quantidadeSalarios + " salários mínimos.");

        scanner.close();
    }
}
