import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{

        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Exibir as mensagens para o nosso usuario

        //Obter pela scanner os valores digitados no terminal

        System.out.println("Por favor, informe seu numero:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, Informe sua agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, Informe seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, seu saldo");
        double saldo = scanner.nextDouble();
        
        
        //Exibir a mensagem conta criada

        String contaCompleta = contaCompleta(numero, agencia, nomeCliente, saldo);        
        
        System.out.println(contaCompleta);
        scanner.close();
    }

    //Exibir a mensagem conta criada
    public static String contaCompleta(int numero, String agencia, String nomeCliente, double saldo){
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e o seu saldo " + saldo + " ja está disponivel para saque";
    } 
}
