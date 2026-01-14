package on.digitalinnovation;

import java.util.*;

public class main {

    public static void main(String[] args){

        Set<String> cores = new HashSet(Arrays.asList("vermelho","amarelo","verde","azul","anil","violeta"));

        Iterator<String> iterator = cores.iterator();
        int quantidade = 0;
        while(iterator.hasNext()){
            String cor = iterator.next();
            System.out.println(cor);
            quantidade += 1;
        }

        System.out.println("quantidade de cores: " + quantidade);
        Set<String> cores1 = new TreeSet<>(cores);
        Set<String> cores2 = new TreeSet<>(Collections.reverseOrder());
        cores2.addAll(cores);
        System.out.println("Em ordem alfabetica: " + cores1);
        System.out.println("Ao contrario da ordem alfabetica: " + cores2);

        Iterator<String> iterator1 = cores.iterator();
        while(iterator1.hasNext()){
            String cor = iterator1.next();
            if(cor.charAt(0) == 'v') System.out.println(cor);
        }

        Iterator<String> iterator2 = cores.iterator();
        while(iterator2.hasNext()){
            String cor = iterator2.next();

            if(cor.startsWith("v")) {
                String corRemovida = cor;
                System.out.println("Removendo: " + corRemovida);
                iterator2.remove();
            }
        }

        System.out.println("limpando conjunto");
        cores2.clear();
        System.out.println("Conjunto vazio: " + cores2.isEmpty());



    }
}
