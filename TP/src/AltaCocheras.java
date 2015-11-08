
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
public class AltaCocheras extends javax.swing.JFrame {
	private JLabel jLabelNumero;
	private JLabel jLabelTamanio;
	private JButton alta;
	private JTextField Numero;
	private JTextField Tamanio;
	
	
	private SistemaCocheras sistema;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		AltaCocheras inst = new AltaCocheras();
		inst.setVisible(true);
	}
	
	public AltaCocheras ()
	{
		
	}
	public AltaCocheras(SistemaCocheras s) {
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
				jLabelTamanio= new JLabel();
				getContentPane().add(jLabelTamanio);
				jLabelTamanio.setText("Tamanio:");
				jLabelTamanio.setBounds(21, 91, 103, 28);
			}
			{
				Numero = new JTextField();
				getContentPane().add(Numero);
				Numero.setBounds(125, 42, 210, 28);
			}
			{
				Tamanio = new JTextField();
				getContentPane().add(Tamanio);
				Tamanio.setBounds(125, 91, 210, 28);
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
						sistema.crearCochera(Integer.parseUnsignedInt(Numero.getText()), Tamanio.getText());
						Numero.setText("");
						Tamanio.setText("");
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
