package exercicio01;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Produtos produtos = new Produtos();

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
                    produtos.getProdutos().put(resposta.next(), resposta.nextDouble());
                    break;
                case 2:
                    System.out.println("Digite o nome do produto que você quer remover:");
                    produtos.getProdutos().remove(resposta.next());
                    break;
                case 3:
                        for (String chave : produtos.getProdutos().keySet()){
                            Double preco = produtos.getProdutos().get(chave);
                            System.out.printf(chave + ": R$ %,.2f%n", preco);
                        }
                    break;
                case 4:
                    i = 1;
                    break;
            }
        }
    }
}
