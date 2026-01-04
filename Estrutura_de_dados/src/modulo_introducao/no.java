/*
#########   MAIN   ###########
import modulo_introducao.no;

public class Main {
    public static void main(String[] args) {

        no<String> no1 = new no<>("Conteudo no1");
        no<String> no2 = new no<>("Conteudo no2");
        no1.setProximoNO(no2);
        no<String> no3 = new no<>("Conteudo no3");
        no2.setProximoNO(no3);
        no<String> no4 = new no<>("Conteudo no4");
        no3.setProximoNO(no4);
        no<String> no5 = new no<>("Conteudo no5");
        no4.setProximoNO(no5);

        System.out.println(no1);
        System.out.println(no1.getProximoNO());
        System.out.println(no1.getProximoNO().getProximoNO());
        System.out.println(no1.getProximoNO().getProximoNO().getProximoNO());
        System.out.println(no1.getProximoNO().getProximoNO().getProximoNO().getProximoNO());
        System.out.println(no1.getProximoNO().getProximoNO().getProximoNO().getProximoNO().getProximoNO());

    }
}
*/

package modulo_introducao;

public class no<T> {

    private T Conteudo;
    private no<T> ProximoNO;

    public no(T conteudo) {
        Conteudo = conteudo;
        ProximoNO = null;
    }

    public void setProximoNO(no<T> proximoNO) {
        ProximoNO = proximoNO;
    }

    public no<T> getProximoNO() {
        return ProximoNO;
    }

    @Override
    public String toString() {
        return "modulo_introducao.no{" +
                "Conteudo=" + Conteudo +
                '}';
    }
}
