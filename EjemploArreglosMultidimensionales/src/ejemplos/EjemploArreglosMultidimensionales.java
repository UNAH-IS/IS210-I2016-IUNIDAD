package ejemplos;

public class EjemploArreglosMultidimensionales {
	
	
	public static void main(String[] args) {
		int matriz[][] = new int[3][4];
		
		/*matriz[0][0] = 1;
		matriz[0][1] = 5;
		matriz[0][2] = 7;
		matriz[0][3] = 6;
		
		System.out.println(matriz[0][0]);
		System.out.println(matriz[0][1]);
		System.out.println(matriz[0][2]);
		System.out.println(matriz[0][3]);*/
		
		System.out.println("Filas: " + matriz.length);
		System.out.println("Columnas: " + matriz[0].length);
		
		
		//Guardar valores
		for (int i = 0;i<matriz.length;i++){
			for (int j = 0;j<matriz[i].length;j++){
				matriz[i][j] = (i+1) * (j+1);
			}
		}

		//Imprimir valores
		for (int i = 0;i<matriz.length;i++){
			for (int j = 0;j<matriz[i].length;j++){
				System.out.println(
					"Elemento ["+i+"]["+j+"]: "+matriz[i][j]
				);
			}
		}

	}

}
