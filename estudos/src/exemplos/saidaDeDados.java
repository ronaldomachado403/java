package exemplos;

import java.util.Locale;

public class saidaDeDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int idade = 7;
		double x = 45.237654;
	    String nome = "Ronaldo";
	    System.out.println("Bom Dia");
		System.out.print("Boa Tarde,");
		System.out.print("tudo bem?");
		System.out.println();
		System.out.println(idade);
		System.out.println("Minha idade: " + idade);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
	    System.out.printf("Nome: %s Idade: %d Peso: %f",nome,idade,x);
        
	}

}
