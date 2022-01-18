package one.digitalinnovation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {
    //dadas as seguintes informações sobre os meus gatos, crie uma lista
    //e ordene esta lista exibindo
    //(nome - idade - cor)

    /*
    Gato 1 = nome: jon, idade: 18, cor: preto
    gato 2 = nome: simba, idade: 6, cor: tigrado
    gato 3 = nome: jon, idade: 12, cor: amarelo
    * */
    public static void main(String[] args) {
        List<Gato> gataria = new ArrayList<>();

        gataria.add(new Gato("Jon",18,"preto"));
        gataria.add(new Gato("simba",6,"tigrado"));
        gataria.add(new Gato("Jon",12,"amarelo"));
        gataria.add(new Gato("Luke",2,"malhado"));


        System.out.println("Ordem de insersão");
        System.out.println(gataria);

        System.out.println("\nOrdem aleatória:");
        Collections.shuffle(gataria);
        System.out.println(gataria);

        System.out.println("\nOrdem alfabetica por nomes:");
        Collections.sort(gataria);
        System.out.println(gataria);

        System.out.println("\nOrdem por idades:");
        gataria.sort(new ComparatorIdade());
        System.out.println(gataria);


        System.out.println("\nOrdem alfabetica por cores:");
        gataria.sort(new ComparatorCor());
        System.out.println(gataria);

        System.out.println("\nOrdem Nome/Cor/Idade:");
        gataria.sort(new ComparatorNomeIdadeCor());
        System.out.println(gataria);

    }
}

