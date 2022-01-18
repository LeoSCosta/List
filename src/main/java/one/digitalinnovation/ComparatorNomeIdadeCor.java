package one.digitalinnovation;

import java.util.Comparator;

public class ComparatorNomeIdadeCor implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {

        int retorno = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if(retorno != 0) return retorno;

        retorno = gato1.getCor().compareToIgnoreCase(gato2.getCor());
        if(retorno != 0) return retorno;

        retorno = Integer.compare(gato1.getIdade(),gato2.getIdade());
        return retorno;

    }
}
