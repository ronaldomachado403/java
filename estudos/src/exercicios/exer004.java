package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exer004 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero positivo ou negativo:");
		int numero = sc.nextInt();

		if (numero > 0) {
			System.out.println("Numero Positivo");
		} else if (numero == 0) {
			System.out.println("Numero Neutro");
		} else if (numero < 0) {
			System.out.println("Numero Negativo");
		} else {
			System.out.println("Numero Invalido");
		}

		sc.close();
	}

}
