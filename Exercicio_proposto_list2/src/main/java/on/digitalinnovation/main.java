package on.digitalinnovation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args){
        List<Integer> questionario = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda as perguntas com 1 se for verdadeiro e 0 se for falso");
        System.out.println("1. Telefone para a vítima?");
        questionario.add(scanner.nextInt());

        System.out.println("2. Esteve no local do crime?");
        questionario.add(scanner.nextInt());

        System.out.println("3. Mora perto da vítima?");
        questionario.add(scanner.nextInt());

        System.out.println("4. Devia para a vítima?");
        questionario.add(scanner.nextInt());

        System.out.println("5. Já trabalhou com a vítima?");
        questionario.add(scanner.nextInt());

        int soma = 0;
        for(int i = 0; i<questionario.size(); i++){
            if(questionario.get(i) == 1)soma+=1;
        }
        if(soma == 2)System.out.println("Você é suspeito!");
        if(soma == 3 || soma == 4)System.out.println("Você é cúmplice!");
        if(soma == 5)System.out.println("Você é o assasino!");
        if(soma == 0 || soma == 1)System.out.println("Você é inocente!");





    }
}
