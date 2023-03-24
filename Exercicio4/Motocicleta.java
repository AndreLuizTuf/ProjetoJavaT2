package Exercicio4;

// Classe Motocicleta
public class Motocicleta extends Veiculo {
    private int cilindradas;
    
    // Construtor
    public Motocicleta(String marca, String modelo, int anoFabricacao, String cor, int cilindradas) {
        super(marca, modelo, anoFabricacao, cor);
        this.cilindradas = cilindradas;
    }
    
    // Método informacao
    @Override
    public void informacao() {
        super.informacao();
        System.out.println("Cilindradas: " + cilindradas);
    }
}
