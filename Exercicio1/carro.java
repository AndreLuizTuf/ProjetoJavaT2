/*
 * Exercício 1
 * 
 * Variáveis: Marca(string), Modelo(string), AnoFabricacao(int) e VelocidadeAtual(int).
 * Métodos: Acelera ou Diminuir a velocidade do carro e Informações do carro.
 */
import java.util.Scanner;

class Carro {

    String marca, modelo;
    int AnoFabricacao, VelocidadeAtual;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é a marca do seu carro: ");
        String marca = scanner.next();

        System.out.println("Qual o modelo: ");
        String modelo = scanner.next();

        System.out.println("Qual é o ano de fabricação: ");
        int AnoFabricacao = scanner.nextInt();

        System.out.println("Digite a velocidade atual em Km/h: ");
        int VelocidadeAtual = scanner.nextInt();

        if (VelocidadeAtual >= 10) {
            System.out.println("Diminuir a velocidade!");
        }
        if (VelocidadeAtual < 10) {
            System.out.println("Acelerar a velocidade!");
        }
        
        System.out.println("Informações do seu carro: " + marca + ", " + modelo + ", " + AnoFabricacao + " e " + VelocidadeAtual + " Km/h");

        scanner.close();
    }
}