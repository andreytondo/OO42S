package models.comanda;

import models.comanda.itens.ItemComanda;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;

// HERANÇA: classe abstrata para utilizar obrigatoriamente da herança ao criar objetos
// ENCAPSULAMENTO: atributos privados, possibilitando o acesso somente através de get e set
public abstract class Comanda {

    private LocalDate data = LocalDate.now();
    private LocalTime hora = LocalTime.now();
    private Double total = 0.0;
    private Double subtotal = 0.0;

    // COLLECTIONS: uso de uma collection para armazenar os itens da comanda
    private Collection<ItemComanda> itens = new ArrayList<>();

    public Double getSubtotal() {
        return this.subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return this.hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Double getTotal() {
        return this.total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Collection<ItemComanda> getItens() {
        return this.itens;
    }

    public Comanda() {}

    public void calcularSubtotal() {
        getItens().forEach(item -> setSubtotal(getSubtotal() + (item.getValor() * item.getQuantidade())));
    }

    public void calcularTotal() {
        setTotal(getSubtotal());
    }

    public String getDataHora() {
        return "Data e hora do pedido: " + getData().format(DateTimeFormatter.ofPattern("dd/MM/yyy")) + " " + getHora().format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    public String getItensFormatados() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        getItens().forEach(i -> sb
                .append("Produto: ").append(i.getProduto()).append(", ")
                .append("preço: ").append(i.getValor()).append(", ")
                .append("quantidade: ").append(i.getQuantidade()).append(" "));
        sb.append("]");
        return sb.toString();
    }

    // METODO ABSTRATO para calcular as taxas
    public abstract Double calculaTaxa();
}
