public class No<T> {
    private T Conteudo;
    private No<T> noProximo;

    public No(T Conteudo){
        this.Conteudo = Conteudo;
        noProximo = null;
    }

    public void setNoProximo(No<T> noProximo) {
        this.noProximo = noProximo;
    }

    public void setConteudo(T conteudo) {
        Conteudo = conteudo;
    }

    public T getConteudo() {
        return Conteudo;
    }

    public No<T> getNoProximo() {
        return noProximo;
    }

    @Override
    public String toString() {
        return "No{" +
                "Conteudo=" + Conteudo +
                '}';
    }
}
