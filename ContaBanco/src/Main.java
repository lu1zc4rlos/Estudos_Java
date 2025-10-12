import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaTerminal contaTerminal = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

       System.out.println("Por favor, digite o número da Conta: ");
       contaTerminal.numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        contaTerminal.agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente: ");
        scanner.nextLine();
        contaTerminal.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        contaTerminal.saldo = scanner.nextDouble();

        System.out.println("Olá " +contaTerminal.nomeCliente+ ", obrigado por criar uma conta em nosso banco," +
            " sua agência é "+contaTerminal.agencia+", conta "+contaTerminal.numero+" e" +
                " seu saldo "+contaTerminal.saldo+" já está disponível para saque");


    }
}