package EjercicioSwing;
import java.util.*;

public class Sistema 
{
	private Vector<Alumno> alumnos;
	
	public Sistema ()
	{
		alumnos = new Vector<Alumno>();
	}
	public void agregarAlumno( String n, String d, String t)
	{
		alumnos.add(new Alumno(n,d,t));
	}
	
	public void setAlumnos(Vector<Alumno>alumnos) {
		this.alumnos = alumnos;
	}
	private Alumno buscar(String n)
	{
		for (int i=0;i< alumnos.size();i++)
		{
			Alumno a = (Alumno)alumnos.elementAt(i);
			if (a.getNombre().equalsIgnoreCase(n))
				return a;
		} 
		return null;
	}
	public void modificarAlumno(String n, String d, String t)
	{
		Alumno a = buscar(n);
		a.setDomicilio(d);
		a.setTelefono(t);
	}
	
	public AlumnoView getAlumno(String n)
	{
		Alumno a = buscar(n);
		if (a!= null)
			return a.getView();
		else
			return null;
	}

}
