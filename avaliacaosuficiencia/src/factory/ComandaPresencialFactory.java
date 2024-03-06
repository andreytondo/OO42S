package factory;

import dao.ItemComandaDAO;
import models.comanda.itens.ItemComanda;
import models.comanda.presencial.ComandaPresencial;
import models.garcom.Garcom;

public class ComandaPresencialFactory implements IComandaFactory<ComandaPresencial> {

    @Override
    public ComandaPresencial criar() {
        return getExemplo3();
    }

    private ComandaPresencial getExemplo3() {
        ComandaPresencial comanda = new ComandaPresencial();
        comanda.setNumeroMesa(5);
        comanda.setOcupada(true);
        comanda.setGarcom(new Garcom(12L, "João da Silva"));
        ItemComandaDAO.adicionarItem(comanda, new ItemComanda("Salmão ao molho de maracujá", 60.0, 1));
        ItemComandaDAO.adicionarItem(comanda, new ItemComanda("Água com gás", 3.0, 3));
        comanda.calcularSubtotal();
        comanda.calcularTotal();

        return comanda;
    }

}
