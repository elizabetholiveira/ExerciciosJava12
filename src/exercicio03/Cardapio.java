package exercicio03;

import java.util.*;

public class Cardapio {

    private Map<String, List<String>> pratos = new HashMap<>();
    private List<String> ingredientes = new ArrayList<>();

    public void adicionarIngrediente(String ingrediente){
        this.ingredientes.add(ingrediente);
    }

    String nomePrato;

    public void adicionarNomePrato(String nomePrato){
        this.nomePrato = nomePrato;
    }

    public void adicionarPrato(){
        this.pratos.put(nomePrato,ingredientes);
    }

    public void removerPrato(String nomePrato){
        this.pratos.remove(nomePrato);
    }

    public void exibirPratos(){
        for(String chave : pratos.keySet()){
            List ingrediente = pratos.get(chave);
            System.out.println(chave + " | " + ingrediente);
        }
    }
}
