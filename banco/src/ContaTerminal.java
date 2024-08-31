import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String agencia ,nomeConta ;
        int numero;
        float saldo;
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        agencia = scan.nextLine();
        System.out.println("Agora digite o nome do titular da conta:");
        nomeConta = scan.nextLine();
        System.out.println("Qual o número da conta: ");
        numero = scan.nextInt();
        System.out.println("Qual o saldo da conta: ");
        saldo = scan.nextFloat();
        System.out.printf("Olá "+ nomeConta+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo de %5.2f já está disponível para saque!",saldo);
        scan.close();

    }
}
