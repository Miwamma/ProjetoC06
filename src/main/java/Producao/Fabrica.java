package Producao;

public class Fabrica {
    public String nome;
    public String dono;
    public String telefone;
    public int anofundacao;

    public void infosfabrica(){
        System.out.println("A fabrica:  "+ nome + " produz carros populares e esportivos, seu dono(a) é o Sr(Sra): " + dono);
        System.out.printf("Seu ano de fundação é:" + anofundacao + " e o telefone de contato é:" + telefone);
    }
}
