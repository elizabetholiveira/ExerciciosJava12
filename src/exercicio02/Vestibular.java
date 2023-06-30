package exercicio02;

import java.util.Scanner;

public class Vestibular {
    public static void main(String[] args) {

        Candidatos candidatos = new Candidatos();

        Scanner resposta = new Scanner(System.in);

        int i = 0;
        while (i == 0) {
            System.out.println("O que você deseja fazer?");
            System.out.println("1) Adicionar candidato");
            System.out.println("2) Remover candidato");
            System.out.println("3) Ver lista de candidatos");
            System.out.println("4) Sair");
            int selecao = resposta.nextInt();

            switch (selecao){
                case 1:
                    System.out.println("Digite o número da matrícula e a nota do candidato que você quer adicionar:");
                    candidatos.adicionarProduto(resposta.nextInt(), resposta.nextDouble());
                    break;
                case 2:
                    System.out.println("Digite o número de matrícula do candidato que você quer que você quer remover:");
                    candidatos.excluirProduto(resposta.nextInt());
                    break;
                case 3:
                    candidatos.exibirProdutos();
                    break;
                case 4:
                    i = 1;
                    break;
            }
        }
    }
}
