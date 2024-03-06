import factory.ContaFactory;
import modelos.ContaCorrente;
import modelos.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente1 = ContaFactory.criarCorrente("Ana Soares", "0987676664", 1000.00);
        System.out.println(contaCorrente1);
        contaCorrente1.sacar(50.00);
        contaCorrente1.depositar(100.00);

        ContaCorrente contaCorrente2 = ContaFactory.criarCorrente("Ana Soares", "0987676664", 1000.00);
        System.out.println(contaCorrente2);
        contaCorrente2.sacar(1000.00);
        contaCorrente2.depositar(100.00);

        ContaPoupanca contaPoupanca1 = ContaFactory.criarPoupanca("João Santos", "0987676664", 1000.00, 100.00);
        System.out.println(contaPoupanca1);
        contaPoupanca1.sacar(1000.00);
        contaPoupanca1.depositar(100.00);

        ContaPoupanca contaPoupanca2 = ContaFactory.criarPoupanca("João Santos", "0987676664", 1000.00, 100.00);
        System.out.println(contaPoupanca2);
        contaPoupanca2.sacar(2000.00);
        contaPoupanca2.depositar(100.00);
    }
}