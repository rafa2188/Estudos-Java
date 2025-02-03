/* 4. Escrever um algoritmo que lê:
‑ a porcentagem do IPI a ser acrescido no valor das peças
‑ o código da peça 1, valor unitário da peça 1, quantidade de peças 1
‑ o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
    */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a porcentagem do IPI: ");
        double ipi = scanner.nextDouble();

        System.out.print("Digite o código da peça 1: ");
        int codigo1 = scanner.nextInt();
        System.out.print("Digite o valor unitário da peça 1: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite a quantidade da peça 1: ");
        int quantidade1 = scanner.nextInt();

        System.out.print("Digite o código da peça 2: ");
        int codigo2 = scanner.nextInt();
        System.out.print("Digite o valor unitário da peça 2: ");
        double valor2 = scanner.nextDouble();
        System.out.print("Digite a quantidade da peça 2: ");
        int quantidade2 = scanner.nextInt();

        // Cálculo do valor total
        double valorTotal = (valor1 * quantidade1 + valor2 * quantidade2) * (ipi / 100 + 1);

        // Saída
        System.out.println("O valor total a ser pago é: " + valorTotal);

        scanner.close();
    }
}

