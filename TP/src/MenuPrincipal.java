import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import javax.swing.WindowConstants;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

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
	private JMenu jMenuAbonos;
	private JMenuItem jMenuItemAltaAbonos;
	private JMenuItem jMenuItemBajaAbonos;
	private JMenuItem jMenuItemModificacionAbonos;
	private JMenu jMenuContratos;
	private JMenuItem jMenuItemAltaContratos;
	private JMenuItem jMenuItemBajaContratos;
	private JMenuItem jMenuItemModificacionContratos;
	private JMenu jMenuMedioDePago;
	private JMenuItem jMenuItemAltaMdPago;
	private JMenuItem jMenuItemBajaMdPago;
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
				jMenuBarSistema
						.setPreferredSize(new java.awt.Dimension(392, 22));
				{
					jMenuClientes = new JMenu();
					jMenuBarSistema.add(jMenuClientes);
					jMenuClientes.setText("Clientes");
					jMenuClientes.setPreferredSize(new java.awt.Dimension(56,
							21));
					jMenuClientes.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {

						}
					});
					{
						jMenuItemAltaClientes = new JMenuItem();
						jMenuClientes.add(jMenuItemAltaClientes);
						jMenuItemAltaClientes.setText("Alta");
						jMenuItemAltaClientes
								.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent evt) {
										/*
										 * AltaCliente a = new
										 * AltaCliente(sistema);
										 * a.setVisible(true);
										 */

									}
								});
					}
					{
						jMenuItemBajaClientes = new JMenuItem();
						jMenuClientes.add(jMenuItemBajaClientes);
						jMenuItemBajaClientes.setText("Baja");
						jMenuItemBajaClientes
								.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent evt) {
										/*
										 * BajaCliente m = new
										 * BajaCliente(sistema);
										 * m.setVisible(true);
										 */
									}
								});
					}
					{
						jMenuItemModificacionClientes = new JMenuItem();
						jMenuClientes.add(jMenuItemModificacionClientes);
						jMenuItemModificacionClientes.setText("Modificación");
						jMenuItemModificacionClientes
								.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent evt) {
										/*
										 * ModificacionCliente m = new
										 * ModificacionCliente(sistema);
										 * m.setVisible(true);
										 */
									}
								});
					}
				}
				{
					{
						jMenuAbonos = new JMenu();
						jMenuBarSistema.add(jMenuAbonos);
						jMenuAbonos.setText("Abonos");
						jMenuAbonos.setPreferredSize(new java.awt.Dimension(56,
								21));
						jMenuAbonos.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {

							}
						});
						{
							jMenuItemAltaAbonos = new JMenuItem();
							jMenuAbonos.add(jMenuItemAltaAbonos);
							jMenuItemAltaAbonos.setText("Alta");
							jMenuItemAltaAbonos
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
											/*
											 * AltaAbonos a = new
											 * AltaAbonos(sistema);
											 * a.setVisible(true);
											 */

										}
									});
						}
						{
							jMenuItemBajaAbonos = new JMenuItem();
							jMenuAbonos.add(jMenuItemBajaAbonos);
							jMenuItemBajaAbonos.setText("Baja");
							jMenuItemBajaAbonos
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
											/*
											 * BajaAbonos m = new
											 * BajaAbonos(sistema);
											 * m.setVisible(true);
											 */
										}
									});
						}
						{
							jMenuItemModificacionAbonos = new JMenuItem();
							jMenuAbonos.add(jMenuItemModificacionAbonos);
							jMenuItemModificacionAbonos.setText("Modificacion");
							jMenuItemModificacionAbonos
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
											/*
											 * ModificarAbonos m = new
											 * ModificarAbonos(sistema);
											 * m.setVisible(true);
											 */
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
						jMenuContratos.setPreferredSize(new java.awt.Dimension(
								56, 21));
						jMenuContratos.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {

							}
						});
						{
							jMenuItemAltaContratos = new JMenuItem();
							jMenuContratos.add(jMenuItemAltaContratos);
							jMenuItemAltaContratos.setText("Alta");
							jMenuItemAltaContratos
									.addActionListener(new ActionListener() {
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
							jMenuItemBajaContratos
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
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
							jMenuItemModificacionContratos
									.setText("Modificacion");
							jMenuItemModificacionContratos
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
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
						jMenuMedioDePago = new JMenu();
						jMenuBarSistema.add(jMenuMedioDePago);
						jMenuMedioDePago.setText("Medios de Pago");
						jMenuMedioDePago
								.setPreferredSize(new java.awt.Dimension(105,
										21));
						jMenuMedioDePago
								.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent evt) {

									}
								});
						{
							jMenuItemAltaMdPago = new JMenuItem();
							jMenuMedioDePago.add(jMenuItemAltaMdPago);
							jMenuItemAltaMdPago.setText("Alta");
							jMenuItemAltaMdPago
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
											/*
											 * AltaMedioDePago a = new
											 * jMenuItemAltaMdPago(sistema);
											 * a.setVisible(true);
											 */

										}
									});
						}
						{
							jMenuItemBajaMdPago = new JMenuItem();
							jMenuMedioDePago.add(jMenuItemBajaMdPago);
							jMenuItemBajaMdPago.setText("Modificacion");
							jMenuItemBajaMdPago
									.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent evt) {
											/*
											 * BajaMedioDePago m = new
											 * BajaMedioDePago(sistema);
											 * m.setVisible(true);
											 */
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
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
