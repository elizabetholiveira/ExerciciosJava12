package listaExercicios;

import java.util.List;

public class Pais {

    private String nome;
    private String iso31661;
    private int populacao;
    private double dimensaoKm;
    private List<String> paisesFronteira;

    public Pais(String nome, String iso31661, double dimensaoKm) {
        this.nome = nome;
        this.iso31661 = iso31661;
        this.dimensaoKm = dimensaoKm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIso31661() {
        return iso31661;
    }

    public void setIso31661(String iso31661) {
        this.iso31661 = iso31661;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public double getDimensaoKm() {
        return dimensaoKm;
    }

    public void setDimensaoKm(double dimensaoKm) {
        this.dimensaoKm = dimensaoKm;
    }

    private String pais = null;
    void paisVizinho(){
        for(int i = 0; i < paisesFronteira.size(); i++){
            if (paisesFronteira.get(i) == pais){
                System.out.println("Os países são vizinhos");
            } else if (i > paisesFronteira.size()){
                System.out.println("Os países não são vizinhos");
            }
        }
    }

    double densidadePopulacional(){
        double densidadePopulacional = populacao / dimensaoKm;
        return densidadePopulacional;
    }
}
