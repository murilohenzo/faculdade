package main.java.com.murilohenzo.loja.modules.estoque.domain;

import main.java.com.murilohenzo.loja.modules.produtos.domain.ItemProduto;

import java.time.OffsetDateTime;

public class SaidaProduto {
    private int id;
    private ItemProduto itemProduto;
    private OffsetDateTime dataSaida;

    private final Estoque estoque;

    public SaidaProduto(int id, ItemProduto itemProduto, OffsetDateTime dataSaida, Estoque estoque) {
        this.id = id;
        this.itemProduto = itemProduto;
        this.dataSaida = dataSaida;
        this.estoque = estoque;
    }

    public void atualizarEstoque() {
        int idProduto = this.getItemProduto().getProduto().getId();
        int quantidadeProduto = this.itemProduto.getQuantidade();
        this.estoque.diminuirQuantidadeDeProdutos(idProduto, quantidadeProduto);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ItemProduto getItemProduto() {
        return itemProduto;
    }

    public void setItemProduto(ItemProduto itemProduto) {
        this.itemProduto = itemProduto;
    }

    public OffsetDateTime getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(OffsetDateTime dataSaida) {
        this.dataSaida = dataSaida;
    }

    @Override
    public String toString() {
        return "SaidaProduto{" +
                "id=" + id +
                ", itemProduto=" + itemProduto +
                ", dataSaida=" + dataSaida +
                ", estoque=" + estoque +
                '}';
    }
}
