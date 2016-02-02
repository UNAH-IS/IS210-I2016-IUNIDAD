package Ejemplos;

public class EjemploFor {
	public static void main(String[] args){
		for(int i=1; i<11; i++){
             System.out.println("Contador: " + i);
        }
		
		for(int i=10; i>=1; i--){
            System.out.println("Contador: " + i);
		}
		
		//Ciclo infinito utilizando break para salir de el
		/*for(;;){
			//Instrucciones
			if (condicion)
				break;
		}*/		
   }
}