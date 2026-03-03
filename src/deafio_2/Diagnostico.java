package deafio_2;

public abstract class Diagnostico{
    private String descricao;
    private double valorExame;
    private int contadorExames;
    private Paciente paciente;

    Diagnostico(){
        contadorExames++;
        paciente = new Paciente();

    }

    public abstract void gerarRelatorio();

    public void setValorExame(double valorExame){
        if (valorExame > 0){
            this.valorExame = valorExame;
        }else{
            System.out.println("O valor do exame não pode ser igual ou menor que zero");
        }
    }
}
