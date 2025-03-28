package Exercicio08;

public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void exibirDetalhes() {
        System.out.println("\nNome: " + nome);
        System.out.printf("Salário Final: R$ %.2f%n", calcularSalario());
    }
}