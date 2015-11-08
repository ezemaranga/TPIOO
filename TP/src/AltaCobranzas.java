
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;

public class AltaCobranzas extends javax.swing.JFrame {
	private JLabel jLabelCobranzaEfectivo;
	private JLabel jLabelNumContEfec;
	private JTextField jTextNumContEfec;
	private JLabel jLabelMontoEfec;
	private JTextField jTextMontoEfec;
	private JButton jButtonAltaEfec;
	private JLabel jLabelCobranzaCheque;
	private JLabel jLabelNumContCheq;
	private JTextField jTextNumContCheq;
	private JLabel jLabelMontoCheq;
	private JTextField jTextMontoCheq;
	private JLabel jLabelEntidadCheq;
	private JTextField jTextEntidadCheq;
	private JLabel jLabelNumCheq;
	private JTextField jTextNumCheq;
	private JButton jButtonAltaCheq;
	
	private SistemaCocheras sistema;

	public static void main(String[] args) {
		AltaCobranzas inst = new AltaCobranzas();
		inst.setVisible(true);
	}
	
	public AltaCobranzas ()
	{
		
	}
	public AltaCobranzas(SistemaCocheras s) {
		super();
		initGUI();
		sistema = s;
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabelCobranzaEfectivo = new JLabel();
				getContentPane().add(jLabelCobranzaEfectivo);
				jLabelCobranzaEfectivo.setText("NUEVA COBRANZA EN EFECTIVO");
				jLabelCobranzaEfectivo.setBounds(20, 40, 200, 30);
			}
			{
				jLabelNumContEfec = new JLabel();
				getContentPane().add(jLabelNumContEfec);
				jLabelNumContEfec.setText("# Contrato:");
				jLabelNumContEfec.setBounds(20, 80, 70, 30);
			}
			{
				jTextNumContEfec = new JTextField();
				getContentPane().add(jTextNumContEfec);
				jTextNumContEfec.setBounds(90, 80, 70, 30);
			}
			{
				jLabelMontoEfec = new JLabel();
				getContentPane().add(jLabelMontoEfec);
				jLabelMontoEfec.setText("Monto:");
				jLabelMontoEfec.setBounds(170, 80, 50, 30);
			}
			{
				jTextMontoEfec = new JTextField();
				getContentPane().add(jTextMontoEfec);
				jTextMontoEfec.setBounds(215, 80, 70, 30);
			}
			{
				jButtonAltaEfec = new JButton();
				getContentPane().add(jButtonAltaEfec);
				jButtonAltaEfec.setText("Cobrar Efectivo");
				jButtonAltaEfec.setBounds(20, 120, 150, 30);
				jButtonAltaEfec.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) 
					{
						sistema.cobrarEfectivo(Integer.parseInt(jTextNumContEfec.getText()),Double.parseDouble(jTextMontoEfec.getText()));
						jTextNumContEfec.setText("");
						jTextMontoEfec.setText("");
					}
				});
			}
			{
				jLabelCobranzaCheque = new JLabel();
				getContentPane().add(jLabelCobranzaCheque);
				jLabelCobranzaCheque.setText("NUEVA COBRANZA EN CHEQUE");
				jLabelCobranzaCheque.setBounds(20, 180, 200, 30);
			}
			{
				jLabelNumContCheq = new JLabel();
				getContentPane().add(jLabelNumContCheq);
				jLabelNumContCheq.setText("# Contrato:");
				jLabelNumContCheq.setBounds(20, 220, 70, 30);
			}
			{
				jTextNumContCheq = new JTextField();
				getContentPane().add(jTextNumContCheq);
				jTextNumContCheq.setBounds(90, 220, 70, 30);
			}
			{
				jLabelMontoCheq = new JLabel();
				getContentPane().add(jLabelMontoCheq);
				jLabelMontoCheq.setText("Monto:");
				jLabelMontoCheq.setBounds(170, 220, 50, 30);
			}
			{
				jTextMontoCheq = new JTextField();
				getContentPane().add(jTextMontoCheq);
				jTextMontoCheq.setBounds(215, 220, 70, 30);
			}
			{
				jLabelEntidadCheq = new JLabel();
				getContentPane().add(jLabelEntidadCheq);
				jLabelEntidadCheq.setText("Ent. Emisora:");
				jLabelEntidadCheq.setBounds(300, 220, 80, 30);
			}
			{
				jTextEntidadCheq = new JTextField();
				getContentPane().add(jTextEntidadCheq);
				jTextEntidadCheq.setBounds(380, 220, 70, 30);
			}
			{
				jLabelNumCheq = new JLabel();
				getContentPane().add(jLabelNumCheq);
				jLabelNumCheq.setText("# Cheque:");
				jLabelNumCheq.setBounds(455, 220, 70, 30);
			}
			{
				jTextNumCheq = new JTextField();
				getContentPane().add(jTextNumCheq);
				jTextNumCheq.setBounds(520, 220, 70, 30);
			}
			{
				jButtonAltaCheq = new JButton();
				getContentPane().add(jButtonAltaCheq);
				jButtonAltaCheq.setText("Cobrar Cheque");
				jButtonAltaCheq.setBounds(20, 260, 150, 30);
				jButtonAltaCheq.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) 
					{
						sistema.cobrarCheque(Integer.parseInt(jTextNumContEfec.getText()),Double.parseDouble(jTextMontoEfec.getText()), jTextEntidadCheq.getText(),jTextNumCheq.getText());
						jTextNumContCheq.setText("");
						jTextMontoCheq.setText("");
						jTextEntidadCheq.setText("");
						jTextNumCheq.setText("");
					}
				});
			}
			pack();
			setSize(650, 350);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
