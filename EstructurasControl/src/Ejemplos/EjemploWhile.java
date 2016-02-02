package Ejemplos;

public class EjemploWhile {
    public static void main(String[] args){
        int contador = 1;
        while (contador < 11) {
            System.out.println("Contador: " + contador);
            contador++;
        }
        
        contador = 10;
        while (contador >= 1){
        	System.out.println("Contador: " + contador);
            contador--;
        }
        
        /* Ejemplo basico de ciclo de juego
         
        boolean perdio = false;//Centinela
        while(!perdio){
        	//Intrucciones
        	if(/*choco con un obstaculo* /)
        		perdio = true;
        }*/
    }
}
