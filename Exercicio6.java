/*Desenvolva um algoritmo em
Java que leia um número
inteiro e imprima o seu antecessor e seu sucessor
*/
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Cálculo
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        // Saída
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        scanner.close();
    }
}
