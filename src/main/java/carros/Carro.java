package carros;

public abstract class Carro {
    private String marca;
    private String modelo;
    private String motor;
    private int ano;
    private float peso;

    public Carro(String marca, String modelo, String motor, int ano, float peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.ano = ano;
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getMotor() {
        return motor;
    }
    public int getAno() {
        return ano;
    }
    public float getPeso() {
        return peso;
    }
    public void Produzir(){
        System.out.println("Produzindo o carro de marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Peso: " + peso);
    }

}
