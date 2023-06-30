package exercicio02;

import java.util.HashMap;
import java.util.Map;

public class Candidatos {

    private Map<Integer, Double> candidatos = new HashMap<>();

    public void adicionarProduto(Integer matricula, Double nota){
        this.candidatos.put(matricula,nota);
    }

    public void exibirProdutos(){
        for (Integer chave : candidatos.keySet()){
            Double nota = candidatos.get(chave);
            System.out.println("Matrícula: " + chave + " | Nota: " + nota);
        }
    }

    public void excluirProduto(Integer matricula){
        this.candidatos.remove(matricula);
    }
}
