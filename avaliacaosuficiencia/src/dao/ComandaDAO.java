package dao;

import models.comanda.Comanda;
import models.comanda.delivery.ComandaDelivery;
import models.comanda.presencial.ComandaPresencial;

import java.util.ArrayList;
import java.util.Collection;

public class ComandaDAO {

    private final Collection<ComandaDelivery> comandasDelivery = new ArrayList<>();

    private final Collection<ComandaPresencial> comandasPresencial = new ArrayList<>();

    public void adicionar(ComandaDelivery comanda) {
        comandasDelivery.add(comanda);
    }

    // caso não tenha uma comanda joga uma exceção e informa que não há comandas
    // necessário tratar a exceção ao utilzar o método
    public void remover(ComandaDelivery comanda) throws ArrayIndexOutOfBoundsException {
        if (comandasDelivery.isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Não há comandas");
        }
        comandasDelivery.remove(comanda);
    }

    public void adicionar(ComandaPresencial comanda) {
        comandasPresencial.add(comanda);
    }

    public void removerComanda(ComandaPresencial comanda) {
        if (comandasPresencial.isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Não há comandas");
        }
        comandasPresencial.remove(comanda);
    }

    public Collection<ComandaDelivery> getComandasDelivery() {
        return comandasDelivery;
    }

    public Collection<ComandaPresencial> getComandasPresencial() {
        return comandasPresencial;
    }
}
