package exemplos;

public class processamentoCasting {

	public static void main(String[] args) {

		int x, y;
		x = 5;
		y = 2 * x;
		
		double b,B,h,area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b+B) / 2.0 * h;
		
		int w,z;
		double resultado;
		
		w = 5;
		z = 2;
		resultado = (double) w / z;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(area);
		System.out.println(resultado);
		
		
	}

}
