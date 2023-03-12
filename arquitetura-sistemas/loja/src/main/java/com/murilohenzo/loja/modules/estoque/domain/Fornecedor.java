package main.java.com.murilohenzo.loja.modules.estoque.domain;

import main.java.com.murilohenzo.loja.modules.produtos.domain.ItemProduto;

import java.util.List;

public class Fornecedor {
    private int id;
    private String nome;
    private String email;
    private String endereco;
    private ItemProduto itemProduto;

    public Fornecedor(int id, String nome, String email, String endereco, ItemProduto itemProduto) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.itemProduto = itemProduto;
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

    public String getEmails() {
        return email;
    }

    public void setEmails(String email) {
        this.email = email;
    }

    public String getEnderecos() {
        return endereco;
    }

    public void setEnderecos(String endereco) {
        this.endereco = endereco;
    }

    public ItemProduto getItemProduto() {
        return itemProduto;
    }

    public void setItemProduto(ItemProduto itemProduto) {
        this.itemProduto = itemProduto;
    }
}
