package vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import codigo.SistemaCocheras;

public class BajaCliente extends javax.swing.JFrame {
	private JLabel jLabelDni;
	private JLabel jLabelResultado;
	private JButton eliminar;
	private JTextField dni;
	
	private SistemaCocheras sistema;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		BajaCliente inst = new BajaCliente();
		inst.setVisible(true);
	}
	
	public BajaCliente ()
	{
		
	}
	public BajaCliente(SistemaCocheras s) {
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
				eliminar = new JButton();
				getContentPane().add(eliminar);
				eliminar.setText("Eliminar");
				eliminar.setBounds(238, 263, 73, 28);
				eliminar.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) 
					{
						boolean resultado = sistema.eliminarCliente(dni.getText());
						dni.setText("");
						if(resultado) {
							jLabelResultado.setText("cliente eliminado");
						} else {
							jLabelResultado.setText("cliente inexistente");
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
