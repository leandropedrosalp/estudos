package solid.isp.violacao;

public abstract class Veiculo implements Controles {

    private boolean motorFuncionando;

    public boolean isMotorFuncionando() {
        return motorFuncionando;
    }

    @Override
    public void ligarMotor() {
        motorFuncionando = true;
    }

    @Override
    public void desligarMotor() {
        motorFuncionando = false;
    }

}