// Programa de adição que coleta a inserção de dois números, então realiza a soma deles
import java.util.Scanner; // O programa utiliza a classe Scanner


public class Addition

{
    // método main inicia a execução do aplicativo Java
    public static void main(String[] args)
    {
        // Cria um Scanner para coletar os números que devem ser inseridos pelo usuário
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Insira o primeiro número: "); // Prompt
        number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário

        System.out.print("Insira o segundo número: "); // Prompt
        number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário

        sum = number1 + number2;

        System.out.printf("A soma é %d%n", sum);
    }
}