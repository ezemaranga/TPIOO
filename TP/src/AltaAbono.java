
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
public class AltaAbono extends javax.swing.JFrame {
	private JLabel jLabelCodigo;
	private JLabel jLabelDescripcion;
	private JLabel jLabelPrecio;
	private JLabel jLabelTamanioCochera;
	private JButton alta;
	private JTextField codigo;
	private JTextField descripcion;
	private JTextField precio;
	private JTextField tamanio;
	private JLabel jLabelResultado;
	
	private SistemaCocheras sistema;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		AltaAbono inst = new AltaAbono();
		inst.setVisible(true);
	}
	
	public AltaAbono ()
	{
		
	}
	public AltaAbono(SistemaCocheras s) {
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
				jLabelDescripcion = new JLabel();
				getContentPane().add(jLabelDescripcion);
				jLabelDescripcion.setText("Descripcion:");
				jLabelDescripcion.setBounds(21, 91, 103, 28);
			}
			{
				jLabelResultado= new JLabel();
				getContentPane().add(jLabelResultado);
				jLabelResultado.setText("");
				jLabelResultado.setBounds(21, 250, 200, 28);
			}
			{
				jLabelPrecio = new JLabel();
				getContentPane().add(jLabelPrecio);
				jLabelPrecio.setText("Precio:");
				jLabelPrecio.setBounds(21, 147, 103, 28);
			}
			{
				jLabelTamanioCochera = new JLabel();
				getContentPane().add(jLabelTamanioCochera);
				jLabelTamanioCochera.setText("Tamaño Cochera:");
				jLabelTamanioCochera.setBounds(21, 203, 103, 28);
			}
			{
				codigo = new JTextField();
				getContentPane().add(codigo);
				codigo.setBounds(125, 42, 210, 28);
			}
			{
				descripcion = new JTextField();
				getContentPane().add(descripcion);
				descripcion.setBounds(125, 91, 210, 28);
			}
			{
				precio = new JTextField();
				getContentPane().add(precio);
				precio.setBounds(125, 147, 210, 28);
			}
			{
				tamanio = new JTextField();
				getContentPane().add(tamanio);
				tamanio.setBounds(125, 203, 210, 28);
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
						boolean resultado = sistema.crearAbono(descripcion.getText(), Double.parseDouble(precio.getText()), tamanio.getText(), Integer.parseInt(codigo.getText()));
						codigo.setText("");
						precio.setText("");
						tamanio.setText("");
						descripcion.setText("");
						if(resultado) {
							jLabelResultado.setText("abono creado");
						} else {
							jLabelResultado.setText("codigo de abono existente");
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
