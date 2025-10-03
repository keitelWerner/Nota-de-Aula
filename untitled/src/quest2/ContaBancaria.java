package quest2;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0; // saldo inicial é zero
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual da conta %s (Titular: %s): R$ %.2f%n", numeroConta, titular, saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.printf("Transferência de R$ %.2f realizada para a conta %s (Titular: %s).%n",
                    valor, destino.numeroConta, destino.titular);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para transferência.");
        }
    }
}
