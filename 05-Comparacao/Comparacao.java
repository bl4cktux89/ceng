// Programa de adição que coleta a inserção de dois números, então realiza a soma deles
import java.util.Scanner; // O programa utiliza a classe Scanner


public class Comparacao

{
    // método main inicia a execução do aplicativo Java
    public static void main(String[] args)
    {
        // Cria um Scanner para coletar os números que devem ser inseridos pelo usuário
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.println("Esse programa compara dois números:");

        System.out.print("Insira o primeiro número: ");
        number1 = input.nextInt();

        System.out.print("Insira o segundo número: ");
        number2 = input.nextInt();

        if (number1 == number2) {
            System.out.printf("%d é igual a %d%n", number1, number2);
        }

        if (number1 != number2) {
            System.out.printf("%d é diferente de %d%n", number1, number2);
        }

        if (number1 < number2) {
            System.out.printf("%d é menor que %d%n", number1, number2);
        }

        if (number1 > number2) {
            System.out.printf("%d é maior que %d%n", number1, number2);
        }

        if (number1 <= number2) {
            System.out.printf("%d é menor ou igual a %d%n", number1, number2);
        }

        if (number1 >= number2) {
            System.out.printf("%d é maior ou igual a %d%n", number1, number2);
        }
    }
}
