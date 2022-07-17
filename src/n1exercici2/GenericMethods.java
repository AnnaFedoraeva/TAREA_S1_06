package n1exercici2;

public class GenericMethods<T, V, U> {

	T ob1;

	V ob2;
	
	U ob3;

	public GenericMethods(T ob1, V ob2, U ob3) {
		super();
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


	void showTypes()
	       {
	           System.out.println("Type of T is : " + ob1.getClass().getName());
	           System.out.println("Type of V is : " + ob2.getClass().getName());
	           System.out.println("Type of U is : " + ob3.getClass().getName());
	       }
	
	void print () {
		System.out.println(getOb1().toString());
		System.out.println(getOb2().toString());
		System.out.println(getOb3().toString());
	}

}
