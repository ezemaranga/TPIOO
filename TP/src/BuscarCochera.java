
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
public class BuscarCochera extends javax.swing.JFrame {
	private JLabel jLabelTamanio;
	private JButton Buscar;
	private JTextField Tamanio;
	
	
	private SistemaCocheras sistema;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		BuscarCochera inst = new BuscarCochera();
		inst.setVisible(true);
	}
	
	public BuscarCochera ()
	{
		
	}
	public BuscarCochera(SistemaCocheras s) {
		super();
		initGUI();
		sistema = s;
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabelTamanio = new JLabel();
				getContentPane().add(jLabelTamanio);
				jLabelTamanio.setText("Tamanio:");
				jLabelTamanio.setBounds(21, 42, 103, 28);
			}
			{
				Tamanio = new JTextField();
				getContentPane().add(Tamanio);
				Tamanio.setBounds(125, 42, 210, 28);
			}
			{
				Buscar = new JButton();
				getContentPane().add(Buscar);
				Buscar.setText("Buscar");
				Buscar.setBounds(238, 263, 73, 28);
				Buscar.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) 
					{
						sistema.buscarCocheraDisponible(Tamanio.getText());
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
