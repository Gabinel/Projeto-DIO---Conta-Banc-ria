import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        boolean erro = true;
        int numero = 0, saldo = 0;
        String agencia = "", nomeCliente = "";

        Scanner in = new Scanner(System.in);

        while(erro) {

            erro = false;

            try {

                System.out.println("Bem vindo!\n" +
                        "Para começar, digite o número da sua nova conta: ");
                numero = in.nextInt();

                System.out.println("Agora, digite o número da agência: ");
                agencia = in.next();

                System.out.println("Por favor, digite seu nome: ");
                nomeCliente = in.next();

                System.out.println("Por fim, digite o saldo da sua nova conta: ");
                saldo = in.nextInt();

            } catch (Exception e) {
                erro = true;
                in.next();
            }

        }

        imprimir(numero, agencia, nomeCliente, saldo);

    }

    public static void imprimir(int numero, String agencia, String nomeCliente, int saldo) {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta" +
                " em nosso banco, sua agência é " + agencia + ", conta " +
                numero + " e seu saldo " + saldo + " já está disponível para saque");
    }

}
