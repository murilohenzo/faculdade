import main.java.com.murilohenzo.loja.modules.estoque.domain.EntradaProduto;
import main.java.com.murilohenzo.loja.modules.estoque.domain.Estoque;
import main.java.com.murilohenzo.loja.modules.estoque.domain.Fornecedor;
import main.java.com.murilohenzo.loja.modules.estoque.domain.SaidaProduto;
import main.java.com.murilohenzo.loja.modules.produtos.domain.ItemProduto;
import main.java.com.murilohenzo.loja.modules.produtos.domain.Produto;
import main.java.com.murilohenzo.loja.modules.produtos.enums.Cor;
import main.java.com.murilohenzo.loja.modules.produtos.enums.Tipo;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Demo {
    public static void main(String[] args) {
        montarProduto();
    }

    public static void montarProduto() {
        Produto produto = new Produto(
                1, "BLUSH", "DEIXAR A BOXEXA ROSADA",
                Cor.AMARELO, Tipo.MAQUIAGEM, new BigDecimal(10), new BigDecimal(15)
        );

        Produto produto2 = new Produto(
                2, "ESMALTE", "PINTAR AS UNHAS",
                Cor.BRANCO, Tipo.ESMALTES, new BigDecimal(2), new BigDecimal(5)
        );

        ItemProduto itemProduto = new ItemProduto(10, produto);

        ItemProduto itemProduto2 = new ItemProduto(25, produto2);


        Fornecedor fornecedor = new Fornecedor(1, "JohnDoe P&D", "johndoe@gmail.com", "Street two", itemProduto);
        Fornecedor fornecedor2 = new Fornecedor(2, "Lila P&D", "lila@gmail.com", "Street three", itemProduto2);


//      COLOCANDO PRODUTO NO ESTOQUE
        Estoque estoque = new Estoque();
        EntradaProduto entradaProduto = new EntradaProduto(1, fornecedor, OffsetDateTime.now(), estoque);
        entradaProduto.atualizarEstoque();

        EntradaProduto entradaProduto2 = new EntradaProduto(2, fornecedor2, OffsetDateTime.now(), estoque);
        entradaProduto2.atualizarEstoque();
        System.out.println(estoque);

//      RETIRANDO PRODUTO DO ESTOQUE
        itemProduto.setQuantidade(5);
        SaidaProduto saidaProduto = new SaidaProduto(produto.getId(), itemProduto, OffsetDateTime.now(), estoque);
        saidaProduto.atualizarEstoque();
        System.out.println(estoque);
    }
}