package vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
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
public class AltaContrato extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel JLCliente;
	private JLabel JLAbono;
	private JLabel JLAuto;
	private JLabel JLTipo;
	private JLabel JLEntidad;
	private JLabel JLCbu;
	private JLabel JLNroTarjeta;
	private JLabel JLFecVenc;
	
	
	private JButton alta;
	
	private JTextField JTCliente;
	private JTextField JTAbono;
	private JTextField JTAuto;
	private JComboBox JTTipo;
	private JTextField JTEntidad;
	private JTextField JTCbu;
	private JTextField JTNroTarjeta;
	private JTextField JTFecVenc;
	
	private String[] TipoContrato = {"","CBU","Cheque","Credito","Efectivo"};
	
	private SistemaCocheras sistema;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		AltaContrato inst = new AltaContrato();
		inst.setVisible(true);
	}
	
	public AltaContrato ()
	{
		
	}

	public AltaContrato(SistemaCocheras s) {
		super();
		initGUI();
		sistema = s;
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				JLCliente = new JLabel();
				getContentPane().add(JLCliente);
				JLCliente.setText("DNI Cliente:");
				JLCliente.setBounds(21, 40, 90, 28);
			}
			{
				JLAbono = new JLabel();
				getContentPane().add(JLAbono);
				JLAbono.setText("Abono:");
				JLAbono.setBounds(21, 80, 63, 28);
			}
			{
				JLAuto = new JLabel();
				getContentPane().add(JLAuto);
				JLAuto.setText("Patente:");
				JLAuto.setBounds(21, 120, 63, 28);
			}
			{
				JLTipo = new JLabel();
				getContentPane().add(JLTipo);
				JLTipo.setText("Tipo:");
				JLTipo.setBounds(21, 160, 63, 28);
			}
			{
				JLEntidad = new JLabel();
				getContentPane().add(JLEntidad);
				JLEntidad.setText("Entidad:");
				JLEntidad.setBounds(21, 200, 63, 28);
				JLEntidad.setVisible(false);
			}
			{
				JLCbu = new JLabel();
				getContentPane().add(JLCbu);
				JLCbu.setText("CBU:");
				JLCbu.setBounds(21, 240, 63, 28);
				JLCbu.setVisible(false);
			}
			{
				JLNroTarjeta = new JLabel();
				getContentPane().add(JLNroTarjeta);
				JLNroTarjeta.setText("N° Tarjeta:");
				JLNroTarjeta.setBounds(21, 240, 63, 28);
				JLNroTarjeta.setVisible(false);
			}
			{
				JLFecVenc = new JLabel();
				getContentPane().add(JLFecVenc);
				JLFecVenc.setText("Fecha de Vencimiento:");
				JLFecVenc.setBounds(21, 280, 63, 28);
				JLFecVenc.setVisible(false);
			}


			
			// Textos: -----------------------------------------------
			
			
						{
							JTCliente = new JTextField();
							getContentPane().add(JTCliente);
							
							JTCliente.setBounds(119, 40, 210, 28);
						}
						{
							JTAbono = new JTextField();
							getContentPane().add(JTAbono);
							
							JTAbono.setBounds(119, 80, 210, 28);
						}
						{
							JTAuto = new JTextField();
							getContentPane().add(JTAuto);
							
							JTAuto.setBounds(119, 120, 210, 28);
						}
						{
							JTEntidad = new JTextField();
							getContentPane().add(JTEntidad);
							
							JTEntidad.setBounds(119, 200, 210, 28);
							JTEntidad.setVisible(false);
						}
						{
							JTCbu = new JTextField();
							getContentPane().add(JTCbu);
							
							JTCbu.setBounds(119, 240, 210, 28);
							JTCbu.setVisible(false);
						}
						{
							JTNroTarjeta = new JTextField();
							getContentPane().add(JTNroTarjeta);
							
							JTNroTarjeta.setBounds(119, 240, 210, 28);
							JTNroTarjeta.setVisible(false);
						}
						{
							JTFecVenc = new JTextField();
							getContentPane().add(JTFecVenc);
							
							JTFecVenc.setBounds(119, 280, 210, 28);
							JTFecVenc.setVisible(false);
						}
						{
							JTTipo = new JComboBox(TipoContrato);
							getContentPane().add(JTTipo);
							
							JTTipo.setBounds(119, 160, 210, 28);
							JTTipo.addActionListener(new ActionListener()
							{
								public void actionPerformed(ActionEvent evt) 
								{
									switch (JTTipo.getSelectedIndex()){
									default: 
									{
											JLEntidad.setVisible(false);
											JTEntidad.setVisible(false);
											JLCbu.setVisible(false);
											JTCbu.setVisible(false);
											JLNroTarjeta.setVisible(false);
											JTNroTarjeta.setVisible(false);
											JLFecVenc.setVisible(false);
											JTFecVenc.setVisible(false);
											break;
									}
									case 1:
									{
											JLEntidad.setVisible(true);
											JTEntidad.setVisible(true);
											JLCbu.setVisible(true);
											JTCbu.setVisible(true);
											JLNroTarjeta.setVisible(false);
											JTNroTarjeta.setVisible(false);
											JLFecVenc.setVisible(false);
											JTFecVenc.setVisible(false);
											break;
									}
									case 3:
									{
										JLEntidad.setVisible(true);
										JTEntidad.setVisible(true);
										JLNroTarjeta.setVisible(true);
										JTNroTarjeta.setVisible(true);
										JLFecVenc.setVisible(true);
										JTFecVenc.setVisible(true);
										JLCbu.setVisible(false);
										JTCbu.setVisible(false);
										break;
								}
										
								}
								}
							});
						}
			{
				alta = new JButton();
				getContentPane().add(alta);
				alta.setText("Crear");
				alta.setBounds(330, 330, 70, 28);
				alta.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) 
					{

						switch (JTTipo.getSelectedIndex()){
						case 0:
						{
							break;
						}
						case 1:
						{
							sistema.crearContratoCBU(JTCliente.getText(), null, JTAuto.getText(), JTEntidad.getText(), JTCbu.getText());
							break;
						}
						case 2:
						{
							sistema.crearContratoCheque(JTCliente.getText(), null, JTAuto.getText());
							break;
						}
						case 3:
						{
							sistema.crearContratoCredito(JTCliente.getText(), null, JTAuto.getText(), JTEntidad.getText(), JTNroTarjeta.getText(), null);
							break;
						}
						case 4:
						{
							sistema.crearContratoEfectivo(JTCliente.getText(), null, JTAuto.getText());
							break;
						}
						}
									
						JTCliente.setText(""); 
						JTAbono.setText(""); 
						JTAuto.setText("");  
						JTTipo.setSelectedIndex(0);
						JTEntidad.setText("");
						JTCbu.setText("");
						JTNroTarjeta.setText("");
						JTFecVenc.setText("");					
					}
				});
			}
			pack();
			setSize(450, 450);				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
