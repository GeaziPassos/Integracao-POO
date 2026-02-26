package desafio_1;

public class RoverSolo extends SondaEspacial implements ComunicacaoDeepSpace{
    String tipoMineral;

    @Override
    public void coletarDados(String tipoMineral){
        this.tipoMineral = tipoMineral;
    }

    @Override
    public void enviarSinal(String dados){

    }
}
