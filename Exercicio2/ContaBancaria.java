class ContaBancaria {
    
    private String numeroConta;
    private double saldo;
    private String titular;
    private double limiteSaque;
    
    public ContaBancaria(String numeroConta, double saldo, String titular, double limiteSaque) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
        this.limiteSaque = limiteSaque;
    }
    
    public void deposito(double valor) {
        saldo += valor;
    }
    
    public void saque(double valor) {
        if (valor <= saldo && valor <= limiteSaque) {
            saldo -= valor;
        } else {
            System.out.println("Erro: valor de saque excede o saldo ou o limite de saque da conta.");
        }
    }
    
    public void imprimirInformacoes() {
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Titular da conta: " + titular);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("Limite de saque da conta: " + limiteSaque);
    }
}
