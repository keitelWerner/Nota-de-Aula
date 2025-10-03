package quest4;


public class Main {
    public static void main(String[] args) {
        // Hospital
        ClinicoGeral c = new ClinicoGeral("Dr. João", "12345");
        Cirurgiao s = new Cirurgiao("Dra. Maria", "67890");

        System.out.println("=== Hospital ===");
        c.exibir(); c.atender();
        s.exibir(); s.operar();

        // Vendas
        Cliente cli1 = new Cliente("Alice");
        Cliente cli2 = new Cliente("Bob");
        Vendedor vend1 = new Vendedor("Carlos");
        Vendedor vend2 = new Vendedor("Diana");

        Pedido p1 = new Pedido(1, 500, cli1, vend1);
        Pedido p2 = new Pedido(2, 300, cli1, vend2);
        Pedido p3 = new Pedido(3, 700, cli2, vend1);

        cli1.adicionar(p1); cli1.adicionar(p2);
        cli2.adicionar(p3);

        vend1.emitir(p1); vend1.emitir(p3);
        vend2.emitir(p2);

        System.out.println("\n=== Vendas ===");
        cli1.mostrar();
        cli2.mostrar();
        vend1.mostrar();
        vend2.mostrar();
    }
}
