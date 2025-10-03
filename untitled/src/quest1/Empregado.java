package quest1;

public class Empregado {
    public String nome;
    public int matricula;
    public double salario_bruto;
    public double salario_liquido;

    public double calcularINSS() {
        return this.salario_bruto * 0.15;
    }

    public double calcularSalario_liquido() {
        return this.salario_liquido = this.salario_bruto - this.calcularINSS();
    }

    public void imprimir_cc() {
        System.out.println("Matrcula");
    }
}