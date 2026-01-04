package pilha;

public class pilha {
    private No refNoEntradaPilha;

    public pilha(){
        this.refNoEntradaPilha = null;
    }

    public boolean isEnpty(){
       return refNoEntradaPilha == null ? true : false;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public No pop(){
        if(!isEnpty()){
            No auxiliarNo = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return auxiliarNo;
        }
        return null;
    }

    public void push(No novoNo){
        No auxiliarNo = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(auxiliarNo);
    }

    public String toString(){
        System.out.println("----------------------\n");
        System.out.println("   Pilha    \n");
        System.out.println("----------------------\n");

        No auxiliarNo = refNoEntradaPilha;
        while(true){
            if(auxiliarNo != null){
                System.out.println(auxiliarNo.getDado()+"\n");
                auxiliarNo = auxiliarNo.getRefNo();
            }
            else{
                break;
            }

        }
        String retorno = "---------- Final ----------------";
        return retorno;
    }

}
