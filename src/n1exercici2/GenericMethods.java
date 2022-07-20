package n1exercici2;

public class GenericMethods<T, V, U> {

	T ob1;

	V ob2;

	U ob3;

	public GenericMethods(T ob1, V ob2, U ob3) {
		this.ob1 = ob1;
		this.ob2 = ob2;
		this.ob3 = ob3;

	}

	public T getOb1() {
		return ob1;
	}

	public V getOb2() {
		return ob2;
	}

	@Override
	public String toString() {
		return "GenericMethods [ob1=" + ob1 + ", ob2=" + ob2 + ", ob3=" + ob3 + "]";
	}

	public U getOb3() {
		return ob3;
	}

	public static <T, V, U> void generic (T ob1, V ob2, U ob3) {
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
	}

}
