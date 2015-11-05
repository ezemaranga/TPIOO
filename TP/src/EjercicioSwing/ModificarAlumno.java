package EjercicioSwing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;



/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class ModificarAlumno extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel4;
	private JButton buscar;
	private JTextField nombreAlumno;
	private JButton alta;
	private JTextField telefono;
	private JTextField domicilio;
	private JTextField nombre;
	private JLabel jLabel3;
	
	private Sistema sistema;
	private AlumnoView alumno;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		ModificarAlumno inst = new ModificarAlumno();
		inst.setVisible(true);
	}
	
	public ModificarAlumno ()
	{
		
	}
	public ModificarAlumno(Sistema s) {
		super();
		sistema = s;
		initGUI();
		
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Nombre:");
				jLabel1.setBounds(21, 42, 63, 28);
				jLabel1.setVisible(false);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Domicilio:");
				jLabel2.setBounds(21, 91, 63, 28);
				jLabel2.setVisible(false);
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("Telefono:");
				jLabel3.setBounds(21, 147, 63, 28);
				jLabel3.setVisible(false);
			}
			{
				nombre = new JTextField();
				getContentPane().add(nombre);
				nombre.setBounds(119, 42, 210, 28);
				nombre.setVisible(false);
			}
			{
				domicilio = new JTextField();
				getContentPane().add(domicilio);
				domicilio.setBounds(119, 91, 210, 28);
				domicilio.setVisible(false);
			}
			{
				telefono = new JTextField();
				getContentPane().add(telefono);
				telefono.setBounds(119, 147, 210, 28);
				telefono.setVisible(false);
			}
			{
				alta = new JButton();
				getContentPane().add(alta);
				alta.setText("Ok");
				alta.setBounds(273, 217, 63, 28);
				alta.setVisible(false);
				alta.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) 
					{
						sistema.modificarAlumno(nombre.getText(), domicilio.getText(), telefono.getText());
					}
				});
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("Ingrese Nombre:");
				jLabel4.setBounds(21, 7, 98, 28);
			}
			{
				nombreAlumno = new JTextField();
				getContentPane().add(nombreAlumno);
				nombreAlumno.setBounds(140, 7, 147, 28);
			}
			{
				buscar = new JButton();
				getContentPane().add(buscar);
				buscar.setText("buscar");
				buscar.setBounds(301, 7, 77, 28);
				buscar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						alumno = sistema.getAlumno (nombreAlumno.getText());
						if (alumno != null)
						{
							jLabel1.setVisible(true);
							jLabel2.setVisible(true);
							jLabel4.setVisible(true);
							nombre.setVisible(true);
							nombre.setEnabled(false);
							domicilio.setVisible(true);
							telefono.setVisible(true);
							alta.setVisible(true);
							nombre.setText(alumno.getNombre());
							domicilio.setText(alumno.getDomicilio());
							telefono.setText(alumno.getTelefono());
						}
					}
				});
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
