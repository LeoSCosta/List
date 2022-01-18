package exercicio.temperatura;
/*
Faça um programa que receba a temperatura média dos 6 primeiro meses do ano e armazene-as numa lista.
Após isso, calcule a média semestral das temperaturas e mostre todas as temperaturas acima dessa média, e em
qual mês elas ocorreram (Mostrar o mês por extenso ex.: 1 - Janeiro, 2 - Fevereiro).

*/


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        double mediaSemestral = 0;
        List<Temperatura> temperaturas = new ArrayList<>();
        temperaturas.add(new Temperatura("Janeiro",6));
        temperaturas.add(new Temperatura("Fevereiro",5));
        temperaturas.add(new Temperatura("Março",5));
        temperaturas.add(new Temperatura("Abril",10));
        temperaturas.add(new Temperatura("Maio",15));
        temperaturas.add(new Temperatura("Junho",15));

        System.out.println(temperaturas);

        for (Temperatura temperatura : temperaturas){
            mediaSemestral += temperatura.getMediaMensal();
        }
        mediaSemestral = mediaSemestral/temperaturas.size();

        System.out.println("Media Semestral: " + mediaSemestral);


        System.out.println("\nTemperaturas acima da média: ");
        for (Temperatura temperatura: temperaturas){
            if (temperatura.getMediaMensal()>mediaSemestral){
                System.out.print(temperatura);
            }
        }

    }

}
