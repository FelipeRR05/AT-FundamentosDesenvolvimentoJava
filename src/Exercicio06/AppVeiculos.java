package Exercicio06;

public class AppVeiculos {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("ABC-1234", "Toyota Corolla", 2020, 25000);
        Veiculo carro2 = new Veiculo("XYZ-5678", "Honda Civic", 2018, 45000);

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();

        carro1.registrarViagem(350);
        carro2.registrarViagem(200);

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }
}