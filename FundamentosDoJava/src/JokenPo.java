import java.util.Scanner;

public class JokenPo{

	public static void main(String[] args) {
		// lógica do jogador
		int jogador;
		Scanner mao = new Scanner(System.in);
		System.out.println("_______________");
		System.out.println("____JoKenPo____");
		System.out.println("_______________");
		System.out.println("");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3.Tesoura");
		System.out.print("Digite uma das 3 opções acima:");
		jogador = mao.nextInt();
		
		//estrutura swtich case adimite apenas tipo int e char
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
			
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;
			
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;


		default:
			System.out.println("Opção Inválida");
			break;
		}
		//lógica do computador
		//a linha abaixo gera números aleatórios entre 0 e 2
		//(int) converte para o tipo inteiro (casting)
		//+1 soma 1 ao resultado (1,2 ou 3)
		int computador = (int)(Math.random() * 3 + 1);
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
			
		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;
			
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
		}
		//lógica para determinar o vencedor ou empate
		if (jogador == computador){
			System.out.println("EMPATE");
		}else {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)){
				System.out.println("JOGADOR VENCEU");
			} else {
				System.out.print("COMPUTADOR VENCEU");
			}
		}
		mao.close();
	}

}
