public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUECIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    protected Conta() {

        agencia = AGENCIA_PADRAO;
        numero = SEQUECIAL++;
    }

    public int getAgencia() { return agencia; }
    public int getNumero() { return numero; }
    public double getSaldo() { return saldo; }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(Conta contaDestino, double valor) {

        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    abstract void imprimirExtrato();

    protected void imprimirInfosComuns() {

        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Agencia: %d", numero));
        System.out.println(String.format("Agencia: %.2f", saldo));
    }
}
