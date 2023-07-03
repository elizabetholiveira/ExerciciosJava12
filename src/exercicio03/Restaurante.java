package exercicio03;

import java.util.Scanner;

public class Restaurante {

    public static void main(String[] args) {

        Cardapio novoPrato = new Cardapio();

        Scanner resposta = new Scanner(System.in);

        int i = 0;
        while (i == 0) {
            System.out.println("O que você deseja fazer?");
            System.out.println("1) Adicionar prato");
            System.out.println("2) Remover prato");
            System.out.println("3) Ver cardápio");
            System.out.println("4) Sair");
            int selecao = resposta.nextInt();

            switch (selecao){
                case 1:
                    boolean adicionar = true;
                    while (adicionar) {
                        resposta.nextLine();
                        System.out.println("Digite o ingrediente:");
                        novoPrato.adicionarIngrediente(resposta.nextLine());
                        System.out.println("Deseja adicionar mais um ingrediente? (s/n)");
                        String deNovo = resposta.next();
                        if (deNovo.equalsIgnoreCase("n")){
                            adicionar = false;
                            resposta.nextLine();
                        }
                    }
                    System.out.println("Digite o nome do prato:");
                    novoPrato.adicionarNomePrato(resposta.nextLine());
                    novoPrato.adicionarPrato();
                    break;
                case 2:
                    resposta.nextLine();
                    System.out.println("Digite o nome do prato que deseja remover:");
                    novoPrato.removerPrato(resposta.nextLine());
                    break;
                case 3:
                    novoPrato.exibirPratos();
                    break;
                case 4:
                    i = 1;
                    break;
            }
        }
    }
}
