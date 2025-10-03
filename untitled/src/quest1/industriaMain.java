package quest1;

import java.util.Scanner;

public class industriaMain {
    public static void main(String[] args) {
        Empregado emp = new Empregado();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        emp.nome = sc.nextLine();
        System.out.println("Digite sua matricula: ");
        emp.matricula = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite seu salário bruto: ");
        emp.salario_bruto = sc.nextDouble();
        System.out.println("seu nome: " + emp.nome);
        System.out.println("sua matricula: " + emp.matricula);
        System.out.println("salario bruto: " + emp.salario_bruto);
        System.out.println("redução do INSS: " + emp.calcularINSS());
        System.out.println("salario liquido: " + emp.calcularSalario_liquido());
    }
}