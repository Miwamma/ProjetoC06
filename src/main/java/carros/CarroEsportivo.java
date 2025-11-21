package carros;

public class CarroEsportivo extends Carro {
    public CarroEsportivo(String marca, String modelo, String motor, int ano, float peso){
        super(marca, modelo, motor, ano, peso);
    }

    public void Produzir() {
        System.out.println("Carro popular de marca: " + getMarca() + " e modelo: " + getModelo() + " do ano: " + getAno());
        System.out.println("Está sendo produzido, seu motor é um: " + getMotor() + " e pesa: " + getPeso());

    }
}
