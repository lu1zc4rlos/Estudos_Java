import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrada: dois números inteiros positivos: m e n com m > n");
        System.out.println("máximo divisor comum");
        int m,n;

        while (true) {
            System.out.print("Entre com m: ");
            m = scanner.nextInt();
            System.out.print("Entre com n: ");
            n = scanner.nextInt();

            if (m <= n) {
                System.out.println("m precisa ser maior que n!");
                System.out.println("Digite novamente!");
            } else if (m < 0 || n < 0) {
                System.out.println("m e n precisam ser positivos!");
                System.out.println("Digite novamente!");
            } else {
                break;
            }
        }

        int x = m;
        int y = n;

        while (true){
            int r = x%y;

            x = y;
            y = r;
            if(r != 0){
                continue;
            }
            else {
                System.out.println("O mdc entre "+m+" e "+n+": é: " + x);
                break;
            }
        }

    }


}
