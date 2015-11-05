package ComponentesSwing;
import java.awt.event.*;
import javax.swing.*;


public class SwingWin extends JFrame 
{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int WIDTH = 300;
	 private int HEIGHT = 300;
	
	
	 // Swing components
	 JTextField textField = new JTextField(150);
	 JMenuBar menuBar = new JMenuBar();
	 JMenu fileMenu = new JMenu("File");
	 JMenuItem fileNew = new JMenuItem("New");
	 JMenuItem fileOpen = new JMenuItem("Open");
	 JMenuItem fileSave = new JMenuItem("Save");
	 JMenuItem fileExit = new JMenuItem("Exit");
	 JMenu editMenu = new JMenu("Edit");
	 JMenuItem editCut = new JMenuItem("Cut");
	 JMenuItem editCopy = new JMenuItem("Copy");
	 JMenuItem editPaste = new JMenuItem("Paste"); 
	 JMenu specialMenu = new JMenu("Special");
	 JCheckBoxMenuItem specialCheck1 = new JCheckBoxMenuItem("Check 1");
	 JCheckBoxMenuItem specialCheck2 = new JCheckBoxMenuItem("Check 2",true);
	 JSeparator separator = new JSeparator();
	 JRadioButtonMenuItem specialRadio1 = new JRadioButtonMenuItem("Radio 1");
	 JRadioButtonMenuItem specialRadio2 = new JRadioButtonMenuItem("Radio 2");
	 ButtonGroup buttonGroup = new ButtonGroup();
	 
	 public SwingWin() 
	 {
		 
		  buildGUI();
		  setSize(WIDTH,HEIGHT);
		 
	 }
	 
	 void buildGUI() 
	 {
		 setTitle("SwingWin");
		 textField = new JTextField(150);
		 menuBar = new JMenuBar();
		 fileMenu = new JMenu("File");
		 fileNew = new JMenuItem("New");
		 fileOpen = new JMenuItem("Open");
		 fileSave = new JMenuItem("Save");
		 fileExit = new JMenuItem("Exit");
		 editMenu = new JMenu("Edit");
		 editCut = new JMenuItem("Cut");
		 editCopy = new JMenuItem("Copy");
		 editPaste = new JMenuItem("Paste"); 
		 specialMenu = new JMenu("Special");
		 specialCheck1 = new JCheckBoxMenuItem("Check 1");
		 specialCheck2 = new JCheckBoxMenuItem("Check 2",true);
		 separator = new JSeparator();
		 specialRadio1 = new JRadioButtonMenuItem("Radio 1");
		 specialRadio2 = new JRadioButtonMenuItem("Radio 2");
		 buttonGroup = new ButtonGroup();
		 
		 setupMenuBar();
		 layoutComponents();
		 
		 //listener
		 addWindowListener(new WindowAdapter(){
			  public void windowClosing(WindowEvent e) {
				   System.exit(0);
				  }
				 });
		  fileNew.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent e) {
				   textField.setText("NEW");
				  }
				 });
		  fileOpen.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent e) {
				  textField.setText("OPEN");
				  }
				 });
		  fileSave.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent e) {
				  textField.setText("SAVE");
				  }
				 });
		  fileExit.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent e) {
				   System.exit(0);
				   
				  }
				 });
		  editCut.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent e) {
				  textField.setText("CUT");
				  }
				 });
		  editCopy.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent e) {
				  textField.setText("COPY");
				  }
				 });
		  editPaste.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent e) {
				  textField.setText("PASTE");
				  }
				 });
		  specialCheck1.addItemListener(new ItemListener(){
			  public void itemStateChanged(ItemEvent e) {
				   if (specialCheck1.isSelected())
					   textField.setText("Check 1 seleccionado");
				   else
					   textField.setText("Check 1 no seleccionado");
				  }
				 });
		  specialCheck2.addItemListener(new ItemListener(){
			  public void itemStateChanged(ItemEvent e) {
				  if (specialCheck2.isSelected())
					   textField.setText("Check 2 seleccionado");
				   
				  }
				 });
		  specialRadio1.addItemListener(new ItemListener(){
			  public void itemStateChanged(ItemEvent e) {
				  if (specialRadio1.isSelected())
					   textField.setText("Radio 1 seleccionado");
				   
				  }
				 });
		  specialRadio2.addItemListener(new ItemListener(){
			  public void itemStateChanged(ItemEvent e) {
				  if (specialRadio2.isSelected())
					   textField.setText("Radio 2 seleccionado");
				 
				  }
				 });
	 }
	
	 private void setupMenuBar() 
	 {
		  fileMenu.add(fileNew); 
		  fileMenu.add(fileOpen); 
		  fileMenu.add(fileSave); 
		  fileMenu.add(fileExit); 
		  editMenu.add(editCut); 
		  editMenu.add(editCopy); 
		  editMenu.add(editPaste); 
		  specialMenu.add(specialCheck1);
		  specialMenu.add(specialCheck2);
		  specialMenu.add(separator);
		  buttonGroup.add(specialRadio1);
		  buttonGroup.add(specialRadio2);
		  specialMenu.add(specialRadio1);
		  specialMenu.add(specialRadio2);
		  menuBar.add(fileMenu);
		  menuBar.add(editMenu);
		  menuBar.add(specialMenu);
		  setJMenuBar(menuBar);
	 }
	
	 public void layoutComponents() 
	 {
		 getContentPane().setLayout(null);
		 textField.setBounds(80,80,150,30);
		 getContentPane().add(textField);
	 }
	
	 public static void main(String[] args)
	 {
		   SwingWin app = new SwingWin();
		   app.setVisible(true);
	 }

 



 
}