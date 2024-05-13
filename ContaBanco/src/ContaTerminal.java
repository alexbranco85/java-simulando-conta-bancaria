import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome;
        String agencia;
        int numeroConta;
        double saldo;

        System.out.println("Bem-vindo ao Banco Digital!");
        System.out.println("Vamos criar a sua conta. Por favor, preencha os dados solicitados:");
        System.out.println("Digite seu nome completo:");
        nome = scanner.nextLine();
        System.out.println("Digite o número da agência:");
        agencia = scanner.next();
        System.out.println("Digite o número da conta:");
        numeroConta = scanner.nextInt();
        System.out.println("Digite o saldo inicial da conta:");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", número da conta: " + numeroConta + " e seu saldo de: " +  saldo + " já está disponível para saque.");

        System.out.println("Olá ".concat(nome).concat(", obrigado por criar uma conta em nosso banco, sua agência é: ").concat(agencia).concat(", número da conta: ") + numeroConta + " e seu saldo de: " + saldo + " já está disponível para saque.");

    }
}
