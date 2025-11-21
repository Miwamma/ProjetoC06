package comprador;
import carros.Carro;

import java.util.ArrayList;
import java.util.List;

public class Cliente{
    private String nome;
    private String cpf;
    private List<Carro> carroscomprados;

    public Cliente() {
        if(nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("O clinete PRECISA ter um nome.");
        }
        if(cpf == null || cpf.isEmpty()){
            throw new IllegalArgumentException("O clinete PRECISA ter um CPF.");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.carroscomprados = new ArrayList<Carro>();
    }
    public String getNome() {
        return nome;
    }

    public void InfosCliente(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Carros: " + carroscomprados);
    }
}
