public class ContaPoupanca extends Conta {

    @Override
    void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        imprimirInfosComuns();
    }
}
