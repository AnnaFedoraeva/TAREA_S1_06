package n1exercici1;

public class NoGenericMethods {

	private int id;
	private int potencia;
	private int velocidad;

public NoGenericMethods(int id, int potencia, int velocidad) {
	super();
	this.id = id;
	this.potencia = potencia;
	this.velocidad = velocidad;
}

	@Override
	public String toString() {
		return "NoGenericMethods [id=" + id + ", potencia=" + potencia + ", velocidad=" + velocidad + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

}
