import br.edu.utfpr.operacoes.Operacoes;

import javax.swing.*;

public class Main {

    final static String[] opcoes = {"somar", "subtrair", "multiplicar", "dividir"};

    public static void main(String[] args) {
        Operacoes op1 = new Operacoes(1.0, 2.0);
        int escolha = 0;

        while (escolha != -1) {
            double resultado;
            escolha = JOptionPane.showOptionDialog(null, "Escolha a operação desejada",
                    "Clique!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, null);

            switch (escolha) {
                case 0:
                    resultado = op1.somar();
                    break;
                case 1:
                    resultado = op1.subtrair();
                    break;
                case 2:
                    resultado = op1.multiplicar();
                    break;
                case 3:
                    resultado = op1.dividir();
                    break;
                default:
                    continue;
            }

            JOptionPane.showMessageDialog(null,
                    "Resultado da operação: " + resultado + " " + op1
            );

        }
    }
}