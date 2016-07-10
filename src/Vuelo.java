import java.util.ArrayList;


public class Vuelo {
 private int codigoVuelo;
 private String aereopuertoOrigen = "";
 private String aereopuertoDestino =" ";
 private double kms;
 private String piloto ="";
 private String fecha ="";
 private double duracion;
 private double horaPartida;
 private double horaArribo;
 //private int numeroPasajeros;
 private ArrayList<Pasajero> pasajerosRegistrados = new ArrayList<Pasajero>();
 
 
 
 
 public Vuelo(int codigoVuelo, String aereopuertoOrigen,
		String aereopuertoDestino, double kms, String piloto, String fecha,
		double duracion, double horaPartida, double horaArribo) {
	super();
	this.codigoVuelo = codigoVuelo;
	this.aereopuertoOrigen = aereopuertoOrigen;
	this.aereopuertoDestino = aereopuertoDestino;
	this.kms = kms;
	this.piloto = piloto;
	this.fecha = fecha;
	this.duracion = duracion;
	this.horaPartida = horaPartida;
	this.horaArribo = horaArribo;

}






//eliminar pasajero con el numero de pasaporte
 public ArrayList<Pasajero> getPasajeroPorPasaporte(String pasaporte)
	{
		ArrayList<Pasajero> pasajerosFiltrados = new ArrayList<Pasajero>();
		for (Pasajero p: pasajerosRegistrados)
		{
			if (p.getPasaporte()==pasaporte)
			{
				pasajerosFiltrados.remove(p);
			}
		}
		return pasajerosFiltrados;
	}
 



 
public int getCodigoVuelo() {
	return codigoVuelo;
}
//imprimir lista pasajeros
@Override
public String toString() {
	return "Vuelo [codigoVuelo=" + codigoVuelo + ", aereopuertoOrigen="
			+ aereopuertoOrigen + ", aereopuertoDestino=" + aereopuertoDestino
			+ ", kms=" + kms + ", piloto=" + piloto + ", fecha=" + fecha
			+ ", duracion=" + duracion + ", horaPartida=" + horaPartida
			+ ", horaArribo=" + horaArribo + ", pasajerosRegistrados="
			+ pasajerosRegistrados + "]";
}






public void setCodigoVuelo(int codigoVuelo) {
	this.codigoVuelo = codigoVuelo;
}
public String getAereopuertoOrigen() {
	return aereopuertoOrigen;
}
public void setAereopuertoOrigen(String aereopuertoOrigen) {
	this.aereopuertoOrigen = aereopuertoOrigen;
}
public String getAereopuertoDestino() {
	return aereopuertoDestino;
}
public void setAereopuertoDestino(String aereopuertoDestino) {
	this.aereopuertoDestino = aereopuertoDestino;
}
public double getKms() {
	return kms;
}
public void setKms(double kms) {
	this.kms = kms;
}
public String getPiloto() {
	return piloto;
}
public void setPiloto(String piloto) {
	this.piloto = piloto;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public double getDuracion() {
	return duracion;
}
public void setDuracion(double duracion) {
	this.duracion = duracion;
}
public double getHoraPartida() {
	return horaPartida;
}
public void setHoraPartida(double horaPartida) {
	this.horaPartida = horaPartida;
}
public double getHoraArribo() {
	return horaArribo;
}
public void setHoraArribo(double horaArribo) {
	this.horaArribo = horaArribo;
}







public void setPasajerosRegistrados(ArrayList<Pasajero> pasajerosRegistrados) {
	this.pasajerosRegistrados = pasajerosRegistrados;
}
 
 
 
 
 
}

