// Programa de adição que coleta a inserção de dois números, então realiza a soma deles
import java.util.Scanner; // O programa utiliza a classe Scanner


public class MediaAprovacaoConceito

{
    // método main inicia a execução do aplicativo Java
    public static void main(String[] args)
    {
        // Cria um Scanner para coletar os números que devem ser inseridos pelo usuário
        Scanner input = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;
        int nota4;
        float media;

        System.out.println("Esse programa calcula a média das notas para o ano letivo:");

        System.out.print("Insira a nota do primeiro bimestre: ");
        nota1 = input.nextInt();

        System.out.print("Insira a nota do segundo bimestre: ");
        nota2 = input.nextInt();

        System.out.print("Insira a nota do terceiro bimestre: ");
        nota3 = input.nextInt();

        System.out.print("Insira a nota do quarto bimestre: ");
        nota4 = input.nextInt();

        media = (nota1+nota2+nota3+nota4)/4;

        System.out.printf("A média anual é %f%n", media);
    }
}