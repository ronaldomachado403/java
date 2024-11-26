package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero par ou impar:");
		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("Positivo");
		} else if (numero % 2 != 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Numero Invalido!");
		}

		sc.close();
	}

}
