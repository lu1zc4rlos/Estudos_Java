package on.digitalinnovation;

import java.util.*;

public class main {

    public static void main(String[] args){

        Set<LinguagemFavorita> linguagens = new HashSet<LinguagemFavorita>(){{
            add(new LinguagemFavorita(1991,"Java","intellij"));
            add(new LinguagemFavorita(1989,"Python","Visual Studio Code"));
            add(new LinguagemFavorita(2000,"C#","Visual Studio"));
        }};

        for(LinguagemFavorita linguagemFavorita : linguagens ){
            System.out.println(linguagemFavorita.getNome() +" - "+ linguagemFavorita
                    .getAnoDeCriacao() +" - "+ linguagemFavorita.getIde());
        };

        Set<LinguagemFavorita> linguagens1 = new LinkedHashSet<LinguagemFavorita>(){{
            add(new LinguagemFavorita(1991,"Java","intellij"));
            add(new LinguagemFavorita(1989,"Python","Visual Studio Code"));
            add(new LinguagemFavorita(2000,"C#","Visual Studio"));
        }};
        Set<Set> linguagens_nome = Collections.singleton(new TreeSet<>(linguagens1));
        System.out.println(linguagens_nome);
    }
}
