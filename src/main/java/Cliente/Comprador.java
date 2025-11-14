package Cliente;

public class Comprador {

    protected String nome;
    protected String cpf;

    public Comprador(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void compradorinfo(){
        System.out.println("Nome: " + nome);
    }
}
