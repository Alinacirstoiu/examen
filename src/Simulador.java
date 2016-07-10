import java.util.ArrayList;


public class Simulador {
	public static void main (String [] args)
	{
		Pasajero p = new Pasajero("AC15", 15, "Alina", "Ecuatoriana", 23, ClaseCabina.ECONOMICA);
		p.cambiarClase(ClaseCabina.ALTA);
		Pasajero p1 = new Pasajero("AC16", 16, "NELA", "Ecuatoriana", 22, ClaseCabina.ALTA);
		Pasajero p2 = new Pasajero("AC17", 17, "KEVIN", "Ecuatoriana", 26, ClaseCabina.MEDIA);
		Vuelo v = new Vuelo( 6,"GUAYAQUIL", "QUITO", 15555, "IVAN", "04JULIO2016", 15,1800,17);
		Vuelo v2 = new Vuelo( 7,"GUAYAQUIL", "QUITO", 15775, "IVAN", "08JULIO2016", 155,18080,177);
		Aereopuerto a = new Aereopuerto("GUAYQUIL", "GUAYAQUIL", "ECUADOR", "GYE");
		
		/*String pasajeroEliminarPorPasaporte = "AC16"; //buscar PASAJERO POR PASAPOPRTE Y ELIMINAR
		ArrayList<Pasajero> filtrados = (pasajeroEliminarPorPasaporte);
		if(!filtrados.isEmpty())
		{
			System.out.println("Elimnado  " + pasajeroEliminarPorPasaporte);
		}else{
			System.out.println("No tiene vuelos esta persona" + pasajeroEliminarPorPasaporte);
		}	*/
		
	}
}
