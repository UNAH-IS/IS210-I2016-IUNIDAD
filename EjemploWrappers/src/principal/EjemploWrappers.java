package principal;

import java.util.ArrayList;

public class EjemploWrappers {
	public EjemploWrappers(){
		boolean b1 = true;
		Boolean b2 = new Boolean(true);
		Boolean b3 = true;
		Integer i = new Integer(1);
		Integer i2 = new Integer("555");
		Integer i3 = 123;
		
		int a = Integer.valueOf("345");
		
		ArrayList<Integer> enteros;
		
	}
	
	public static void main(String[] args) {
		new EjemploWrappers();
	}
}
