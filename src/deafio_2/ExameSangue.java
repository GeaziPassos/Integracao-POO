package deafio_2;

public class ExameSangue extends Diagnostico implements Auditavel{
    String indicadoresQuimicos;

    @Override
    public void gerarRelatorio(){
        System.out.println("Indicadores quimicido: " + indicadoresQuimicos);
    }

    @Override
    public void validarProtocolo(){
        System.out.println("Protocolo validado");
    }
}
