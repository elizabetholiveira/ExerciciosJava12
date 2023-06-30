package exercicio01;


import java.util.HashMap;
import java.util.Map;

public class Estabelecimento {

    private Map<String, Double> produtos = new HashMap<String, Double>();

    public void adicionarProduto(String nome, Double preco){
        this.produtos.put(nome,preco);
    }

    public void exibirProdutos(){
        for (String chave : produtos.keySet()){
            Double preco = produtos.get(chave);
            System.out.printf(chave + ": R$ %,.2f%n", preco);
        }
    }

    public void excluirProduto(String nome){
        this.produtos.remove(nome);
    }
}
