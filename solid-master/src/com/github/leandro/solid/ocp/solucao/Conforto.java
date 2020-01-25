package solid.ocp.solucao;

public class Conforto implements ModoConducao {

    private static final int POTENCIA = 400;
    private static final int ALTURASUSPENSAO = 20;

    @Override
    public int getPotencia() {
        return POTENCIA;
    }

    @Override
    public int getAlturaSuspensao() {
        return ALTURASUSPENSAO;
    }
}

