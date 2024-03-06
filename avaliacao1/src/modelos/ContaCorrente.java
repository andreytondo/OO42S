package modelos;

public class ContaCorrente extends Conta {

    private final Double TAXA = 2.0;

    @Override
    public void sacar(Double quantia) {
        Double total = quantia + calculaTaxa(quantia);

        if (quantia < getSaldo()) {
            this.setSaldo(total);
            System.out.println("Saldo após o saque R$: " + getSaldo());
        } else {
            System.out.println("Não foi possível realizar o saque");
        }
    }

    @Override
    public void depositar(Double quantia) {
        Double total = quantia + getSaldo() - calculaTaxa(quantia);
        this.setSaldo(total);
        System.out.println("Saldo após o depósito R$: " + getSaldo());
    }

    public Double calculaTaxa(Double total) {
        return TAXA * 100 / total;
    }

    public ContaCorrente(String numero, Double saldo, Cliente cliente) {
        super(numero, saldo, cliente);
    }

    @Override
    public String toString() {
        return "\n**************Conta corrente**************" +
                "\nCliente: " + getCliente().getNome() + ", CPF: " + getCliente().getCpf() +
                "\nNúmero: " + getNumero() +
                "\nTaxa de operação: " + TAXA + "%" +
                "\nSaldo inicial: " + getSaldo();
    }
}
