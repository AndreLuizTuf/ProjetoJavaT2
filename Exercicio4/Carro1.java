package Exercicio4;

// Classe Carro
public class Carro1 extends Veiculo {
    private int numeroPortas;
    
    // Construtor
    public Carro1(String marca, String modelo, int anoFabricacao, String cor, int numeroPortas) {
        super(marca, modelo, anoFabricacao, cor);
        this.numeroPortas = numeroPortas;
    }
    
    // Método informacao
    @Override
    public void informacao() {
        super.informacao();
        System.out.println("Número de Portas: " + numeroPortas);
    }
}