package models.comanda.delivery;

import models.cliente.Cliente;
import models.comanda.Comanda;

public class ComandaDelivery extends Comanda {

    private Cliente cliente;
    private final Double TAXA_ENTREGA = 0.1;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    @Override
    public void calcularTotal() {
        setTotal(getSubtotal() + calculaTaxa());
    }

    public ComandaDelivery(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getInfo() {
        return getDataHora() + "\n" +
                "Cliente: " + getCliente().getNome() + ", CPF: " + getCliente().getCpf() + "\n" +
                getItensFormatados();
    }

    @Override
    public String toString() {
        return  getInfo() + "\n" +
                "Subtotal: " + getSubtotal() + "\n" +
                "Taxa de entrega: " + calculaTaxa() + "\n" +
                "Total: " + getTotal();
    }

    public Double calculaTaxa() {
        return getSubtotal() * TAXA_ENTREGA;
    }
}
