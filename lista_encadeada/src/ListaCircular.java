import java.util.List;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular(){
        this.cauda = null;
        this.cabeca = null;
        tamanhoLista = 0;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(this.cauda);
        }
        else{
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        tamanhoLista += 1;
    }

    public void remove(int index){
        if(index >= tamanhoLista){
            throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista.");
        }
        if(index == 0){
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        }
        else if(index == 1){
            cauda.setNoProximo(cauda.getNoProximo().getNoProximo());
        }
        else{
            No<T> auxiliarNo = this.cauda;
            for(int i = 0;i < (index-1);i++){
                auxiliarNo = auxiliarNo.getNoProximo();
            }
            auxiliarNo.setNoProximo(auxiliarNo.getNoProximo().getNoProximo());
        }
        tamanhoLista -= 1;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("A lista esta vazia");
        }
        if(index == 0){
            return this.cauda;
        }
        No<T> auxiliarNo = this.cauda;
        for(int i = 0;i < index;i++){
           auxiliarNo = auxiliarNo.getNoProximo();
        }
        return auxiliarNo;
    }

    public boolean isEmpty(){
        return tamanhoLista == 0 ? true : false;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = this.cauda;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        strRetorno += this.size() != 0 ? "(Retorna ao início)" : "[]";

        return strRetorno;
    }
}
