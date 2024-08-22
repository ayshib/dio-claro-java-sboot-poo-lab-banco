public class App {
    public static void main(String[] args) throws Exception {
        
        Banco banco = new Banco();
        Conta cc = banco.criarContaCorrente();
        Conta cp = banco.criarContaPoupanca();

        cc.depositar(100);
        cc.transferir(cp, 99);

        banco.imprimirContas();
    }
}
