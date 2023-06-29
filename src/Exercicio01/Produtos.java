package Exercicio01;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Produtos {

    private Map<String, Double> produtos = new HashMap<String, Double>();

    public Map<String, Double> getProdutos() {
        return produtos;
    }

    public void setProdutos(Map<String, Double> produtos) {
        this.produtos = produtos;
    }

    /*public void adicionarProduto(Produtos teste){
        Scanner resposta = new Scanner(System.in);
        System.out.println("Digite o nome e o preço do produto:");
        teste.getProdutos().put(resposta.next(), resposta.nextDouble());
    }

    public void exibirProdutos(Produtos teste){
        for(int i = 1; i < teste.getProdutos().size(); i++){
            System.out.println(teste.getProdutos());
        }
    };

    public void excluirProduto(Produtos teste){
        Scanner resposta = new Scanner(System.in);
        System.out.println("Digite o nome do produto que deseja excluir");
        teste.getProdutos().remove(resposta.next());
    };*/
}
