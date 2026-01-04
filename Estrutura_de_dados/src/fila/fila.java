package fila;

public class fila<T> {
    private NO<T> refNoEntradaFila;

    public fila(){
        this.refNoEntradaFila = null;
    }

    public boolean isEnpty(){
        return refNoEntradaFila == null ? true : false;
    }
    public NO top(){
        return refNoEntradaFila;
    }

    public T dequeue(){
        NO auxiliarNO = refNoEntradaFila;
        NO primeiroNO = refNoEntradaFila;

        if(!isEnpty()){
            while(true){
                if(primeiroNO.getRefNO() != null){
                    auxiliarNO = primeiroNO;
                    primeiroNO = primeiroNO.getRefNO();
                }
                else{
                    auxiliarNO.setRefNO(null);
                    break;
                }
            }
            return (T)primeiroNO.getObject();
        }
        return null;
    }

    public void enqueue(T obj){
        NO novoNo = new NO(obj);
        NO auxiliarNo = refNoEntradaFila;
        refNoEntradaFila = novoNo;
        refNoEntradaFila.setRefNO(auxiliarNo);
    }

    public T first(){
        NO primeiroNO = refNoEntradaFila;

        if(!isEnpty()){
            while(true){
                if(primeiroNO.getRefNO() != null){
                    primeiroNO = primeiroNO.getRefNO();
                }
                else{
                    break;
                }
            }
            return (T)primeiroNO.getObject();
        }
        return null;
    }

    public String toString(){
        System.out.println("----------------------\n");
        System.out.println("   Fila    \n");
        System.out.println("----------------------\n");

        NO auxiliarNO = refNoEntradaFila;
        while(true){
            if(auxiliarNO != null){
                System.out.println(auxiliarNO.getObject()+"\n");
                auxiliarNO = auxiliarNO.getRefNO();
            }
            else{
                break;
            }

        }
        String retorno = "---------- Final ----------------";
        return retorno;
    }
}
