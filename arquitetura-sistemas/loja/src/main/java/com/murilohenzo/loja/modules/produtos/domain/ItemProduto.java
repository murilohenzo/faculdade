package main.java.com.murilohenzo.loja.modules.produtos.domain;

import java.math.BigDecimal;

public class ItemProduto {
    private int id;
    private BigDecimal custo;
    private int quantidade;
    private Produto produto;

    public ItemProduto(int quantidade, Produto produto) {
        this.id = produto.getId();
        this.custo = produto.getValorDeCusto().multiply(BigDecimal.valueOf(quantidade));
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getCusto() {
        return custo;
    }

    public void setCusto(BigDecimal custo) {
        this.custo = custo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItemProduto{" +
                "id=" + id +
                ", custo=" + custo +
                ", quantidade=" + quantidade +
                ", produto=" + produto +
                '}';
    }
}
