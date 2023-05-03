package ejercicio5;

public class Triangulo extends Poligono {

	private double lado1 = 1;
	private double lado2 = 1;
	private double lado3 = 1;

	public Triangulo(int numeroLados) {
		super(numeroLados);
	}

	public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
		super(numeroLados);
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
		if (lado3 > 0) {
			this.lado3 = lado3;
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

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	@Override
	public double area() {
		double area;
		double heron;
		area = (lado1 + lado2 + lado3) / 2;
		heron = Math.sqrt(area * (area - lado1) * (area - lado2) * (area - lado3));
		return heron;
	}

	@Override
	public String toString() {
		String result;
		result = "Área del triángulo, fórmula herón: " + area();
		return result;
	}

}
