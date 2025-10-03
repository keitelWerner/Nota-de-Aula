package quest4;

import java.util.ArrayList;
import java.util.List;

// ===== Sistema Hospitalar =====
class Medico {
    String nome, crm;
    Medico(String nome, String crm) { this.nome = nome; this.crm = crm; }
    void exibir() { System.out.println(nome + " | CRM: " + crm); }
}

class ClinicoGeral extends Medico {
    ClinicoGeral(String nome, String crm) { super(nome, crm); }
    void atender() { System.out.println(nome + " atende um paciente."); }
}

class Cirurgiao extends Medico {
    Cirurgiao(String nome, String crm) { super(nome, crm); }
    void operar() { System.out.println(nome + " realiza uma cirurgia."); }
}

// ===== Sistema de Vendas =====
class Cliente {
    String nome;
    List<Pedido> pedidos = new ArrayList<>();
    Cliente(String nome) { this.nome = nome; }
    void adicionar(Pedido p) { pedidos.add(p); }
    void mostrar() { for(Pedido p : pedidos) p.exibir(); }
}

class Vendedor {
    String nome;
    List<Pedido> pedidos = new ArrayList<>();
    Vendedor(String nome) { this.nome = nome; }
    void emitir(Pedido p) { pedidos.add(p); }
    void mostrar() { for(Pedido p : pedidos) p.exibir(); }
}

class Pedido {
    int numero;
    double valor;
    Cliente cliente;
    Vendedor vendedor;
    Pedido(int numero, double valor, Cliente c, Vendedor v) {
        this.numero = numero; this.valor = valor; this.cliente = c; this.vendedor = v;
    }
    void exibir() {
        System.out.println("Pedido " + numero + " | R$ " + valor + " | Cliente: " + cliente.nome + " | Vendedor: " + vendedor.nome);
    }
}
