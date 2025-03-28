package Exercicio08;

public class AppFuncionarios {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Bernardo Prates", 8000.00);
        Funcionario estagiario = new Estagiario("Felipe Roberto Rocha", 2000.00);

        gerente.exibirDetalhes();
        estagiario.exibirDetalhes();
    }
}