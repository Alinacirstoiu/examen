import java.util.ArrayList;

//ALINACIRSTOIU_KEVIN TOMALA
public class Pasajero {
 private String pasaporte ="";
 private int numeroViajeroFrecuente;
 private String nombre ="";
 private String nacionalidad ="";
 private int edad;
 private boolean checkedIn = false;
 private ClaseCabina clase;
 
 



public Pasajero(String pasaporte, int numeroViajeroFrecuente, String nombre,
		String nacionalidad, int edad, ClaseCabina clase) {
	super();
	this.pasaporte = pasaporte;
	this.numeroViajeroFrecuente = numeroViajeroFrecuente;
	this.nombre = nombre;
	this.nacionalidad = nacionalidad;
	this.edad = edad;
	this.clase = clase;
}


//cambiaClase
public void cambiarClase (ClaseCabina nuevoClase)
	{
	  this.clase = nuevoClase;
	}
 
 
 
 

 public  boolean checkedIn (boolean checkedIn){
	 return true;
 }

public String getPasaporte() {
	return pasaporte;
}


public void setPasaporte(String pasaporte) {
	this.pasaporte = pasaporte;
}


public int getNumeroViajeroFrecuente() {
	return numeroViajeroFrecuente;
}


public void setNumeroViajeroFrecuente(int numeroViajeroFrecuente) {
	this.numeroViajeroFrecuente = numeroViajeroFrecuente;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getNacionalidad() {
	return nacionalidad;
}


public void setNacionalidad(String nacionalidad) {
	this.nacionalidad = nacionalidad;
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}


public boolean isCheckedIn() {
	return checkedIn;
}


public void setCheckedIn(boolean checkedIn) {
	this.checkedIn = checkedIn;
}


@Override
public String toString() {
	return "Pasajero [pasaporte=" + pasaporte + ", numeroViajeroFrecuente="
			+ numeroViajeroFrecuente + ", nombre=" + nombre + ", nacionalidad="
			+ nacionalidad + ", edad=" + edad + ", checkedIn=" + checkedIn
			+ ", clase=" + clase + "]";
}
 
 
 
 
}
