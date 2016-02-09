package clases;

public class Principal {
	public static void main(String args[]){
		Telefono t = new Telefono(
				"Negro","Sony", "Xperia", 
				"Android", "1024x2134", 13213, 4654);
		
		/*t.setMarca("Sony");
		t.setModelo("Xperia Z Ultra");
		t.setColor("Negro");
		t.setCapacidadMemoriaAlmacenamientoBytes(434534);
		t.setCapacidadMemoriaBytes(434534);*/
	
		System.out.println("Marca: " + t.getMarca());
		System.out.println("Color: " + t.getColor());
		t.encender();
		t.apagar();
		
	}
}
