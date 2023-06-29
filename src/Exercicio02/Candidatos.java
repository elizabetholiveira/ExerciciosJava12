package Exercicio02;

import java.util.HashMap;
import java.util.Map;

public class Candidatos {

    private Map<Integer, Double> candidatos = new HashMap<>();

    public Map<Integer, Double> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(Map<Integer, Double> candidatos) {
        this.candidatos = candidatos;
    }
}
