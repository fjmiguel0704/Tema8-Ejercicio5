package ejercicio5;

public abstract class Poligono {

	protected int numeroLados = 3;

	abstract public double area();

	public Poligono(int numeroLados) {
		super();
		if (numeroLados >= 3)
			this.numeroLados = numeroLados;
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	@Override
	public String toString() {
		return "Numero de lados: " + numeroLados;
	}
}