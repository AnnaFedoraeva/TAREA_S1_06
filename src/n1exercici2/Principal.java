package n1exercici2;

public class Principal {

	public static void main(String[] args) {

		// llamamos a un método genérico de la clase GenericMethods que acepte tres
		// argumentos de tipo genérico

		GenericMethods.generic("Lisa", "Lopez", 23);
		GenericMethods.generic("Lisa", 1.60, 23);
		GenericMethods.generic(23, "Lisa", "Lopez");
		GenericMethods.generic(new Persona("Bea", "Lopez", 21), "Camarera", 1500);

		// llamamos metodo genericMain con distintos tipos de parámetros

		genericMain(new Persona("Lisa", "Lopez", 23), "Camarera", 1450);
		genericMain("Lisa", "Lopez", 23);
		genericMain("Lisa", 1.60, 23);
		genericMain(23, "Lisa", "Lopez");

	}

	public static <T, V, U> void genericMain(T ob1, V ob2, U ob3) {
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
	}

}
