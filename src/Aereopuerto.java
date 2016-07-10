import java.util.ArrayList;


public class Aereopuerto {
 private String nombre ="";
 private String ciudad = "";
 private String pais = "";
 private String codigoAereopuerto = "";
 private ArrayList<Vuelo> vuelosAutorizados = new ArrayList<Vuelo>();

 public Aereopuerto(String nombre, String ciudad, String pais,
		String codigoAereopuerto) {
	super();
	this.nombre = nombre;
	this.ciudad = ciudad;
	this.pais = pais;
	this.codigoAereopuerto = codigoAereopuerto;
}
 
 //lista cancelar vuelo
 public ArrayList<Vuelo> getCancelarVuelo(int codigoVuelo )
	{
		ArrayList<Vuelo> vuelosFiltrados = new ArrayList<Vuelo>();
		for (Vuelo v: vuelosAutorizados)
		{
			if (v.getCodigoVuelo()==codigoVuelo)
			{
				vuelosFiltrados.add(v);
			}
		}
		return vuelosFiltrados;
	}

@Override
public String toString() {
	return "Aereopuerto [nombre=" + nombre + ", ciudad=" + ciudad + ", pais="
			+ pais + ", codigoAereopuerto=" + codigoAereopuerto
			+ "]";
}
 
 

}
