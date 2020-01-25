package solid.ocp.violacao;


public class ManipuladorEventos {

    private Veiculo veiculo;

    public ManipuladorEventos(final Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void alterarModoConducao(final ModoConducao drivingMode) {
        switch (drivingMode) {
            case ESPORTE:
                veiculo.setPotencia(500);
                veiculo.setAlturaSuspensao(10);
                break;
            case CONFORTO:
                veiculo.setPotencia(400);
                veiculo.setAlturaSuspensao(20);
                break;
            default:
                veiculo.setPotencia(400);
                veiculo.setAlturaSuspensao(20);
                break;
            //quando precisarmos adicionar outro modo (por exemplo, ECONOMIA), 2 classes mudarão DrivingMode e EventHandler..
        }
    }
}
