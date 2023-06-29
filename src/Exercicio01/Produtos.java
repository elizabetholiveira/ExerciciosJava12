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
}
