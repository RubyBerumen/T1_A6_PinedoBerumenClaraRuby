import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Aspirante{
	private String Nombre;
	private byte edad;
	private String redesSociales[];
	private int folio;
	
	public Aspirante(String nombre, byte edad, String[] redesSociales, int folio) {
		Nombre = nombre;
		this.edad = edad;
		this.redesSociales = redesSociales;
		this.folio = folio;
	}

	public String getNombre() {return Nombre;}
	public void setNombre(String nombre) {Nombre = nombre;}
	public byte getEdad() {return edad;}
	public void setEdad(byte edad) {this.edad = edad;}
	public String[] getRedesSociales() {return redesSociales;}
	public void setRedesSociales(String[] redesSociales) {this.redesSociales = redesSociales;}
	public int getFolio() {return folio;}
	public void setFolio(int folio) {this.folio = folio;}

	@Override
	public String toString() {
		return "Aspirante [Nombre=" + Nombre + ", edad=" + edad + ", redesSociales=" + Arrays.toString(redesSociales)
				+ ", folio=" + folio + "]";
	}
	
}//class Aspirante


class RegistroAspirantes{
	ArrayList listaAspirantes;
	
	public RegistroAspirantes() {
		listaAspirantes = new ArrayList();
	}
	
	
	public void agregarAspirante(Aspirante a) {
		listaAspirantes.add(a);
	}
	
	
	public void eliminarAspirante(int folio) {
		for (int j = 0; j < listaAspirantes.size(); j++) {
			if (((Aspirante)listaAspirantes.get(j)).getFolio()==folio) {
				listaAspirantes.remove(j);
			}		
		}
		
		System.out.println("Se ha eliminado el aspirante");
	}
	
	
	public void mostrarAspirantes(){
		for (Object x : listaAspirantes) {
			System.out.println(x);
		}
	}
	
	
	
}//class RegistroAspirantes

public class ListaAspirantes {

	public static void main(String[] args) {
		
		RegistroAspirantes ra = new RegistroAspirantes();
		
		
		
		
		

	}

}
