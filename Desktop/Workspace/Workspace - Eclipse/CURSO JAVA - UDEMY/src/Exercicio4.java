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
		
		System.out.println("N�mero = " + Numero);
		System.out.printf("Sal�rio = $ %.2f%n ", Salario);
		
		sc.close();
		

	}

}
