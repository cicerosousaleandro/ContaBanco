import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da Agência:");
		int numeroAgencia = sc.nextInt();
		
		System.out.println("Por favor, digite o número da Conta:");
		String numero = sc.next();
		
		System.out.println("Por favor, digite a quantia que deseja depositar:");
		Float deposito = sc.nextFloat();
		
		System.out.println("Olá cliente, por favor, digite seu primeiro nome:");
		String nomeCliente = sc.next();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, agora você é um cliente Santander. Sua agência é %d, conta %s e seu soldo %.2f\n já está disponível para saque! ", nomeCliente, numeroAgencia, numero, deposito );
		
		
		sc.close();

	}

}
