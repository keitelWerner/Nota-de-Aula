package quest3;

public class Filme {
    private String nome;
    private String genero;
    private int ano;
    private int duracao;
    private int somaNotas;
    private int qtdAvaliacoes;

    // Construtor
    public Filme(String nome, String genero, int ano, int duracao) {
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.duracao = duracao;
        this.somaNotas = 0;
        this.qtdAvaliacoes = 0;
    }

    // Exibir detalhes do filme
    public void exibirDetalhes() {
        System.out.println("\n=== Detalhes do Filme ===");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de lançamento: " + ano);
        System.out.println("Duração: " + duracao + " minutos");
    }

    // Avaliar o filme
    public void avaliar(int nota) {
        if (nota >= 0 && nota <= 10) {
            somaNotas += nota;
            qtdAvaliacoes++;
            System.out.println("Avaliação registrada com sucesso!");
        } else {
            System.out.println("Nota inválida. Digite entre 0 e 10.");
        }
    }

    // Calcular média das avaliações
    public double calcularMediaAvaliacoes() {
        if (qtdAvaliacoes == 0) {
            return 0.0;
        }
        return (double) somaNotas / qtdAvaliacoes;
    }
}
