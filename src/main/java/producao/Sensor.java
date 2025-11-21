package producao;

public class Sensor {
    private String nome;
    private String tipo;
    private boolean ativo;

    public Sensor(String nome, String tipo, boolean ativo) {
        this.nome = nome;
        this.tipo = tipo;
        this.ativo = ativo;
    }

    public void SensorAtivo(){
        this.ativo = true;
        System.out.println("Sensor ativo e funcionado!");
    }

    public void SensorDesativar(){
        this.ativo = false;
        System.out.println("Sensor desativar!");
    }

    public void VerificaSensor(){
        if(!this.ativo){
            System.out.println("Sensor não esta ativo, ative ele para prosseguir com a verificação!");
            return;
        }

        System.out.println("Sensor esta ativo!");

    }

}
