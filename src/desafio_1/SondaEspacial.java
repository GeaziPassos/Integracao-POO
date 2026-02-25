package desafio_1;

abstract class SondaEspacial {
    int id;
    int combustivel;
    String missaoAtual;
    final int limiteRadiacaoMaxima = 100;

    SondaEspacial(){
        id += 1;
    }

    abstract void coletarDados();

    protected void consumirEnergia(int quantidade){
        combustivel = quantidade;
    }
}
