package deafio_2;

public class RaioX extends Diagnostico implements Auditavel{
    int nivelRadiação;

    @Override
    public void gerarRelatorio(){
        System.out.println("Nivel de radiação utilizado: " + nivelRadiação);
    }

    @Override
    public void validarProtocolo(){
        System.out.println("Protocolo validado");
    }
}
