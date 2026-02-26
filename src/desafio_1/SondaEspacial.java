package desafio_1;

abstract class SondaEspacial {
    int id;
    int combustivel;
    String missaoAtual;
    final int limiteRadiacaoMaxima = 100;

    SondaEspacial(){
        id += 1;
    }

    public abstract void coletarDados(String dado);

    protected void consumirEnergia(int quantidade){
        combustivel = quantidade;
    }
}
