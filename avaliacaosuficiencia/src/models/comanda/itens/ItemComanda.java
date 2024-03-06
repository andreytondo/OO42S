package models.comanda.itens;

public class ItemComanda {

    private String produto;
    private Double valor;
    private Integer quantidade;

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getProduto() {
        return this.produto;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public ItemComanda(String produto, Double valor, Integer quantidade) {
        this.produto = produto;
        this.valor = valor;
        this.quantidade = quantidade;
    }
}
