package desafio_1;

public class RoverSolo extends SondaEspacial{
    String tipoMineral;

    @Override
    void coletarDados(String tipoMineral){
        this.tipoMineral = tipoMineral;
    }
}
