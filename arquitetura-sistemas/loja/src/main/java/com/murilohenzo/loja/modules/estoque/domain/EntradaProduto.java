package main.java.com.murilohenzo.loja.modules.estoque.domain;

import java.time.OffsetDateTime;

public class EntradaProduto {
    private int id;
    private Fornecedor fornecedor;
    private OffsetDateTime dataEntrada;

    private final Estoque estoque;

    public EntradaProduto(int id, Fornecedor fornecedor, OffsetDateTime dataEntrada, Estoque estoque) {
        this.id = id;
        this.fornecedor = fornecedor;
        this.dataEntrada = dataEntrada;
        this.estoque = estoque;
    }

    public void atualizarEstoque() {
        int idProduto = this.getFornecedor().getItemProduto().getProduto().getId();
        int quantidadeProduto = this.getFornecedor().getItemProduto().getQuantidade();
        this.estoque.aumentarQuantidadeDeProdutos(idProduto, quantidadeProduto);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public OffsetDateTime getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(OffsetDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    @Override
    public String toString() {
        return "EntradaProduto{" +
                "id=" + id +
                ", fornecedor=" + fornecedor +
                ", dataEntrada=" + dataEntrada +
                ", estoque=" + estoque +
                '}';
    }
}
