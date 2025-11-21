package exceptions;

public class Excecoes extends Exception {
    public Excecoes(String mensagem) {
        super(mensagem);
    }
    public Excecoes(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
