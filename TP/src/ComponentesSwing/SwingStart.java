package ComponentesSwing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;


public class SwingStart extends Frame 
{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  int WIDTH = 450;
	 private  int HEIGHT = 450;
	 
	
	 // Swing components
	 private JTabbedPane tabbedPane;
	 private JPanel buttonPanel;
	 private JPanel barPanel;
	 private JPanel listPanel;
	 private JPanel tablePanel;
	 private Icon worldIcon = new ImageIcon("world.gif");
	 private Icon  printerIcon = new ImageIcon("printer.gif");
	 private Icon  leaf1Icon = new ImageIcon("leaf1.gif");
	 private Icon  leaf2Icon = new ImageIcon("leaf2.gif");
	 private Icon  leaf3Icon = new ImageIcon("leaf3.gif");
	 private Icon[] leaves = {leaf1Icon, leaf2Icon, leaf3Icon};
	 private JButton printerButton;
	 private JToggleButton worldButton;
	 private JList <Icon>leafList;
	 private JSlider slider;
	 private JProgressBar progressBar;
	 private String[] columns = {"Product ID","Description","Price"};
	 private Object[][] cells = {columns,{"zvga-1234","Video Card","$50"},
	  {"56m-11","56K Modem","$315"},
	  {"dc-10","Net Card","$499"}};
	 private JTable table;
	
	 public SwingStart() 
	 {
		  buildGUI();
		  setSize(WIDTH,HEIGHT);
		  setBackground(Color.darkGray);
		  this.setVisible(true);
	 }
	 
	 private void buildGUI() 
	 {
		 setTitle("SwingStart");
		 addWindowListener(new WindowAdapter()
		 {
			 public void windowClosing(WindowEvent e) 
			 {
			   System.exit(0);
			 }
		 }
		 );
		 
		 tabbedPane = new JTabbedPane();
		 buttonPanel = new JPanel();
		 barPanel = new JPanel();
		 listPanel = new JPanel();
		 tablePanel = new JPanel();
		 
		 
		 printerButton = new JButton("Print",printerIcon);
		 worldButton = new JToggleButton("Connect",worldIcon,true);
		 leafList = new JList<Icon>(leaves);
		 slider = new JSlider(JSlider.VERTICAL, 0, 100, 60);
		 progressBar = new JProgressBar();
		 table = new JTable(cells,columns);
	  
		 // Set up tabbed pane
		 JPanel[] panels = {buttonPanel,barPanel,listPanel,tablePanel};
		  String[] tabs = {"Buttons","Bars","Lists","Table"};
		  String[] tabTips = {"A Button and a Toggle Button","A Slider and a Progress Bar","An Icon List","A Cost Table"};
		  for(int i=0;i<tabs.length;++i)
		  {
			  panels[i].setBackground(Color.lightGray);
			  panels[i].setBorder(new TitledBorder(tabTips[i]));
			  tabbedPane.addTab(tabs[i],null,panels[i],tabTips[i]);
		  }
		  addComponentsToTabs();
		  add("Center",tabbedPane);
	 }
	
	 private void addComponentsToTabs()
	 {
		  setupButtonPanel();
		  setupBarPanel();
		  setupListPanel();
		  setupTablePanel();
	}
	
	 private void setupButtonPanel() 
	 {
		  printerButton.setBackground(Color.white);
		  worldButton.setBackground(Color.white);
		  buttonPanel.add(printerButton);
		  buttonPanel.add(worldButton);
	 }
	 
	 private void setupBarPanel() 
	 {
		  slider.setMajorTickSpacing(10);
		  slider.setMinorTickSpacing(5);
		  slider.setPaintTicks(true);
		  slider.addChangeListener(new ChangeListener()
		  {
			  public void stateChanged(ChangeEvent e) 
			  {
				  progressBar.setValue(slider.getValue());
			  }
		  }
		  );
		  progressBar.setOrientation(JProgressBar.HORIZONTAL);
		  progressBar.setMinimum(0);
		  progressBar.setMaximum(100);
		  progressBar.setValue(60);
		  progressBar.setBorderPainted(true);
		  barPanel.add(new JLabel("Slider"));
		  barPanel.add(slider);
		  barPanel.add(new JLabel("Progress Bar"));
		  barPanel.add(progressBar);
	}
	 
	 private void setupListPanel() 
	 {
		  leafList.setFixedCellHeight(123);
		  listPanel.add(leafList);
	 }
	 
	 private void setupTablePanel() 
	 {
		 tablePanel.add(table);
	 }
	
	 public static void main(String[] args) 
	 {
		 SwingStart app = new SwingStart();
		 app.setVisible(true);
	 }
	 
	 
}