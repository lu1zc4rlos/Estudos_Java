package on.digitalinnovation;

import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public LinguagemFavorita(Integer anoDeCriacao, String nome, String ide) {
        this.anoDeCriacao = anoDeCriacao;
        this.nome = nome;
        this.ide = ide;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "{" +
                "anoDeCriacao='" + anoDeCriacao + '\'' +
                ", nome='" + nome + '\'' +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) object;
        return Objects.equals(nome, that.nome) && Objects.equals(anoDeCriacao, that.anoDeCriacao) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    @Override
    public int compareTo(LinguagemFavorita o) {
        /* ORDEM NATURAL NOME
        int nome = this.nome.compareTo(o.getNome());
        return nome;
        */

        /* ORDEM NATURAL IDE
         int ide = this.ide.compareTo(o.getIde());
         return ide;
         */

        /* ORDEM NATURALL NOME E ANO DE CRIAÇÃO
        int nome = this.nome.compareTo(o.getNome());
        if(nome != 0)return  nome;
        return this.anoDeCriacao.compareTo(o.getAnoDeCriacao());
        */

        /* ORDEM NATURAL NOME,ANO DE CRIAÇÃO E IDE */
        int nome = this.nome.compareTo(o.getNome());
        int ide = this.ide.compareTo(o.getIde());

        if(nome != 0)return  nome;
        if(ide != 0)return ide;

        return this.anoDeCriacao.compareTo(o.getAnoDeCriacao());
    }
}
