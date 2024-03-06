package dao;

import models.comanda.Comanda;
import models.comanda.itens.ItemComanda;

public class ItemComandaDAO {

    public static void adicionarItem(Comanda comanda, ItemComanda item) {
        comanda.getItens().add(item);
    }

    public static void removerItem(Comanda comanda, ItemComanda item) throws ArrayIndexOutOfBoundsException {
        if (comanda.getItens().isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Não há itens na comanda");
        }
        comanda.getItens().remove(item);
    }

}
