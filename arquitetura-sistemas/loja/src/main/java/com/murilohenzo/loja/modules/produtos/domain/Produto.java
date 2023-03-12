package main.java.com.murilohenzo.loja.modules.produtos.domain;

import main.java.com.murilohenzo.loja.modules.produtos.enums.Cor;
import main.java.com.murilohenzo.loja.modules.produtos.enums.Tipo;

import java.math.BigDecimal;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private Cor cor;
    private Tipo tipo;
    private BigDecimal valorDeCusto;
    private BigDecimal valorDeVenda;
    public Produto(int id, String nome, String descricao, Cor cor, Tipo tipo, BigDecimal valorDeCusto, BigDecimal valorDeVenda) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.cor = cor;
        this.tipo = tipo;
        this.valorDeCusto = valorDeCusto;
        this.valorDeVenda = valorDeVenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getValorDeCusto() {
        return valorDeCusto;
    }

    public void setValorDeCusto(BigDecimal valorDeCusto) {
        this.valorDeCusto = valorDeCusto;
    }

    public BigDecimal getValorDeVenda() {
        return valorDeVenda;
    }

    public void setValorDeVenda(BigDecimal valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cor=" + cor +
                ", tipo=" + tipo +
                ", valorDeCusto=" + valorDeCusto +
                ", valorDeVenda=" + valorDeVenda +
                '}';
    }
}
