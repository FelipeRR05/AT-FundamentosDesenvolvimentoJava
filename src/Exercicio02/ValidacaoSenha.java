package Exercicio02;

import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senha;
        boolean senhaValida;

        do {
            System.out.print("\nDigite sua senha: ");
            senha = scanner.nextLine();
            senhaValida = validarSenha(senha);
        } while (!senhaValida);

        System.out.println("\nSenha cadastrada com sucesso.");
        scanner.close();
    }

    public static boolean validarSenha(String senha) {
        if (senha.length() < 8) {
            System.out.println("Erro: A senha deve ter pelo menos 8 caracteres.");
            return false;
        }
        if (!senha.matches(".*[A-Z].*")) {
            System.out.println("Erro: A senha deve conter pelo menos uma letra maiúscula.");
            return false;
        }
        if (!senha.matches(".*\\d.*")) {
            System.out.println("Erro: A senha deve conter pelo menos um número.");
            return false;
        }
        if (!senha.matches(".*[@#$%^&+=!].*")) {
            System.out.println("Erro: A senha deve conter pelo menos um caractere especial (@, #, $, etc.).");
            return false;
        }
        return true;
    }
}