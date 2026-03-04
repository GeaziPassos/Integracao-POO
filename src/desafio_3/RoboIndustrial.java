package desafio_3;

public abstract class RoboIndustrial {
    String modelo;
    boolean statusOperacional;
    public ProcessadorCentral processador;

    RoboIndustrial(){
        this.processador = new ProcessadorCentral();
    }

    public abstract void executarTarefa();
//    public abstract void executarTarefa(String sla);


    public void verificarSaude(RoboIndustrial r){
        if (statusOperacional){
            executarTarefa();
        }
    }

    public static double obterTemperaturaAmbiente(){
        return 29.9;
    }

}
