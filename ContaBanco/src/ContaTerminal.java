import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
 
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Qual o seu nome?");
        String nome = scanner.next();

        System.out.println("Qual o número da sua conta?");
        int conta = scanner.nextInt();
        
        System.out.println("Qual a sua agência?");
        String agencia = scanner.next();

        System.out.println("Quanto você quer sacar?");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ conta + " e seu saldo de "+ saldo + " ja está disponivel para o saque.");


    }
}
