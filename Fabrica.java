import javax.swing.JOptionPane;

public class Fabrica {

	public static void main(String [] args) {
		
		//4 coches, cada uno con un constructor. Métodos y setters para que los valores diferentes a lo que hay por defecto, correspondan a la tabla.
		Coche car1 = new Coche();
		car1.setMatricula("1234-DF");
		car1.setModelo("Toledo");
		car1.setColor("Azul");
		car1.setKilometros(200);
		
		Coche car2 = new Coche("5678-AG");
		car2.setMarca("Fiat");
		car2.setModelo("Uno");
		car2.setTechoSolar(true);
		car2.setColor("Rojo");
		car2.setKilometros(300);
		car2.setNumPlazas(2);
		
		Coche car3 = new Coche(5,5);
		car3.setMatricula("9012-HH");
		car3.setMarca("BMW");
		car3.setModelo("850");
		car3.setColor("Gris");
		car3.setKilometros(400);
		car3.setNumPuertas(5);
		
		Coche car4 = new Coche("VW", "Caddy", "Blanco");
		car4.setMatricula("3456-XS");
		car4.setTechoSolar(true);
		car4.setKilometros(500);
		car4.setNumPuertas(5);
		car4.setNumPlazas(7);

		//Creo array y asigno cada elemento del array a una referencia
		Coche [] cars = new Coche [4];
		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;
		cars[3] = car4;
				
		/*for (int i=0; i<4; i++) {
			JOptionPane.showMessageDialog(null, caracteristicas(cars[i]));
		}*/
		
		for (Coche c:cars) {
			JOptionPane.showMessageDialog(null, caracteristicas(c));
		}		
	}
	
	public static String caracteristicas(Coche c) {
		return "Este coche tiene las siguientes características:" +
				"\nMatrícula: " + c.getMatricula() + 
				"\nMarca: " + c.getMarca() + 
				"\nModelo: " + c.getModelo() + 
				"\nColor: " + c.getColor() + 
				"\nKilómetros: " + c.getKilometros() + 
				"\nTecho solar: " + c.isTechoSolar() +
				"\nNúmero de puertas: " + c.getNumPuertas() + 
				"\nNúmero de plazas: " + c.getNumPlazas();
	}	
}
