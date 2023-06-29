package Exercicio01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Map<String, Double> produtos = new HashMap<String, Double>();

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
                    produtos.put(resposta.next(), resposta.nextDouble());
                    break;
                case 2:
                    System.out.println("Digite o nome do produto que você quer remover:");
                    produtos.remove(resposta.next());
                    break;
                case 3:
                        System.out.println(produtos);
                    break;
                case 4:
                    i = 1;
                    break;
            }
        }
    }
}
