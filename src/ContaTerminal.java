import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o n�mero da Ag�ncia:");
		int numeroAgencia = sc.nextInt();
		
		System.out.println("Por favor, digite o n�mero da Conta:");
		String numero = sc.next();
		
		System.out.println("Por favor, digite a quantia que deseja depositar:");
		Float deposito = sc.nextFloat();
		
		System.out.println("Ol� cliente, por favor, digite seu primeiro nome:");
		String nomeCliente = sc.next();
		
		System.out.printf("Ol� %s, obrigado por criar uma conta em nosso banco, agora voc� � um cliente Santander. Sua ag�ncia � %d, conta %s e seu soldo %.2f\n j� est� dispon�vel para saque! ", nomeCliente, numeroAgencia, numero, deposito );
		
		
		sc.close();

	}

}
