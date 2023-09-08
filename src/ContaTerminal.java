import java.util.Locale;
/*A classe Locale é nativa da linguagem Java e é utilizada para lidar com convenções regionais
 * referente a números, preços, moedas e outros, sendo possível trabalhar com informações formatadas.
 */
import java.util.Scanner;
/*a classe Scanner permite que trabakhemos com inputs no terminal, onde ela esperará que o usuário
 * faça a entrada de um dado para que o próximo seja inserido
 */

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            /*Aqui estamos instanciando um variável do tipo Scanner que será um novo obj Scanner, que terá
             * todos os métodos herdados da classe Scanner que nós importamos
             */

            /*em (System.in) estamos definindo que a classe Scanner lerá os dados a partir do teclaro. A classe
              * escuta um evento ocorrer no teclado, dependendo da tecla tocada o evento escutará qual character é e o
              lerá automaticamente
            */
            /*em useLocale estamos passando a class de formação Locale com o padrão Us, isso para que 
             * os numeros sejam formatados no padrão norte-americano
             */

            System.out.println("Digite o número da sua conta");
            int numero = scanner.nextInt();

            scanner.nextLine();
            /*
             * a classe scanner está capturando quebras de linha '/n' no terminal
             * que estão sendo transferidas para os próximos inputs, e para evitar isso
             * passamos um nextLine para que estes espaços sejam pegos por esse scanner,
             * fazendo que o próximo não faça a leitura do mesmo
             */

            System.out.println("Digite o número da sua agência");
            String agencia = scanner.nextLine();

            System.out.println("Digite seu nome completo");
            String nomeCliente = scanner.nextLine();

            /*
             * o nestLine() neste caso possibilita que possamos passar o nome completo do
             * cliente com espaços, pois o next() comum lê dados até encontrar o primeiro espaço
             */

            System.out.println("Digite o seu saldo");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
             + agencia + ", o número da sua conta é " + numero + " e seu saldo de " + saldo +
              " já está disponível para saque");

           scanner.close();

           /*
            * Após o uso do scanner setamos que estamos fechando a classe para evitar danos na performance
            */
    }
    
}
