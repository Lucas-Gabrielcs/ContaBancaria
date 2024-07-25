import java.util.Scanner;

public class Contabancaria {
    public static void main(String[] args) {
        String nome = "Kalleb Cardoso";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("***************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***************************");

        String menu = """
                \n*** Digite sua opção ***
                1 - Consultar saldo
                2 - Retirar valor
                3 - Depositar valor
                4 - Sair 
                """;

        Scanner leitura = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja retirar? ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transfência");
                } else {
                    saldo = saldo - valor;
                    System.out.println("Saldo atualizado: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor do deposito: ");
                double valor = leitura.nextDouble();
                saldo = saldo + valor;
                System.out.println("Saldo atualizado: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção invalida :(");
            }
        }
    }
}
