package br.edu.utfpr.operacoes;

public class Operacoes {

    private double a;
    private double b;

    public Operacoes() {}

    public Operacoes(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Operacoes: { a = " + a + ", b = " + b + " }";

    }

    public double somar() {
        return a + b;
    }

    public double subtrair() {
        return a - b;
    }

    public double multiplicar() {
        return a * b;
    }

    public double dividir() {
        return a/b;
    }
}
