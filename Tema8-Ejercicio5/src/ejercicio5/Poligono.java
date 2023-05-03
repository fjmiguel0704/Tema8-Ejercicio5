package ejercicio5;

public abstract class Poligono {

	protected int numLados = 3;

	abstract public double area();

	public Poligono(int numeroLados) {
		super();
		if (numeroLados >= 3)
			this.numLados = numeroLados;
	}

	public int getNumeroLados() {
		return numLados;
	}

	@Override
	public String toString() {
		String result;
		result = "Lados: " + numLados;
		return result;
	}
}