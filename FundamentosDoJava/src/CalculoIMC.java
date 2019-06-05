import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Cálculo da Média
 * @author lucas.rsilva53
 **
 */
public class CalculoIMC {

	public static void main(String[] args) {
		double peso, altura, imc;
		System.out.println("Calculo do IMC");
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		Scanner leia = new Scanner(System.in);
		leia.useLocale(Locale.ENGLISH);
		
		System.out.println("Digite a sua peso: ");
		peso = leia.nextDouble();
		
		System.out.println("Digite o seu altura:");
		altura = leia.nextDouble();
		imc = peso / (altura * altura);
		
		System.out.println("IMC: " + formatador.format(imc));
		//para criar um intervalo o operador AND (&&)
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Peso normal");
		} else if (imc >= 25 && imc <30) {
			System.out.println("Acima do peso");
		} else {
			System.out.println("Obeso");
		}
		
		leia.close();	

	}

}