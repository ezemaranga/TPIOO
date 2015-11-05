package EjemploTabla;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JTable;

import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


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
public class NewJFrame extends javax.swing.JFrame {
	private JTable jTable1;
	private Sistema sis;
	private JButton jButton1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		NewJFrame inst = new NewJFrame();
		inst.setVisible(true);
	}
	
	public NewJFrame() {
		
		super();
		sis = new Sistema();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				Vector datos = sis.getAlumnos();
				Vector columnas = new Vector();
				columnas.add("Nombre");
				columnas.add("Apellido");
				columnas.add("Domicilio");
				columnas.add("Telefono");
				TableModel jTable1Model = new DefaultTableModel(datos, columnas);
				jTable1 = new JTable();
				getContentPane().add(jTable1);
				jTable1.setModel(jTable1Model);
				jTable1.setBounds(14, 14, 350, 189);
				jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
				jTable1.setLocation(new java.awt.Point(0, -1));
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("Agregar Alumno");
				jButton1.setBounds(126, 224, 147, 28);
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) 
					{
						sis.agregarAlumno();
						Vector datos = sis.getAlumnos();
						Vector columnas = new Vector();
						columnas.add("Nombre");
						columnas.add("Apellido");
						columnas.add("Domicilio");
						columnas.add("Telefono");
						TableModel jTable1Model = new DefaultTableModel(datos, columnas);
						jTable1.setModel(jTable1Model);
							
					}
				});
			}
			pack();
			this.setSize(400, 328);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
