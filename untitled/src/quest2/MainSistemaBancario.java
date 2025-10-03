package quest2;

import java.util.Scanner;

public class MainSistemaBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando duas contas para simulação
        ContaBancaria conta1 = new ContaBancaria("001", "João");
        ContaBancaria conta2 = new ContaBancaria("002", "Maria");

        int opcao;
        do {
            System.out.println("\n=== MENU BANCÁRIO ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    conta1.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDep = sc.nextDouble();
                    conta1.depositar(valorDep);
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = sc.nextDouble();
                    conta1.sacar(valorSaque);
                    break;
                case 4:
                    System.out.print("Digite o valor para transferência: ");
                    double valorTransf = sc.nextDouble();
                    conta1.transferir(conta2, valorTransf);
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}

