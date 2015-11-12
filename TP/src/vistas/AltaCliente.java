package vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import codigo.Auto;
import codigo.Cliente;
import codigo.SistemaCocheras;

public class AltaCliente extends javax.swing.JFrame {
	private JLabel jLabelDni;
	private JLabel jLabelNombre;
	private JLabel jLabelMail;
	private JLabel jLabelTelefono;
	private JLabel jLabelDomicilio;
	private JLabel jLabelAuto;
	private JLabel jLabelPatente;
	private JLabel jLabelMarca;
	private JLabel jLabelModelo;
	private JLabel jLabelTamanio;
	private JLabel jLabelResultado;
	private JButton alta;
	private JTextField dni;
	private JTextField nombre;
	private JTextField mail;
	private JTextField telefono;
	private JTextField domicilio;
	private JTextField patente;
	private JTextField marca;
	private JTextField modelo;
	private JTextField tamanio;

	
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
				jLabelAuto = new JLabel();
				getContentPane().add(jLabelAuto);
				jLabelAuto.setText("Auto");
				jLabelAuto.setBounds(100, 200, 103, 28);
			}
			{
				jLabelPatente= new JLabel();
				getContentPane().add(jLabelPatente);
				jLabelPatente.setText("Patente:");
				jLabelPatente.setBounds(21, 260, 103, 28);
			}
			{
				jLabelMarca= new JLabel();
				getContentPane().add(jLabelMarca);
				jLabelMarca.setText("Marca:");
				jLabelMarca.setBounds(21, 290, 103, 28);
			}
			{
				jLabelModelo= new JLabel();
				getContentPane().add(jLabelModelo);
				jLabelModelo.setText("Modelo:");
				jLabelModelo.setBounds(21, 320, 103, 28);
			}
			{
				jLabelTamanio= new JLabel();
				getContentPane().add(jLabelTamanio);
				jLabelTamanio.setText("Tamaño:");
				jLabelTamanio.setBounds(21, 350, 103, 28);
			}
			{
				jLabelResultado= new JLabel();
				getContentPane().add(jLabelResultado);
				jLabelResultado.setText("");
				jLabelResultado.setBounds(21, 400, 200, 28);
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
				patente = new JTextField();
				getContentPane().add(patente);
				patente.setBounds(125, 260, 210, 28);
			}
			{
				marca = new JTextField();
				getContentPane().add(marca);
				marca.setBounds(125, 290, 210, 28);
			}
			{
				modelo = new JTextField();
				getContentPane().add(modelo);
				modelo.setBounds(125, 320, 210, 28);
			}
			{
				tamanio = new JTextField();
				getContentPane().add(tamanio);
				tamanio.setBounds(125, 350, 210, 28);
			}
			{
				alta = new JButton();
				getContentPane().add(alta);
				alta.setText("Crear");
				alta.setBounds(238, 400, 73, 28);
				alta.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) 
					{
						boolean resultado = sistema.crearCliente(dni.getText(), nombre.getText(), mail.getText(), telefono.getText(), domicilio.getText());

						
						Cliente cliente = sistema.buscarCliente(dni.getText());
						Auto auto = new Auto(patente.getText(), marca.getText(), modelo.getText(), tamanio.getText());
						cliente.agregarAuto(auto);
						
						if(resultado) {
							jLabelResultado.setText("cliente creado");
						} else {
							jLabelResultado.setText("dni ya existente");
						}
						
						dni.setText("");
						nombre.setText("");
						mail.setText("");
						telefono.setText("");
						domicilio.setText("");
						
					}
				});
			}
			pack();
			setSize(500, 500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
