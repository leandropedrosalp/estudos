package solid.dip.violacao;

public class Piloto {

    // Piloto só conhece Carro de corrida caso precise de um outro veículo ele não conhecerá
    private CarroDeCorrida veiculo;

    public Piloto() {
        this.veiculo = new CarroDeCorrida(100);
    }

    public void aumenteVelocidade() {
        veiculo.acelerar();
    }
}
