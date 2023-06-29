package exercicio03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cardapio {

    private Map<String, List<String>> pratos = new HashMap<>();

    public Map<String, List<String>> getPratos() {
        return pratos;
    }

    public void setPratos(Map<String, List<String>> pratos) {
        this.pratos = pratos;
    }
}
