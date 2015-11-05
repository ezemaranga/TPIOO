
package EjemploTabla;
import java.util.*;


/**
 * @author psarasa
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Alumno 
{
	private String nombre;
	private String apellido;
	private String domicilio;
	private String telefono;

	public Alumno (String n, String a, String d, String t)
	{
		nombre = n;
		apellido = a;
		domicilio = d;
		telefono = t;
	}
	public Vector toVector()
	{
		Vector v = new Vector();
		v.add(nombre);
		v.add(apellido);
		v.add(domicilio);
		v.add(telefono);
		return v;
	}
}
