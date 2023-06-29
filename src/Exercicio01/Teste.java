package Exercicio01;

import java.util.Scanner;

public class Teste {
    Produtos teste = new Produtos();
    Scanner resposta = new Scanner(System.in);

    public void adicionarProduto(){
        System.out.println("Digite o nome e o preço do produto:");
        teste.getProdutos().put(resposta.next(), resposta.nextDouble());
    }
    public void exibirProdutos(){
        for(int i = 1; i < teste.getProdutos().size(); i++){
            System.out.println(teste.getProdutos().get(i));
        }
    };

    public void excluirProduto(){
        System.out.println("Digite o nome do produto que deseja excluir");
        teste.getProdutos().remove(resposta.next());
    };

    public static void main(String[] args) {

        Produtos teste = new Produtos();

        adicionarProduto(teste);
    }
}
