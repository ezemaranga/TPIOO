package vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import codigo.SistemaCocheras;


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
public class ModificarAbonos extends javax.swing.JFrame {
	private JLabel jLabelCodigo;
	private JLabel jLabelPrecio;
	private JButton modificar;
	private JTextField codigo;
	private JTextField precio;
	private JLabel jLabelResultado;

	
	private SistemaCocheras sistema;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		ModificarAbonos inst = new ModificarAbonos();
		inst.setVisible(true);
	}
	
	public ModificarAbonos ()
	{
		
	}
	public ModificarAbonos(SistemaCocheras s) {
		super();
		initGUI();
		sistema = s;
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabelCodigo = new JLabel();
				getContentPane().add(jLabelCodigo);
				jLabelCodigo.setText("Codigo:");
				jLabelCodigo.setBounds(21, 42, 103, 28);
			}
			{
				jLabelPrecio = new JLabel();
				getContentPane().add(jLabelPrecio);
				jLabelPrecio.setText("Precio:");
				jLabelPrecio.setBounds(21, 91, 103, 28);
			}
			{
				codigo = new JTextField();
				getContentPane().add(codigo);
				codigo.setBounds(125, 42, 210, 28);
			}
			{
				precio = new JTextField();
				getContentPane().add(precio);
				precio.setBounds(125, 91, 210, 28);
			}
			{
				jLabelResultado= new JLabel();
				getContentPane().add(jLabelResultado);
				jLabelResultado.setText("");
				jLabelResultado.setBounds(21, 131, 200, 28);
			}
			{
				modificar = new JButton();
				getContentPane().add(modificar);
				modificar.setText("Modificar");
				modificar.setBounds(238, 140, 93, 28);
				modificar.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) 
					{
						boolean resultado = sistema.modificarPrecioAbono(Integer.parseInt(codigo.getText()),Integer.parseInt(precio.getText()));
						codigo.setText("");
						precio.setText("");
						if(resultado) {
							jLabelResultado.setText("cochera eliminada");
						} else {
							jLabelResultado.setText("no existe la cochera");
						}
					}
				});
			}
			pack();
			setSize(400, 225);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
