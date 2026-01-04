package fila;

public class NO<T> {
    private T object;
    private NO<T> refNO;

    public NO(){
    }
    public NO(T object){
        this.object = object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public void setRefNO(NO refNO) {
        this.refNO = refNO;
    }

    public Object getObject() {
        return object;
    }

    public NO getRefNO() {
        return refNO;
    }

    @Override
    public String toString() {
        return "fila.NO{" +
                "object=" + object +
                '}';
    }
}
