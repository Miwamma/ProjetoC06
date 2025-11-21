import carros.CarroPopular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("=====Seja bem a vindo=====");
            System.out.println("=====Fábrica de Carros=====");
            System.out.println("1. Produzir Carro Popular");
            System.out.println("2. Produzir Carro Esportivo");
            System.out.println("3. Cadastrar Cliente");
            System.out.println("4. Vender Carro");
            System.out.println("5. Ver Carros Produzidos");
            System.out.println("6. Ver Clientes");
            System.out.println("7. Ver Sensores");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            //String marca, String modelo, String motor, int ano, float peso
            switch (opcao) {
                case 1:

                    System.out.println("Insira o nome da marca: " );
                    String marca = sc.nextLine();
                    System.out.println("Insira o nome do modelo: " );
                    String modelo = sc.nextLine();
                    System.out.println("Insira o motor do carro: " );
                    String motor = sc.nextLine();
                    System.out.println("Insira o ano do carro: " );
                    int ano = sc.nextInt();
                    System.out.println("Insira o peso do carro: " );
                    double peso = sc.nextDouble();
                    CarroPopular carropopular = new CarroPopular(marca, modelo, motor, ano, (float)peso);
                    carropopular.Produzir();
                    break;

                case 2:
                    System.out.print("Digite o nome do cliente: 2");
                    break;
                case 3:
                    System.out.print("Digite o nome do cliente: 3");
                    break;
                case 4:
                    System.out.print("Digite o nome do cliente: 4");
                    break;
                case 5:
                    System.out.print("Digite o nome do cliente: 5");
                    break;
                case 6:
                    System.out.print("Digite o nome do cliente: 6");
                    break;
                case 7:
                    System.out.print("Digite o nome do cliente: 7");
                    break;
                case 0:
                    System.out.println("0");
                    break;
            }
        } while (opcao != 0);

    }
}
