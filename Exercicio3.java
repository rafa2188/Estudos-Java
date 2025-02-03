/*  Informar um saldo e imprimir o saldo com reajuste de 1%.    */


import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Cálculo do reajuste
        double saldoReajustado = saldo * 1.01;

        // Saída
        System.out.println("Saldo com reajuste de 1%: " + saldoReajustado);

        scanner.close();
    }
}

