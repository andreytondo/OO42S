package factory;

import modelos.Cliente;
import modelos.Conta;
import modelos.ContaCorrente;
import modelos.ContaPoupanca;

import java.util.Random;

public class ContaFactory {

    public static ContaPoupanca criarPoupanca(String nomeCliente, String cpf, Double saldoInicial, Double limite) {
        return new ContaPoupanca(geraNumeroAleatorio(), saldoInicial, new Cliente(nomeCliente, cpf), limite);
    }

    public static ContaCorrente criarCorrente(String nomeCliente, String cpf, Double saldoInicial) {
        return new ContaCorrente(geraNumeroAleatorio(), saldoInicial, new Cliente(nomeCliente, cpf));
    }

    private static String geraNumeroAleatorio() {
        return String.format("%06d", new Random().nextInt(999999));
    }
}
