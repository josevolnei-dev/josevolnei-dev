public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.ano = 2022;
        carro.quantidadePortas = 4;

        carro.exibirInfo();
        carro.abrirPortaMalas();

        Moto moto = new Moto();
        moto.marca = "Honda";
        moto.modelo = "CG";
        moto.ano = 2021;
        moto.cilindradas = 160;

        moto.exibirInfo();
        moto.empinar();

        Onibus onibus = new Onibus();
        onibus.marca = "Mercedes";
        onibus.modelo = "Urbano";
        onibus.ano = 2020;
        onibus.quantidadePassageiros = 40;

        onibus.exibirInfo();
        onibus.abrirPorta();
    }
}