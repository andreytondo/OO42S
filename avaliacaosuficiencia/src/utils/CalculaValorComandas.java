package utils;

import models.comanda.Comanda;

import java.util.Collection;

public class CalculaValorComandas {

    public static Double calculaValorTotal(Collection<? extends Comanda> comandas) {
        double total = 0.0;
        for (Comanda comanda : comandas) {
            total = total + comanda.getTotal();
        }
        return total;
    }
}
