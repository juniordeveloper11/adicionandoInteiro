import java.util.Scanner;
public class adiconandoInteiros {

    public static void main(String[] args) {
        //criar um Scanner para obter entrada a partir da janela de comandos

        Scanner input = new Scanner(System.in);

        int numero1;// primeiro numero a somar
        int numero2;// segundo numero a somar
        int soma;// soma de numero1 e numero2

        System.out.println("inserir o primeiro inteiro");//prompt
        numero1 = input.nextInt();//primeiro numero fornecido pelo usuario


        System.out.println("inserir o segundo inteiro");//prompt
        numero2 = input.nextInt();//segundo numero fornecido pelo usuario

        soma = numero1 + numero2;//soma dos numeros.depois armazena o total da soma

        System.out.printf("soma é %d%n", soma);//exibe a soma

    }

}
