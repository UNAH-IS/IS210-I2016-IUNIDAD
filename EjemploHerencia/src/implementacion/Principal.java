package implementacion;

import clases.Alumno;

public class Principal {
	public Principal(){
		Alumno a = new Alumno(
				"Juan","Perez","M",34,"Ing. Sistemas",
				"jperez@gmail.com",
				"20001232333");
		a.matricular();
		//System.out.println(a.toString());
		//Alumno a1 = new Alumno();
		
		
	}
	
	
	public static void main(String[] args) {
		new Principal();
	}

}
