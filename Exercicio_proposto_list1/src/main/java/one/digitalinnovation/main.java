package one.digitalinnovation;
import com.sun.source.tree.WhileLoopTree;

import java.io.Console;
import java.util.Iterator;
import  java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args){

        List<temperatura> temperaturas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a temperatura de janeiro: ");
        temperaturas.add(new temperatura("janeiro",scanner.nextDouble()));
        System.out.println("Entre com a temperatura de fevereiro: ");
        temperaturas.add(new temperatura("fevereiro",scanner.nextDouble()));
        System.out.println("Entre com a temperatura de março: ");
        temperaturas.add(new temperatura("março",scanner.nextDouble()));
        System.out.println("Entre com a temperatura de abril: ");
        temperaturas.add(new temperatura("abril",scanner.nextDouble()));
        System.out.println("Entre com a temperatura de maio: ");
        temperaturas.add(new temperatura("maio",scanner.nextDouble()));
        System.out.println("Entre com a temperatura de junho: ");
        temperaturas.add(new temperatura("junho",scanner.nextDouble()));

        Double soma = 0.0;
        int i = 0;
        for(temperatura item : temperaturas){
            soma += temperaturas.get(i).getTemperatura();
            i += 1;
        }
        i = 0;
        for(temperatura item : temperaturas){
            if(temperaturas.get(i).getTemperatura() > (soma/temperaturas.size())){
                System.out.print(temperaturas.get(i) + " -> ");
            }
            i += 1;
        }



    }

}
