package ComponentesSwing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class SwingBorder extends JFrame 
{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int WIDTH = 300;
	 private  int HEIGHT = 300;
	 
	
	
	 // Swing components
	 private JPanel panel;
	 private JMenuBar menuBar;
	 private JMenu fileMenu;
	 private JMenuItem fileExit; 
	 private JMenu borderMenu;
	 private String[] borderTypes = {"Bevel","Compound","Empty","Etched",
	  "Line","Matte","SoftBevel","Titled"};
	 private JRadioButtonMenuItem[] borders;
	 private AbstractBorder[] border = {new BevelBorder(BevelBorder.LOWERED),
	  new CompoundBorder(new LineBorder(Color.blue,10),
	   new LineBorder(Color.red,5)), new EmptyBorder(10,10,10,10), 
	  new EtchedBorder(), new LineBorder(Color.blue,10),
	  new MatteBorder(new ImageIcon("phone.gif")), 
	  new SoftBevelBorder(BevelBorder.RAISED),
	  new TitledBorder("TitledBorder")};
	 private ButtonGroup buttonGroup;
	 
	 public SwingBorder() 
	 {
	  super();
	  buildGUI();
	  setSize(WIDTH,HEIGHT);
	  
	 }
	 
	 private void buildGUI() 
	 {
		 setTitle("Swing Border");
		 panel = new JPanel();
		 menuBar = new JMenuBar();
		 fileMenu = new JMenu("File");
		 fileExit = new JMenuItem("Exit");
		 borderMenu = new JMenu("Border");
		 borders = new JRadioButtonMenuItem[borderTypes.length];
		 buttonGroup = new ButtonGroup();
		 setupMenuBar();
		 layoutComponents();
	 }
	
	 private void setupMenuBar() 
	 {
		 fileMenu.add(fileExit); 
		 for(int i=0;i<borderTypes.length;++i) 
		 {
			 borders[i] = new JRadioButtonMenuItem(borderTypes[i]);
			 buttonGroup.add(borders[i]);
			 borderMenu.add(borders[i]);
		 }
		 menuBar.add(fileMenu);
		 menuBar.add(borderMenu);
		 setJMenuBar(menuBar);
		 
		 addWindowListener(new WindowAdapter()
		 {
			 public void windowClosing(WindowEvent e) 
			 {
				 System.exit(0);
			 }
		 }
		 );
		 fileExit.addActionListener(new ActionListener()
		 {
			 public void actionPerformed(ActionEvent e) 
			 {
				 String cmd = e.getActionCommand();
				 if(cmd.equals("Exit")) System.exit(0);
			 }
		 }
		 );
		 for(int i=0;i<borders.length;++i)
		 	 borders[i].addItemListener(new ItemListener()
			 { 
				 public void itemStateChanged(ItemEvent e) 
			   	 {
					 	JRadioButtonMenuItem button = (JRadioButtonMenuItem) e.getItem();
			   	    	String label = button.getText();
			   	    	for(int i=0;i<borderTypes.length;++i) 
			   	    	{
			   	    		if(label.equals(borderTypes[i])) 
			   	    		{
			   	    			panel.setBorder(border[i]);
			   	    			repaint();
			   	    		}
			   	    	}
			   	 }
		   	}
		 );
	 }
	
	 public void layoutComponents() 
	 {
		  getContentPane().setLayout(new BorderLayout());
		  getContentPane().add("Center",panel);
	 }
	
	 
	 public static void main(String[] args) 
	 {
		   SwingBorder app = new SwingBorder();
		   app.setVisible(true);
	 }

 }