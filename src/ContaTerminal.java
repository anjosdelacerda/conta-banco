import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o número da sua conta");
            int numero = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Digite o número da sua agência");
            String agencia = scanner.nextLine();

            System.out.println("Digite seu nome completo");
            String nomeCliente = scanner.nextLine();

            System.out.println("Digite o seu saldo");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
             + agencia + ", o número da sua conta é " + numero + " e seu saldo de " + saldo +
              " já está disponível para saque");

           scanner.close();
    }
    
}
