package Exercicio06;

public class Veiculo {
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes() {
        System.out.println("\nPlaca: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.printf("Quilometragem: %.2f km%n", quilometragem);
    }

    public void registrarViagem(double km) {
        if (km > 0) {
            quilometragem += km;
            System.out.printf("\nViagem registrada: %.2f km adicionados\n", km);
        } else {
            System.out.println("A quilometragem da viagem deve ser maior que zero.");
        }
    }
}