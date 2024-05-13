import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Seja bem vindo(a)! Crie a sua conta.");
		System.out.print("Digite seu nome completo: ");
		nomeCliente = ler.nextLine();
		
		System.out.print("Digite o número da agência: ");
		agencia = ler.nextLine();
		
		System.out.print("Digite o número da conta: ");
		numero = ler.nextInt();
		
		System.out.print("Digite seu saldo: R$ ");
		saldo = ler.nextDouble();

		System.out.println("Olá, " + nomeCliente +  "! Obrigado por criar uma conta em nosso banco. Sua agência é "
				+ agencia + " e sua conta é " + numero + ". Seu saldo atual é de R$ " + saldo + " e já está disponível para saque!");
		
		ler.close();
	}

}
