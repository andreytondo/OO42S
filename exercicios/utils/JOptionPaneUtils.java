package utils;

import javax.swing.*;

public class JOptionPaneUtils {

    protected String getString(String mensagem) {
        return JOptionPane.showInputDialog(mensagem);
    }

    protected Double getDouble(String mensagem) {
        try {
            return Double.valueOf(JOptionPane.showInputDialog(mensagem));
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Não é um número válido");
        }
    }
}
