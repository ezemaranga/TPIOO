package EjercicioSwing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import javax.swing.WindowConstants;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;


public class MenuPrincipal2 extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar jMenuBar1;
	private JMenu jMenu1;
	private JMenuItem jMenuItem1;
	private JMenu jMenu2;
	private JMenuItem jMenuItem3;
	private JMenuItem jMenuItem2;
	
	private Sistema sistema;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		MenuPrincipal2 inst = new MenuPrincipal2();
		inst.setVisible(true);
	}
	
	public MenuPrincipal2() {
		super();
		initGUI();
		sistema = new Sistema();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				jMenuBar1.setPreferredSize(new java.awt.Dimension(392, 22));
				{
					jMenu1 = new JMenu();
					jMenuBar1.add(jMenu1);
					jMenu1.setText("Alumnos");
					jMenu1.setPreferredSize(new java.awt.Dimension(56, 21));
					jMenu1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) 
						{
							
						}
					});
					{
						jMenuItem1 = new JMenuItem();
						jMenu1.add(jMenuItem1);
						jMenuItem1.setText("Alta");
						jMenuItem1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) 
							{
								AltaAlumno a = new AltaAlumno(sistema);
								a.setVisible(true);
								
							}
						});
					}
					{
						jMenuItem2 = new JMenuItem();
						jMenu1.add(jMenuItem2);
						jMenuItem2.setText("Modificacion");
						jMenuItem2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) 
							{
								ModificarAlumno m = new ModificarAlumno(sistema);
								m.setVisible(true);
							}
						});
					}
					{
						jMenuItem3 = new JMenuItem();
						jMenu1.add(jMenuItem3);
						jMenuItem3.setText("Baja");
						jMenuItem3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) 
							{
								System.out.println( "Apreto Baja");
							}
						});
					}
				}
				{
					jMenu2 = new JMenu();
					jMenuBar1.add(jMenu2);
					jMenu2.setText("Salir");
					jMenu2.addMenuListener(new MenuListener() {
						public void menuSelected(MenuEvent evt) {
							System.exit(0);
						}
						public void menuDeselected(MenuEvent evt) {
							
						}
						public void menuCanceled(MenuEvent evt) {
							
						}
					});
				}
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
