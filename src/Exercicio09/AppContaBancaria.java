package Exercicio09;

import java.util.Scanner;

public class AppContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular da conta: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(nome, saldoInicial);

        conta.exibirSaldo();

        System.out.print("\nDigite o valor para depósito: ");
        double deposito = scanner.nextDouble();
        conta.depositar(deposito);
        conta.exibirSaldo();

        System.out.print("\nDigite o valor para saque: ");
        double saque = scanner.nextDouble();
        conta.sacar(saque);
        conta.exibirSaldo();

        scanner.close();
    }
}