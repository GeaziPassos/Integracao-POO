package desafio_1;

abstract class SondaEspacial {
    static private int sondasTotais;
    private int id;
    private int combustivel;
    private String missaoAtual;
    private static final int limiteRadiacaoMaxima = 100;

    SondaEspacial(){
        id = sondasTotais + 1;
        sondasTotais++;
    }

    public abstract void coletarDados(String dado);

    protected void consumirEnergia(int quantidade){
        combustivel = quantidade;
    }
}
