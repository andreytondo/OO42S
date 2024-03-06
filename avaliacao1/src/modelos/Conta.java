package modelos;

public abstract class Conta implements IConta {

    private String numero;
    private Double saldo;
    private Cliente cliente;

    @Override
    public void sacar(Double quantia) {}

    @Override
    public void depositar(Double quantia) {
        setSaldo(getSaldo() + quantia);
        System.out.println("Saldo após o depósito R$: " + getSaldo());
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conta(String numero, Double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }
}
