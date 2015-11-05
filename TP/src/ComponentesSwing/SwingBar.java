package ComponentesSwing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SwingBar extends JFrame 
{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int WIDTH = 400;
	 private int HEIGHT = 400;
	
	
	 
	 // Swing components
	 private JToolBar toolBar = new JToolBar();
	 private String[] iconFiles = {"new.gif","open.gif","save.gif",	"cut.gif",  "copy.gif", "paste.gif"};
	 private String[] buttonLabels = {"New","Open","Save","Cut","Copy","Paste"};
	 private ImageIcon[] icons;
	 private JButton[] buttons;
	 private JMenuBar menuBar;
	 private JMenu fileMenu;
	 private JMenuItem fileExit;
	 
	 public SwingBar()
	 {
		  super();
		  buildGUI();
		  setSize(WIDTH,HEIGHT);
	 
	 }
	 
	 void buildGUI() 
	 {
		 setTitle("SwingBar");
		 toolBar = new JToolBar();
		 icons = new ImageIcon[iconFiles.length];
		 buttons = new JButton[buttonLabels.length];
		 menuBar = new JMenuBar();
		 fileMenu = new JMenu("File");
		 fileExit = new JMenuItem("Exit");
		 setupMenuBar();
		 layoutComponents();
	 }
	
	 void setupMenuBar() 
	 {
		  fileMenu.add(fileExit); 
		  menuBar.add(fileMenu);
		  setJMenuBar(menuBar);
	 }
	
	 public void layoutComponents() 
	 {
	  
		  getContentPane().setLayout(new BorderLayout());
		  for(int i=0;i<buttonLabels.length;++i) 
		  {
			   icons[i] = new ImageIcon(iconFiles[i]);
			   buttons[i] = new JButton(icons[i]);
			   buttons[i].setToolTipText(buttonLabels[i]);
			   if(i==3) toolBar.addSeparator();
			   toolBar.add(buttons[i]);
		  }
		  getContentPane().add("North",toolBar);
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
	  
	 }
	
	   public static void main(String[] args) 
	   {
		   SwingBar app = new SwingBar();
		   app.setVisible(true);
	   }

  
}