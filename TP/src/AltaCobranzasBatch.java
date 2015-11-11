
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.WindowConstants;

public class AltaCobranzasBatch extends javax.swing.JFrame {
	private JLabel jLabelCobranzaCredito;
	private JButton jButtonBatchCredito;
	private JTextArea JTextAreaListCobranzasCredito;
	private JLabel jLabelCobranzaCbu;
	private JButton jButtonBatchCbu;
	private JTextArea JTextAreaListCobranzasCbu;
	
	private SistemaCocheras sistema;

	public static void main(String[] args) {
		AltaCobranzasBatch inst = new AltaCobranzasBatch();
		inst.setVisible(true);
	}
	
	public AltaCobranzasBatch ()
	{
		
	}
	public AltaCobranzasBatch(SistemaCocheras s) {
		super();
		initGUI();
		sistema = s;
	}
	
	private String lista = null;
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabelCobranzaCredito = new JLabel();
				getContentPane().add(jLabelCobranzaCredito);
				jLabelCobranzaCredito.setText("GENERAR COBRANZAS - T. DE CREDITO:");
				jLabelCobranzaCredito.setBounds(20, 20, 300, 30);
			}
			{
				jButtonBatchCredito = new JButton();
				getContentPane().add(jButtonBatchCredito);
				jButtonBatchCredito.setText("Ejecutar Batch");
				jButtonBatchCredito.setBounds(20, 60, 150, 30);
				jButtonBatchCredito.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) 
					{
						List<Cobranza> cobranzas = sistema.cobrarCreditoBatch();
						Calendar cal = Calendar.getInstance();
						cal.add(Calendar.DATE, +10);
						if (cobranzas.isEmpty())
							lista = "No hay cobranzas a crear para la fecha: \r\n" + cal.getTime();
						else{
							for (Cobranza c : cobranzas){
								lista = lista + 
										"\r\n--> Contrato: " + c.getContrato().getNumeroContrato() +
										"; Cliente: " + c.getContrato().getCliente().getNombre() +
										"; Fecha de Pago: " + c.getFechaPago() +
										"; Monto: " + c.getMonto();
							}
						}
						JTextAreaListCobranzasCredito.setText(lista);
					}
				});
			}
			{
				JTextAreaListCobranzasCredito = new JTextArea();
				getContentPane().add(JTextAreaListCobranzasCredito);
				JTextAreaListCobranzasCredito.setText("-->");
				JTextAreaListCobranzasCredito.setBounds(20, 100, 250, 200);
			}
			{
				jLabelCobranzaCbu = new JLabel();
				getContentPane().add(jLabelCobranzaCbu);
				jLabelCobranzaCbu.setText("GENERAR COBRANZAS - CBU:");
				jLabelCobranzaCbu.setBounds(320, 20, 300, 30);
			}
			{
				jButtonBatchCbu = new JButton();
				getContentPane().add(jButtonBatchCbu);
				jButtonBatchCbu.setText("Ejecutar Batch");
				jButtonBatchCbu.setBounds(320, 60, 150, 30);
				jButtonBatchCbu.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) 
					{
						List<Cobranza> cobranzas = sistema.cobrarCbuBatch();
						Calendar cal = Calendar.getInstance();
						cal.add(Calendar.DATE, +10);
						if (cobranzas.isEmpty())
							lista = "No hay cobranzas a crear para la fecha: \r\n" + cal.getTime();
						else{
							for (Cobranza c : cobranzas){
								lista = lista + 
										"\r\n--> Contrato: " + c.getContrato().getNumeroContrato() +
										"; Cliente: " + c.getContrato().getCliente().getNombre() +
										"; Fecha de Pago: " + c.getFechaPago() +
										"; Monto: " + c.getMonto();
							}
						}
						JTextAreaListCobranzasCbu.setText(lista);
					}
				});
			}
			{
				JTextAreaListCobranzasCbu = new JTextArea();
				getContentPane().add(JTextAreaListCobranzasCbu);
				JTextAreaListCobranzasCbu.setText("-->");
				JTextAreaListCobranzasCbu.setBounds(320, 100, 250, 200);
			}	
			pack();
			setSize(650, 350);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
