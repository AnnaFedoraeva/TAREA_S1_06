package n1exercici2;

public class Principal {

	public static void main(String[] args) {

		GenericMethods<String, String, Integer> obj = new GenericMethods<String, String, Integer>("Lola", "Gomez", 15);
		obj.showTypes();
		obj.print();

		GenericMethods<Persona, String, Integer> genObj = generic();
		genObj.showTypes();
		genObj.print();

	}

	public static GenericMethods<Persona, String, Integer> generic() {
		GenericMethods<Persona, String, Integer> obj1 = new GenericMethods<Persona, String, Integer>(
				new Persona("Bea", "Lopez", 21), "Camarera", 1500);
		obj1.print();
		return obj1;

	}

}
