import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

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
	int numFolio = 1;
	
	
	
	public RegistroAspirantes() {
		listaAspirantes = new ArrayList();
	}
	
	
	public void agregarAspirante(Aspirante a) {
		numFolio = numFolio+1;
		listaAspirantes.add(a);
	}
	
	
	public void eliminarAspirante(int folio) {
		numFolio = numFolio-1;
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
		
		Scanner ent = new Scanner(System.in);
		RegistroAspirantes ra = new RegistroAspirantes();

		boolean salir = false;
		
		do {
			System.out.println("1) Agregar aspirante");
			System.out.println("2) Eliminar aspirante");
			System.out.println("3) Mostrar aspirantes");
			System.out.println("4) Salir");
			
			try {
				System.out.println("Elige una opción:");
                int op = ent.nextInt();
                
                switch (op) {
                	case 1 :
                		System.out.println("Ingresa el nombre: ");
                		String nombre = ent.nextLine();
                		System.out.println("Ingresa la edad: ");
                		byte edad = ent.nextByte();
                		String redes[]= new String[3];
                		System.out.println("Ingresa el Facebook: ");
                		redes[0] = ent.nextLine();
                		System.out.println("Ingresa el Twitter: ");
                		redes[1] = ent.nextLine();
                		System.out.println("Ingresa el Instagram: ");
                		redes[2] = ent.nextLine();
                		
                		if (ra.listaAspirantes.isEmpty()) {
                			ra.agregarAspirante(new Aspirante(nombre,(byte)edad,redes,01));
                		}else {
                			ra.agregarAspirante(new Aspirante(nombre,(byte)edad,redes,ra.numFolio));
                		}
                		break;
                		
                	case 2 : 
                		System.out.println("Ingresa el folio: ");
                		int folio = ent.nextInt();
                		ra.eliminarAspirante(folio);
                		break;
                		
                	case 3 :
                		ra.mostrarAspirantes();
                		break;
                		
                	case 4 : 
                		salir = true;
                        break;
                     
                	default:
                        System.out.println("Debes ingresar números entre 1 y 4");
                }
                
			} catch (InputMismatchException e) {
				System.out.println("Debes ingresar un número");
                ent.next();
			}
			
			
		} while (!salir);
		
		
		
		

	}

}
