package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class estruturaIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Digite a hora (0 a 23): ");
		int hora = sc.nextInt();
		
		if (hora >= 6 && hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora >= 12 && hora < 18) {
			System.out.println("Boa tarde!");
		} else if (hora >= 18 && hora < 24) {
			System.out.println("Boa noite!");
		} else if(hora >= 0 && hora < 5) {
			System.out.println("Boa Madrugada");
		}
		else {
			System.out.println("Hora inválida! Por favor, digite uma hora entre 0 e 23.");
		}

		sc.close();
	}

}
