package ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion = 0;
		double lado1;
		double lado2;
		double lado3;

		Poligono[] poligonos = new Poligono[0];

		Scanner read = new Scanner(System.in);

		do {
			System.out.println("MENÚ");
			System.out.println("====================================");
			System.out.println("1. TRIANGULO");
			System.out.println("2. RECTANGULO");
			System.out.println("3. LISTADO ARRAY");
			System.out.println("4. SALIR");
			System.out.println();
			System.out.println("Elige una opción: ");
			opcion = read.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Lados del triangulo: ");
				lado1 = read.nextDouble();
				lado2 = read.nextDouble();
				lado3 = read.nextDouble();

				poligonos = Arrays.copyOf(poligonos, poligonos.length + 1);
				poligonos[poligonos.length - 1] = new Triangulo(3, lado1, lado2, lado3);
				break;
			case 2:
				System.out.println("Lados del rectangulo: ");
				lado1 = read.nextDouble();
				lado2 = read.nextDouble();

				poligonos = Arrays.copyOf(poligonos, poligonos.length + 1);
				poligonos[poligonos.length - 1] = new Rectangulo(2, lado1, lado2);
				break;
			case 3:

				for (int i = 0; i < poligonos.length; i++) {
					System.out.println(poligonos[i].toString());
				}

				break;
			case 4:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("La opción no es correcta");
			}

		} while (opcion != 4);

	}

}
