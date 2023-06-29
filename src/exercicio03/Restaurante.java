package exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurante {

    public static void main(String[] args) {

        Cardapio pratos = new Cardapio();

        Scanner resposta = new Scanner(System.in);

        List<String> ingredientes = new ArrayList<>();

        int i = 0;
        while (i == 0) {
            System.out.println("O que você deseja fazer?");
            System.out.println("1) Adicionar prato");
            System.out.println("2) Remover prato");
            System.out.println("3) Ver cardápio");
            System.out.println("4) Adicionar ingrediente na lista");
            System.out.println("5) Sair");
            int selecao = resposta.nextInt();

            switch (selecao){
                case 1:
                    System.out.println("Digite o nome do prato que quer adicionar:");
                    pratos.getPratos().put(resposta.next(),ingredientes);
                    break;
                case 2:
                    System.out.println("Digite o nome do prato que você quer remover:");
                    pratos.getPratos().remove(resposta.nextInt());
                    break;
                case 3:
                    for (String chave : pratos.getPratos().keySet()){
                        List<String> itens = pratos.getPratos().get(chave);
                        System.out.println("Prato: " + chave + " | Ingredientes: " + itens);
                    }
                    break;
                case 4:
                    System.out.println("Digite o ingrediente que você quer adicionar");
                    ingredientes.add(resposta.next());
                    break;
                case 5:
                    i = 1;
                    break;
            }
        }
    }
}
