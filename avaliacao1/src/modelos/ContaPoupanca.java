package modelos;

public class ContaPoupanca extends Conta {

    private Double limite;

    @Override
    public void sacar(Double quantia) {
        if (quantia <= getSaldo() + getLimite()) {
            if (quantia <= getSaldo()) {
                setSaldo(getSaldo() - quantia);
            } else {
                calculaLimite(quantia);
            }
            System.out.println("Saldo após o saque R$: " + getSaldo());
        } else {
            System.out.println("Não foi possível realizar o saque");
        }
    }

    private void calculaLimite(Double saque) {
        Double debito = getSaldo() - saque;
        if (debito <= getLimite()) {
            setSaldo(debito);
        }
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public ContaPoupanca(String numero, Double saldo, Cliente cliente, Double limite) {
        super(numero, saldo, cliente);
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "\n**************Conta poupança**************" +
                "\nCliente: " + getCliente().getNome() + ", CPF: " + getCliente().getCpf() +
                "\nNúmero: " + getNumero() +
                "\nLimite: " + getLimite() +
                "\nSaldo inicial: " + getSaldo();
    }

}
