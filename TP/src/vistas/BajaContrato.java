package vistas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import codigo.SistemaCocheras;


public class BajaContrato extends javax.swing.JFrame {
	private JLabel JLNumContrato;
    private JButton baja;
	private JTextField JTNumContrato;
	
	
	
	private SistemaCocheras sistema;

	
	public static void main(String[] args) {
		BajaContrato inst = new BajaContrato();
		inst.setVisible(true);
	}
	
	public BajaContrato ()
	{
		
	}

	public BajaContrato(SistemaCocheras s) {
		super();
		initGUI();
		sistema = s;
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				JLNumContrato = new JLabel();
				getContentPane().add(JLNumContrato);
				JLNumContrato.setText("Numero de Contrato:");
				JLNumContrato.setBounds(21, 40, 120, 28);
			}
			
			
			// Textos: -----------------------------------------------
			
			
						{
							JTNumContrato = new JTextField();
							getContentPane().add(JTNumContrato);
							
							JTNumContrato.setBounds(150, 40, 210, 28);
						}
						
			{
				baja = new JButton();
				getContentPane().add(baja);
				baja.setText("Borrar");
				baja.setBounds(238, 100, 80, 28);
				baja.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) 
					{

						if(sistema.eliminarContrato(Integer.parseInt(JTNumContrato.getText())) == true){
						JOptionPane.showMessageDialog(null, "Usuario borrado", "Resultado de Borrado", JOptionPane.INFORMATION_MESSAGE);
						JTNumContrato.setText(""); 
						}else{
							JOptionPane.showMessageDialog(null, "Usuario no encontrado/no borrado", "Resultado de Borrado", JOptionPane.INFORMATION_MESSAGE);
						}
							
					
					}
				});
			}
			pack();
			setSize(400, 200);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
