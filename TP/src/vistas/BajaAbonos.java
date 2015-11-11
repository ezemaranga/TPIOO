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
public class BajaAbonos extends javax.swing.JFrame {
	private JLabel jLabelCodigo;
	private JButton baja;
	private JTextField codigo;
	private JLabel jLabelResultado;

	
	private SistemaCocheras sistema;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		BajaAbonos inst = new BajaAbonos();
		inst.setVisible(true);
	}
	
	public BajaAbonos ()
	{
		
	}
	public BajaAbonos(SistemaCocheras s) {
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
				codigo = new JTextField();
				getContentPane().add(codigo);
				codigo.setBounds(125, 42, 210, 28);
			}
			{
				jLabelResultado= new JLabel();
				getContentPane().add(jLabelResultado);
				jLabelResultado.setText("");
				jLabelResultado.setBounds(21, 92, 200, 28);
			}
			{
				baja = new JButton();
				getContentPane().add(baja);
				baja.setText("Eliminar");
				baja.setBounds(238, 92, 83, 28);
				baja.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) 
					{
						boolean resultado = sistema.eliminarAbono(Integer.parseInt(codigo.getText()));
						codigo.setText("");
						if(resultado) {
							jLabelResultado.setText("abono eliminado");
						} else {
							jLabelResultado.setText("abono inexistente");
						}
					}
				});
			}
			pack();
			setSize(400, 175);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
