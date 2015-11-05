package EjemploTabla;


import java.util.*;


public class Sistema 
{
	private Vector alumnos;
	
	public Sistema()
	{
		alumnos = new Vector();	
		Alumno a = new Alumno ("Juan", "Garcia", "Pellegrini 2425", "4774-1234");
		alumnos.add(a);
		a = new Alumno ("Jose", "Gomez", "Belgrano 234", "5555-4032");
		alumnos.add(a);
	}
	public Vector getAlumnos()
	{
		Vector alu = new Vector();
		for (int i= 0; i< alumnos.size();i++)
		{
			alu.add(((Alumno)alumnos.elementAt(i)).toVector());
		}
		return alu;
	}
	public void agregarAlumno()
	{
		Alumno a = new Alumno ("Fernando", "Gomez", "Charcas 345", "4774-8976");
		alumnos.add(a);
	}

}
