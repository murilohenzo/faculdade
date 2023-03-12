package main.java.com.murilohenzo.loja.modules.estoque.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estoque {
    private static String message;
    private final List<Map<Integer, Integer>> estoque = new ArrayList<>();

    public void aumentarQuantidadeDeProdutos(int idProduto, int quantidadeDeProduto) {
        Map<Integer, Integer> produto = new HashMap<>();
        produto.put(idProduto, quantidadeDeProduto);
        this.estoque.add(produto);
        System.out.println("Estoque atualizado com adicao de " + quantidadeDeProduto + " produtos");;
    }

    public void diminuirQuantidadeDeProdutos(int idProduto, int quantidadeDeProduto) {
        this.estoque.forEach(item -> {
            if (item.containsKey(idProduto)) {
                int quantidadeDoProdutoNoEstoque = item.get(idProduto);
                if(quantidadeDoProdutoNoEstoque == 0) {
                    message = "Estoque para o produto precisa ser abastecido";
                } else {
                    item.put(idProduto, quantidadeDoProdutoNoEstoque - quantidadeDeProduto);
                    message = "Foi removido " + quantidadeDeProduto + " do estoque";
                }
            }
        });
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "estoque=" + estoque +
                '}';
    }
}
