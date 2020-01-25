package solid.isp.solucao;

public abstract class Veiculo implements ControlesMotor {

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