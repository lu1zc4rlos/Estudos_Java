import java.util.*;

public class main {
    public static void main(String[] args) {
        Map<String,String> populacao = new HashMap(){{
            put("PE","9.616.621");
            put("AL","3.351.543");
            put("CE","9.187.103");
            put("RN","3.534.265");
        }};
        populacao.put("RN","3.534.165");
        System.out.println("População do RN substituida para: " + populacao.get("RN"));
        System.out.println("PB está no dicionario: " + populacao.containsKey("PB"));
        populacao.put("PB","4.039.277");
        System.out.println("Adicionando PB: " + populacao.containsKey("PB"));
        System.out.println("População do PE: " + populacao.get("PE"));

        Map<String,String> populacao_ordenada = new LinkedHashMap(){{
            put("PE","9.616.621");
            put("AL","3.351.543");
            put("CE","9.187.103");
            put("RN","3.534.165");
            put("PB","4.039.277");
        }};
        System.out.println("Estados e população em ordem informada: " + populacao_ordenada);

        Map<String,String> populacao_alfabetica = new TreeMap<>(populacao_ordenada);
        System.out.println("Estados e população em ordem alfabetica: " + populacao_alfabetica);

        String menor = Collections.min(populacao.values());
        Set<Map.Entry<String,String>> entries = populacao.entrySet();
        String estado = "";

        for(Map.Entry<String,String> entry : entries){
            if(entry.getValue().equals(menor)){
                estado = entry.getKey();
            }
        }
        System.out.println("Menor população é o " + estado + " com " + menor);

        String maior = Collections.max(populacao.values());
        for(Map.Entry<String,String> entry : entries){
            if(entry.getValue().equals(maior)){
                estado = entry.getKey();
            }
        }
        System.out.println("Maior população é o " + estado + " com " + maior);

        long n1 = Long.parseLong(menor.replace(".", ""));
        long n2 = Long.parseLong(maior.replace(".", ""));
        System.out.println("A media desses dois estados é: " + (n1+n2)/2);

        Iterator<String> iterator = populacao.values().iterator();
        while (iterator.hasNext()){
            String populacaoStr = iterator.next();
            long valor = Long.parseLong(populacaoStr.replace(".",""));
            if(valor < 4000000){
                iterator.remove();
            }
        }
        System.out.println("Estados depois da remoção do menores que 4.000.000: " + populacao);
        populacao.clear();
        System.out.println("Dicionario apagado, o dicionario esta vazio: " + populacao.isEmpty());


    }
}
