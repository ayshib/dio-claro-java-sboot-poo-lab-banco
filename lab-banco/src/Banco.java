import java.util.ArrayList;
import java.util.List;

public class Banco {
 
    private String nome;

    private List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta criarContaCorrente() {

        ContaCorrente novo = new ContaCorrente();
        contas.add(novo);
        return novo;
    }

    public Conta criarContaPoupanca() {

        ContaPoupanca novo = new ContaPoupanca();
        contas.add(novo);
        return novo;
    }

    public void imprimirContas() {

        contas.forEach(Conta::imprimirExtrato);
    }
}