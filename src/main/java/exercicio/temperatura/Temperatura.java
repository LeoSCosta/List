package exercicio.temperatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Temperatura {


    private List<Integer> temperaturas = new ArrayList<>();
    private String mes;
    private Integer MediaMensal;

    public Temperatura(String mes,int temperaturas) {
        this.mes = mes;
        adicionarTemperaturas(temperaturas);

    }

    private void adicionarTemperaturas(int qtd){
        Random random = new Random();
        int soma = 0;
        for (int j = 0; j < qtd; j++) {
            getTemperaturas().add(random.nextInt(30));
            soma += getTemperaturas().get(j);
        }
        setMediaMensal(soma / getTemperaturas().size());
    }

    public String mostrarTemperaturas(){
        StringBuilder retorno = new StringBuilder("\nTemperaturas: ");
        for (Integer temperatura:temperaturas) {
            retorno.append("\n").append(temperatura);
        }
        return retorno.toString();
    }



    public Integer getMediaMensal() {
        return MediaMensal;
    }

    public void setMediaMensal(Integer mediaMensal) {
        MediaMensal = mediaMensal;
    }



    public List<Integer> getTemperaturas() {
        return temperaturas;
    }

    public void setTemperaturas(List<Integer> temperaturas) {
        this.temperaturas = temperaturas;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "\n{" +
                "mes=" + mes +
                ", Media mensal=" + MediaMensal +
                '}';
    }
}
