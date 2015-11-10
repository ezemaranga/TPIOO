
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
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
public class ModificarCocheras extends javax.swing.JFrame {
	private JLabel jLabelNumero;
	private JLabel jLabelEstado;
	private JButton modificar;
	private JTextField Numero;
	private JTextField Estado;
	private JLabel jLabelResultado;
	
	
	private SistemaCocheras sistema;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		ModificarCocheras inst = new ModificarCocheras();
		inst.setVisible(true);
	}
	
	public ModificarCocheras ()
	{
		
	}
	public ModificarCocheras(SistemaCocheras s) {
		super();
		initGUI();
		sistema = s;
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabelNumero = new JLabel();
				getContentPane().add(jLabelNumero);
				jLabelNumero.setText("Numero:");
				jLabelNumero.setBounds(21, 42, 103, 28);
			}
			{
				jLabelEstado= new JLabel();
				getContentPane().add(jLabelEstado);
				jLabelEstado.setText("Estado:");
				jLabelEstado.setBounds(21, 91, 103, 28);
			}
			{
				Numero = new JTextField();
				getContentPane().add(Numero);
				Numero.setBounds(125, 42, 210, 28);
			}
			{
				Estado = new JTextField();
				getContentPane().add(Estado);
				Estado.setBounds(125, 91, 210, 28);
			}
			{
				jLabelResultado= new JLabel();
				getContentPane().add(jLabelResultado);
				jLabelResultado.setText("");
				jLabelResultado.setBounds(21, 151, 200, 28);
			}
			{
				modificar = new JButton();
				getContentPane().add(modificar);
				modificar.setText("Modificar estado");
				modificar.setBounds(238, 263, 150, 28);
				modificar.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) 
					{
						boolean resultado = sistema.cambiarEstadoCochera(Integer.parseInt(Numero.getText()), Boolean.parseBoolean(Estado.getText()));
						Numero.setText("");
						Estado.setText("");
						if(resultado) {
							jLabelResultado.setText("cochera modificada");
						} else {
							jLabelResultado.setText("cochera inexistente");
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
