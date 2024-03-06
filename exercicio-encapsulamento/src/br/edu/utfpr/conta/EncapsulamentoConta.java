package br.edu.utfpr.conta;

public class EncapsulamentoConta {

    private String numero;
    private Double saldo;

    public Double depositar() {}

    public Double

    public EncapsulamentoConta(String numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
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
}
