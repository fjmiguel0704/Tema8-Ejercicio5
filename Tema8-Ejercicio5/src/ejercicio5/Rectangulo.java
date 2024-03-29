package ejercicio5;

public class Rectangulo extends Poligono {

	private double lado1 = 1;
	private double lado2 = 1;

	public Rectangulo(int numLados) {
		super(numLados);
	}

	public Rectangulo(int numLados, double lado1, double lado2) {
		super(numLados);
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	@Override
	public double area() {
		double result;
		result = lado1 * lado2;
		return result;
	}

	@Override
	public String toString() {
		String result;
		result = "Área del rectángulo: " + lado1 + "*" + lado2 +  ": " + area();
		return result;
	}
}
