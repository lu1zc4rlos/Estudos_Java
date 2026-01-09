package one.digitalinnovation;

public class BinNo<T extends Comparable<T>> {

    private T conteudo;
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    public BinNo(T conteudo){
        this.conteudo = conteudo;
        noDir = null;
        noEsq = null;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public void setNoDir(BinNo<T> noDir) {
        this.noDir = noDir;
    }

    public void setNoEsq(BinNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    public T getConteudo() {
        return conteudo;
    }

    public BinNo<T> getNoDir() {
        return noDir;
    }

    public BinNo<T> getNoEsq() {
        return noEsq;
    }

    @Override
    public String toString() {
        return "BinNo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
