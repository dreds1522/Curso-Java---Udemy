import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Numero = sc.nextInt();
		int Horas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double Salario = Horas * valorHora;
		
		System.out.println("Número = " + Numero);
		System.out.printf("Salário = $ %.2f%n ", Salario);
		
		sc.close();
		

	}

}
