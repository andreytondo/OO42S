package factory;

import dao.ItemComandaDAO;
import models.cliente.Cliente;
import models.comanda.delivery.ComandaDelivery;
import models.comanda.itens.ItemComanda;

public class ComandaDeliveryFactory implements IComandaFactory<ComandaDelivery> {

    @Override
    public ComandaDelivery criar() {
        return getExemplo1();
    }

    public ComandaDelivery criarOutro() {
        return getExemplo2();
    }

    private ComandaDelivery getExemplo1() {
        ComandaDelivery comanda = new ComandaDelivery(new Cliente("Ana Maria", "2998765442"));
        ItemComandaDAO.adicionarItem(comanda, new ItemComanda("Spaghetti", 32.0, 2));
        ItemComandaDAO.adicionarItem(comanda, new ItemComanda("Coca-cola", 5.0, 2));
        ItemComandaDAO.adicionarItem(comanda, new ItemComanda("Tacco", 27.5, 1));
        comanda.calcularSubtotal();
        comanda.calcularTotal();

        return comanda;
    }

    private ComandaDelivery getExemplo2() {
        ComandaDelivery comanda = new ComandaDelivery(new Cliente("Carlos Soares", "9845445444"));
        ItemComandaDAO.adicionarItem(comanda, new ItemComanda("Escondidinho de carne seca", 50.0, 1));
        ItemComandaDAO.adicionarItem(comanda, new ItemComanda("Coca-cola", 5.0, 2));
        ItemComandaDAO.adicionarItem(comanda, new ItemComanda("Kids", 18.0, 1));
        comanda.calcularSubtotal();
        comanda.calcularTotal();

        return comanda;
    }
}
