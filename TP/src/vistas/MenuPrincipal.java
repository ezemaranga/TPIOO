package vistas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import codigo.SistemaCocheras;

public class MenuPrincipal extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar jMenuBarSistema;
	private JMenu jMenuClientes;
	private JMenuItem jMenuItemAltaClientes;
	private JMenuItem jMenuItemBajaClientes;
	private JMenuItem jMenuItemModificacionClientes;
	private JMenu jMenuCocheras;
	private JMenuItem jMenuItemAltaCocheras;
	private JMenuItem jMenuItemBajaCocheras;
	private JMenuItem jMenuItemBuscarCocheras;
	private JMenuItem jMenuItemModificacionCocheras;
	private JMenu jMenuAbonos;
	private JMenuItem jMenuItemAltaAbonos;
	private JMenuItem jMenuItemBajaAbonos;
	private JMenuItem jMenuItemModificacionAbonos;
	private JMenu jMenuContratos;
	private JMenuItem jMenuItemAltaContratos;
	private JMenuItem jMenuItemBajaContratos;
	private JMenuItem jMenuItemModificacionContratos;
	private JMenu jMenuCobranzas;
	private JMenuItem jMenuItemNuevaCobranza;
	private JMenuItem jMenuItemProcesosBatch;
	private JMenu jMenuSalir;

	private SistemaCocheras sistema;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		MenuPrincipal inst = new MenuPrincipal();
		inst.setVisible(true);
	}

	public MenuPrincipal() {
		super();
		initGUI();
		sistema = new SistemaCocheras();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jMenuBarSistema = new JMenuBar();
				setJMenuBar(jMenuBarSistema);
				jMenuBarSistema.setPreferredSize(new java.awt.Dimension(200, 25));
				{
					jMenuClientes = new JMenu();
					jMenuBarSistema.add(jMenuClientes);
					jMenuClientes.setText("Clientes");
					jMenuClientes.setPreferredSize(new java.awt.Dimension(80,22));
					jMenuClientes.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {

						}
					});
					{
						jMenuItemAltaClientes = new JMenuItem();
						jMenuClientes.add(jMenuItemAltaClientes);
						jMenuItemAltaClientes.setText("Alta");
						jMenuItemAltaClientes.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								
								  AltaCliente a = new AltaCliente(sistema);
								  a.setVisible(true);
								 
							}
						});
					}
					{
						jMenuItemBajaClientes = new JMenuItem();
						jMenuClientes.add(jMenuItemBajaClientes);
						jMenuItemBajaClientes.setText("Baja");
						jMenuItemBajaClientes.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								
								 BajaCliente m = new BajaCliente(sistema);
								 m.setVisible(true);
								 
							}
						});
					}
					{
						jMenuItemModificacionClientes = new JMenuItem();
						jMenuClientes.add(jMenuItemModificacionClientes);
						jMenuItemModificacionClientes.setText("Modificacion");
						jMenuItemModificacionClientes.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								
								 ModificarCliente m = new ModificarCliente(sistema);
								 m.setVisible(true);
								 
							}
						});
					}
				}
				{
					jMenuCocheras = new JMenu();
					jMenuBarSistema.add(jMenuCocheras);
					jMenuCocheras.setText("Cocheras");
					jMenuCocheras.setPreferredSize(new java.awt.Dimension(80,22));
					jMenuCocheras.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {

						}
					});
					{
						jMenuItemAltaCocheras = new JMenuItem();
						jMenuCocheras.add(jMenuItemAltaCocheras);
						jMenuItemAltaCocheras.setText("Alta");
						jMenuItemAltaCocheras.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								  AltaCocheras a = new AltaCocheras(sistema);
								  a.setVisible(true);
	
							}
						});
					}
					{
						jMenuItemBajaCocheras = new JMenuItem();
						jMenuCocheras.add(jMenuItemBajaCocheras);
						jMenuItemBajaCocheras.setText("Baja");
						jMenuItemBajaCocheras.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								 BajaCocheras m = new BajaCocheras(sistema);
								 m.setVisible(true);
								 
							}
						});
					}
					{
						jMenuItemModificacionCocheras = new JMenuItem();
						jMenuCocheras.add(jMenuItemModificacionCocheras);
						jMenuItemModificacionCocheras.setText("Modificacion");
						jMenuItemModificacionCocheras.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								
								  ModificarCocheras m = new ModificarCocheras(sistema);
								  m.setVisible(true);
								 
							}
						});
					}
				}
				{
					{
						jMenuAbonos = new JMenu();
						jMenuBarSistema.add(jMenuAbonos);
						jMenuAbonos.setText("Abonos");
						jMenuAbonos.setPreferredSize(new java.awt.Dimension(80,22));
						jMenuAbonos.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {

							}
						});
						{
							jMenuItemAltaAbonos = new JMenuItem();
							jMenuAbonos.add(jMenuItemAltaAbonos);
							jMenuItemAltaAbonos.setText("Alta");
							jMenuItemAltaAbonos.addActionListener(new ActionListener() {
								public void actionPerformed(
										ActionEvent evt) {
									AltaAbono a = new AltaAbono(sistema);
									a.setVisible(true);
								}
							});
						}
						{
							jMenuItemBajaAbonos = new JMenuItem();
							jMenuAbonos.add(jMenuItemBajaAbonos);
							jMenuItemBajaAbonos.setText("Baja");
							jMenuItemBajaAbonos.addActionListener(new ActionListener() {
								public void actionPerformed(
										ActionEvent evt) {

									BajaAbonos m = new BajaAbonos(sistema);
									m.setVisible(true);

								}
							});
						}
						{
							jMenuItemModificacionAbonos = new JMenuItem();
							jMenuAbonos.add(jMenuItemModificacionAbonos);
							jMenuItemModificacionAbonos.setText("Modificacion");
							jMenuItemModificacionAbonos.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									 ModificarAbonos m = new
									 ModificarAbonos(sistema);
									 m.setVisible(true);
								}
							});
						}
					}
				}
				{
					{
						jMenuContratos = new JMenu();
						jMenuBarSistema.add(jMenuContratos);
						jMenuContratos.setText("Contratos");
						jMenuContratos.setPreferredSize(new java.awt.Dimension(80,22));
						jMenuContratos.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								
							}
						});
						{
							jMenuItemAltaContratos = new JMenuItem();
							jMenuContratos.add(jMenuItemAltaContratos);
							jMenuItemAltaContratos.setText("Alta");
							jMenuItemAltaContratos.addActionListener(new ActionListener() {
								public void actionPerformed(
										ActionEvent evt) {
									/*
									 * AltaContratos a = new
									 * AltaContratos(sistema);
									 * a.setVisible(true);
									 */

								}
							});
						}
						{
							jMenuItemBajaContratos = new JMenuItem();
							jMenuContratos.add(jMenuItemBajaContratos);
							jMenuItemBajaContratos.setText("Baja");
							jMenuItemBajaContratos.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									/*
									 * BajaContrato m = new
									 * BajaContrato(sistema);
									 * m.setVisible(true);
									 */
								}
							});
						}
						{
							jMenuItemModificacionContratos = new JMenuItem();
							jMenuContratos.add(jMenuItemModificacionContratos);
							jMenuItemModificacionContratos.setText("Modificacion");
							jMenuItemModificacionContratos.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent evt) {
									/*
									 * ModificarContratos m = new
									 * ModificarContratos(sistema);
									 * m.setVisible(true);
									 */
								}
							});
						}
					}
				}
				{

					{
						jMenuCobranzas = new JMenu();
						jMenuBarSistema.add(jMenuCobranzas);
						jMenuCobranzas.setText("Cobranzas");
						jMenuCobranzas.setPreferredSize(new java.awt.Dimension(80,22));
						{
							jMenuItemNuevaCobranza = new JMenuItem();
							jMenuCobranzas.add(jMenuItemNuevaCobranza);
							jMenuItemNuevaCobranza.setText("Nueva Cobranza");
							jMenuItemNuevaCobranza.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent evt){
									AltaCobranzas a = new
									AltaCobranzas(sistema);
									a.setVisible(true);
								}
							});
						}
						{
							jMenuItemProcesosBatch = new JMenuItem();
							jMenuCobranzas.add(jMenuItemProcesosBatch);
							jMenuItemProcesosBatch.setText("Procesos Batch");
							jMenuItemProcesosBatch.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent evt){
									AltaCobranzasBatch a = new
									AltaCobranzasBatch(sistema);
									a.setVisible(true);
								}
							});
						}
					}
					{
						jMenuSalir = new JMenu();
						jMenuBarSistema.add(jMenuSalir);
						jMenuSalir.setText("Salir");
						jMenuSalir.addMenuListener(new MenuListener() {
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
			}
			pack();
			setSize(650, 350);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
