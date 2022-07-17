package n1exercici1;

//Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix tipus, 
//juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor per a inicialitzar els tres. 
//Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.

public class Main {

	public static void main(String[] args) {

		NoGenericMethods coche1 = new NoGenericMethods(1, 112, 180);
		NoGenericMethods coche2 = new NoGenericMethods(2, 84, 170);
		NoGenericMethods coche3 = new NoGenericMethods(3, 204, 180);

		//como todos argumentos son de tipo int, se puede poner en cualquier posición.

		coche1.setPotencia(coche2.getVelocidad());

		coche2.setId(coche3.getPotencia());
		
		System.out.println(coche1.toString());
		System.out.println(coche2.toString());

	}

}
