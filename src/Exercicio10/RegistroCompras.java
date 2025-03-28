package Exercicio10;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class RegistroCompras {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path arquivoCompras = Path.of("compras.txt");

        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 3; i++) {
            System.out.print("\nDigite o nome do produto " + i + ": ");
            String produto = scanner.nextLine();

            System.out.print("Digite a quantidade: ");
            int quantidade = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite o preço unitário: ");
            double preco = Double.parseDouble(scanner.nextLine());

            double total = quantidade * preco;
            builder.append(String.format("Produto: %s | Quantidade: %d | Preço: R$ %.2f | Total: R$ %.2f%n",
                    produto, quantidade, preco, total));
        }

        Files.writeString(arquivoCompras, builder.toString(), StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);

        System.out.println("\nCompras Registradas: ");
        List<String> linhas = Files.readAllLines(arquivoCompras, StandardCharsets.UTF_8);
        linhas.forEach(System.out::println);
    }
}