package exceptions;

public class MarcaInvalida extends Excecoes{
    public MarcaInvalida(String marca){
        super("Marca: " + marca + " Invalida, não pode conter apenas números ou ser vazia.");
    }
    public MarcaInvalida(String marca, String causa){
        super("Marca: " + marca + " Invalida, não pode conter apenas números ou ser vazia.");
    }
}
