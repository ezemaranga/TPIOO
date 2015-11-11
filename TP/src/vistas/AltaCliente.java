package vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import codigo.SistemaCocheras;

public class AltaCliente extends javax.swing.JFrame {
	private JLabel jLabelDni;
	private JLabel jLabelNombre;
	private JLabel jLabelMail;
	private JLabel jLabelTelefono;
	private JLabel jLabelDomicilio;
	private JLabel jLabelResultado;
	private JButton alta;
	private JTextField dni;
	private JTextField nombre;
	private JTextField mail;
	private JTextField telefono;
	private JTextField domicilio;
	
	
	private SistemaCocheras sistema;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		AltaCliente inst = new AltaCliente();
		inst.setVisible(true);
	}
	
	public AltaCliente ()
	{
		
	}
	public AltaCliente(SistemaCocheras s) {
		super();
		initGUI();
		sistema = s;
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabelDni = new JLabel();
				getContentPane().add(jLabelDni);
				jLabelDni.setText("DNI:");
				jLabelDni.setBounds(21, 40, 103, 28);
			}
			{
				jLabelNombre= new JLabel();
				getContentPane().add(jLabelNombre);
				jLabelNombre.setText("Nombre:");
				jLabelNombre.setBounds(21, 70, 103, 28);
			}
			{
				jLabelMail= new JLabel();
				getContentPane().add(jLabelMail);
				jLabelMail.setText("Mail:");
				jLabelMail.setBounds(21, 100, 103, 28);
			}
			{
				jLabelTelefono= new JLabel();
				getContentPane().add(jLabelTelefono);
				jLabelTelefono.setText("Telefono:");
				jLabelTelefono.setBounds(21, 130, 103, 28);
			}
			{
				jLabelDomicilio= new JLabel();
				getContentPane().add(jLabelDomicilio);
				jLabelDomicilio.setText("Domicilio:");
				jLabelDomicilio.setBounds(21, 160, 103, 28);
			}
			{
				jLabelResultado= new JLabel();
				getContentPane().add(jLabelResultado);
				jLabelResultado.setText("");
				jLabelResultado.setBounds(21, 190, 200, 28);
			}
			{
				dni = new JTextField();
				getContentPane().add(dni);
				dni.setBounds(125, 40, 210, 28);
			}
			{
				nombre = new JTextField();
				getContentPane().add(nombre);
				nombre.setBounds(125, 70, 210, 28);
			}
			{
				mail = new JTextField();
				getContentPane().add(mail);
				mail.setBounds(125, 100, 210, 28);
			}
			{
				telefono = new JTextField();
				getContentPane().add(telefono);
				telefono.setBounds(125, 130, 210, 28);
			}
			{
				domicilio = new JTextField();
				getContentPane().add(domicilio);
				domicilio.setBounds(125, 160, 210, 28);
			}
			{
				alta = new JButton();
				getContentPane().add(alta);
				alta.setText("Crear");
				alta.setBounds(238, 263, 73, 28);
				alta.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) 
					{
						boolean resultado = sistema.crearCliente(dni.getText(), nombre.getText(), mail.getText(), telefono.getText(), domicilio.getText());
						dni.setText("");
						nombre.setText("");
						mail.setText("");
						telefono.setText("");
						domicilio.setText("");
						if(resultado) {
							jLabelResultado.setText("cliente creado");
						} else {
							jLabelResultado.setText("dni ya existente");
						}
						
					}
				});
			}
			pack();
			setSize(400, 350);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
