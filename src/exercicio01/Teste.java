package exercicio01;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Estabelecimento estabelecimento = new Estabelecimento();

        Scanner resposta = new Scanner(System.in);

        int i = 0;
        while (i == 0) {
            System.out.println("O que você deseja fazer?");
            System.out.println("1) Adicionar produto");
            System.out.println("2) Remover produto");
            System.out.println("3) Ver lista");
            System.out.println("4) Sair");
            int selecao = resposta.nextInt();

            switch (selecao){
                case 1:
                    System.out.println("Digite o nome e o preço do produto que você quer adicionar:");
                    estabelecimento.adicionarProduto(resposta.next(), resposta.nextDouble());
                    break;
                case 2:
                    System.out.println("Digite o nome do produto que você quer remover:");
                    estabelecimento.excluirProduto(resposta.next());
                    break;
                case 3:
                    estabelecimento.exibirProdutos();
                    break;
                case 4:
                    i = 1;
                    break;
            }
        }
    }
}
