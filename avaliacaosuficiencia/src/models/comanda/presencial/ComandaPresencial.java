package models.comanda.presencial;

import models.comanda.Comanda;
import models.comanda.itens.ItemComanda;
import models.garcom.Garcom;

import java.time.format.DateTimeFormatter;
import java.util.stream.Collectors;

public class ComandaPresencial extends Comanda {

    private Integer numeroMesa;
    private boolean ocupada;
    private Garcom garcom;

    private final Double TAXA_SERVICO = 0.1;

    public Integer getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(Integer numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public boolean getOcupada() {
        return this.ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Garcom getGarcom() {
        return garcom;
    }

    public void setGarcom(Garcom garcom) {
        this.garcom = garcom;
    }

    @Override
    public String toString() {
        return  getInfo() + "\n" +
                "Subtotal: " + getSubtotal() + "\n" +
                "Taxa de entrega: " + calculaTaxa() + "\n" +
                "Total: " + getTotal();
    }

    public String getInfo() {
        return getDataHora() + "\n" +
                "Mesa: " + getNumeroMesa() + ", ocupada: " + isOcupada() + "\n" +
                "Garçom: " + getGarcom().getNome() + ", Identificação: " + getGarcom().getId() + "\n" +
                getItensFormatados();
    }

    public String isOcupada() {
        return getOcupada() ? "Sim" : "Não";
    }

    @Override
    public void calcularTotal() {
        setTotal(getSubtotal() + calculaTaxa());
    }

    public Double calculaTaxa() {
        return getSubtotal() * TAXA_SERVICO;
    }
}
