package solid.isp.solucao;

public class Drone extends Veiculo implements ControlesCamera {

    private boolean cameraLigada;

    public boolean isCameraLigada() {
        return cameraLigada;
    }

    @Override
    public void ligarCamera() {
        cameraLigada = true;
    }

    @Override
    public void desligarCamera() {
        cameraLigada = false;
    }
}
