package quest3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Filme filme = null;

        while (true) {
            System.out.println("\n=== MENU STREAMING ===");
            System.out.println("1 - Cadastrar um título");
            System.out.println("2 - Exibir detalhes do título");
            System.out.println("3 - Avaliar o título");
            System.out.println("4 - Exibir média das avaliações");
            System.out.println("5 - Encerrar");
            int opcao = lerInteiro(sc, "Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do filme: ");
                    String nome = sc.nextLine().trim();
                    System.out.print("Digite o gênero: ");
                    String genero = sc.nextLine().trim();
                    int ano = lerInteiro(sc, "Digite o ano de lançamento: ");
                    int duracao = lerInteiro(sc, "Digite a duração em minutos: ");
                    filme = new Filme(nome, genero, ano, duracao);
                    System.out.println("Filme cadastrado com sucesso!");
                    break;

                case 2:
                    if (filme != null) {
                        filme.exibirDetalhes();
                    } else {
                        System.out.println("Nenhum filme cadastrado.");
                    }
                    break;

                case 3:
                    if (filme != null) {
                        int nota = lerInteiro(sc, "Digite uma nota (0 a 10): ");
                        filme.avaliar(nota);
                    } else {
                        System.out.println("Nenhum filme cadastrado.");
                    }
                    break;

                case 4:
                    if (filme != null) {
                        System.out.println("Média das avaliações: " + filme.calcularMediaAvaliacoes());
                    } else {
                        System.out.println("Nenhum filme cadastrado.");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    // Método auxiliar para ler inteiros
    public static int lerInteiro(Scanner sc, String mensagem) {
        System.out.print(mensagem);
        while (!sc.hasNextInt()) {
            System.out.println("Por favor, digite um número válido.");
            sc.next();
        }
        int valor = sc.nextInt();
        sc.nextLine(); // Consumir quebra de linha
        return valor;
    }
}
