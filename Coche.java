import javax.swing.JOptionPane;

public class Coche {

	private String matricula, marca, modelo, color;
	private boolean techoSolar;
	private double kilometros;
	private int numPuertas, numPlazas;

	public Coche() {
		this.matricula = "";
		this.marca = "Seat";
		this.modelo = "Altea";
		this.color = "Blanco";
		this.techoSolar = false;
		this.kilometros = 0;
		this.numPuertas = 3;
		this.numPlazas = 5;
	}
	
	public Coche (String matricula) {
		this.matricula = matricula;
		this.marca = "Seat";
		this.modelo = "Altea";
		this.color = "Blanco";
		this.techoSolar = false;
		this.kilometros = 0;
		this.numPuertas = 3;
		this.numPlazas = 5;
	}
	
	public Coche (int numPuertas, int numPlazas) {
		if (numPuertas<=0 || numPuertas>5) {
			JOptionPane.showMessageDialog(null, "El número de puertas debe ser positivo y como máximo 5. Se ha establecido el valor por defecto, 3 puertas.");
			this.numPuertas = 3;
		} else {
			this.numPuertas = numPuertas;
		}
		if (numPlazas<=0 || numPlazas>7) {
			JOptionPane.showMessageDialog(null, "El número de plazas debe ser positivo y como máximo 7. Se ha establecido el valor por defecto, 5 plazas.");
			this.numPlazas = 5;
		} else {
			this.numPlazas = numPlazas;
		}
		this.matricula = "";
		this.marca = "Seat";
		this.modelo = "Altea";
		this.color = "Blanco";
		this.techoSolar = false;
		this.kilometros = 0;
	}
	
	public Coche (String marca, String modelo, String color) {
		this.marca =  marca;
		this.modelo = modelo;
		this.color =  color;
		this.matricula = "";
		this.techoSolar = false;
		this.kilometros = 0;
		this.numPuertas = 3;
		this.numPlazas = 5;
	}
	
	public void avanzar(double kilometros) {
		this.kilometros = this.kilometros + kilometros;
		JOptionPane.showMessageDialog(null, "Se han añadido " + kilometros + "km al cuentakilóemtros. El kilometraje total ahora es " + this.kilometros + "km.");
	}
	
	public void tunear() {
		this.kilometros = 0;
		if (this.techoSolar) {
			JOptionPane.showMessageDialog(null, "Se ha puesto el cuentakilómetros a 0. El coche ya tenía techo solar.");
		} else {
			JOptionPane.showMessageDialog(null, "Se ha puesto el cuentakilómetros a 0 y se ha instalado un techo solar.");
			this.techoSolar = true;
		}
	}
	
	public void tunear(String color) {
		this.kilometros = 0;
		this.color = color;
		if (this.techoSolar) {
			JOptionPane.showMessageDialog(null, "Se ha puesto el cuentakilómetros a 0 y se ha pintado de color " + color + ". El coche ya tenía techo solar.");
		} else {
			JOptionPane.showMessageDialog(null, "Se ha puesto el cuentakilómetros a 0, se ha pintado de color " + color + " y se ha instalado un techo solar.");
			this.techoSolar = true;
		}
	}
	
	public void matricular(String matricula) {
		this.matricula=matricula;
		JOptionPane.showMessageDialog(null, "Se ha matriculado el coche: " + matricula);
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String isTechoSolar() {
		if (this.techoSolar) {
			return "Sí";
		} else {
			return "No";
		}
	}
	public void setTechoSolar(boolean techoSolar) {
		this.techoSolar = techoSolar;
	}
	public double getKilometros() {
		return kilometros;
	}
	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		if (numPuertas<=0 || numPuertas>5) {
			JOptionPane.showMessageDialog(null, "El número de puertas debe ser positivo y como máximo 5. Se ha establecido el valor por defecto, 3 puertas.");
			this.numPuertas = 3;
		} else {
			this.numPuertas = numPuertas;
		}
	}
	public int getNumPlazas() {
		return numPlazas;
	}
	public void setNumPlazas(int numPlazas) {
		if (numPlazas<=0 || numPlazas>7) {
			JOptionPane.showMessageDialog(null, "El número de plazas debe ser positivo y como máximo 7. Se ha establecido el valor por defecto, 5 plazas.");
			this.numPlazas = 5;
		} else {
			this.numPlazas = numPlazas;
		}
	}

}
