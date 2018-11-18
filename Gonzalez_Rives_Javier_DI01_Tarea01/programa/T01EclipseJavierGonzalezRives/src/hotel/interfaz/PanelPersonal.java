package hotel.interfaz;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * panel que contiene los campos para los datos personales
 * del cliente
 * - Nombre, Apellidos, Dirección y Teléfono
 * en el campo de telefono solo permite digitos
 * @author Javier Gonzalez Rives
 *
 */
public class PanelPersonal extends JPanel implements KeyListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TextField txNombre, txApellidos,txDireccion,txTelefono;
	private GroupLayout gl;
	private JLabel lbNombre,lbApellidos, lbDireccion,lbTelefono;
	
	/**
	 * cosntructor del panel
	 */
	public PanelPersonal() {
		super();
		init();
		setBackground(Color.PINK);
	}
	/**
	 * metod que inicializa los elementos del panel
	 */
	public void init() {
		/// annadir elementos
		// cuadros de texto
		txNombre = new TextField(20);
		txApellidos = new TextField(20);
		txDireccion = new TextField(20);
		txTelefono = new TextField(20);
		// añadir etiquetas
		lbDireccion = new JLabel("Direccion: ");
		lbNombre = new JLabel("nombre: ");
		lbTelefono = new JLabel("telefono: ");
		lbApellidos = new JLabel("apellidos: ");
		
		///acciones
		// add key listenner
		txTelefono.addKeyListener(this);
		/// set layout
		gl = new GroupLayout(this);
		gl.setAutoCreateContainerGaps(true);
		gl.setAutoCreateGaps(true);
		this.setLayout(gl);
		/// add al panel
		// etiquetas
		add(lbDireccion);
		add(lbNombre);
		add(lbApellidos);
		add(lbTelefono);
		// cuadros de texto
		add(txApellidos);
		add(txDireccion);
		add(txNombre);
		add(txTelefono);
		// definicion posiciones layout
		groupDefinition();
	}
	/**
	 * metodo que define los paramentros del 
	 * group layout
	 */
	private void groupDefinition() {
		// definicion del grupo Vertical
		gl.setVerticalGroup(
				gl.createSequentialGroup()
				.addGroup(
						gl.createParallelGroup()
						.addComponent(lbNombre)
						.addComponent(txNombre,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
						)
				.addGroup(
						gl.createParallelGroup()
						.addComponent(lbApellidos)
						.addComponent(txApellidos,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
						)
				.addGroup(
						gl.createParallelGroup()
						.addComponent(lbDireccion)
						.addComponent(txDireccion,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
						)
				.addGroup(
						gl.createParallelGroup()
						.addComponent(lbTelefono)
						.addComponent(txTelefono,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
						)
				);
		// definicion del grupo Horizontal
		gl.setHorizontalGroup(
				gl.createSequentialGroup()
				.addGroup(
						gl.createParallelGroup()
						.addComponent(lbNombre)
						.addComponent(lbApellidos)
						.addComponent(lbDireccion)
						.addComponent(lbTelefono)
						)
				.addGroup(
						gl.createParallelGroup()
						.addComponent(txNombre)
						.addComponent(txApellidos)
						.addComponent(txDireccion)
						.addComponent(txTelefono)
						)
				);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// caso que este en el rango de caracteres
		if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9' || e.getKeyChar() == '\b') {
			
			// caso que no este en el rango de caracteres
		}else {
			e.consume();
		}
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * @return the txNombre
	 */
	public TextField getTxNombre() {
		return txNombre;
	}
	/**
	 * @param txNombre the txNombre to set
	 */
	public void setTxNombre(TextField txNombre) {
		this.txNombre = txNombre;
	}
	/**
	 * @return the txApellidos
	 */
	public TextField getTxApellidos() {
		return txApellidos;
	}
	/**
	 * @param txApellidos the txApellidos to set
	 */
	public void setTxApellidos(TextField txApellidos) {
		this.txApellidos = txApellidos;
	}
	/**
	 * @return the txDireccion
	 */
	public TextField getTxDireccion() {
		return txDireccion;
	}
	/**
	 * @param txDireccion the txDireccion to set
	 */
	public void setTxDireccion(TextField txDireccion) {
		this.txDireccion = txDireccion;
	}
	/**
	 * @return the txTelefono
	 */
	public TextField getTxTelefono() {
		return txTelefono;
	}
	/**
	 * @param txTelefono the txTelefono to set
	 */
	public void setTxTelefono(TextField txTelefono) {
		this.txTelefono = txTelefono;
	}
	/**
	 * @return the gl
	 */
	public GroupLayout getGl() {
		return gl;
	}
	/**
	 * @param gl the gl to set
	 */
	public void setGl(GroupLayout gl) {
		this.gl = gl;
	}
	/**
	 * @return the lbNombre
	 */
	public JLabel getLbNombre() {
		return lbNombre;
	}
	/**
	 * @param lbNombre the lbNombre to set
	 */
	public void setLbNombre(JLabel lbNombre) {
		this.lbNombre = lbNombre;
	}
	/**
	 * @return the lbApellidos
	 */
	public JLabel getLbApellidos() {
		return lbApellidos;
	}
	/**
	 * @param lbApellidos the lbApellidos to set
	 */
	public void setLbApellidos(JLabel lbApellidos) {
		this.lbApellidos = lbApellidos;
	}
	/**
	 * @return the lbDireccion
	 */
	public JLabel getLbDireccion() {
		return lbDireccion;
	}
	/**
	 * @param lbDireccion the lbDireccion to set
	 */
	public void setLbDireccion(JLabel lbDireccion) {
		this.lbDireccion = lbDireccion;
	}
	/**
	 * @return the lbTelefono
	 */
	public JLabel getLbTelefono() {
		return lbTelefono;
	}
	/**
	 * @param lbTelefono the lbTelefono to set
	 */
	public void setLbTelefono(JLabel lbTelefono) {
		this.lbTelefono = lbTelefono;
	}
	//// metodos para control
	/**
	 * metodo que reincia el contenido de todos los campos
	 */
	public void reinciar() {
		// cambio a cadena vacia
		this.txNombre.setText("");
		this.txApellidos.setText("");
		this.txDireccion.setText("");;
		this.txTelefono.setText("");
	}
	/**
	 * metodo que comprueba que todos los campos esten relenos
	 * @return
	 */
	public boolean aceptar() {
		// captura de los valores en texto
		String nombre = this.getTxNombre().getText().trim();
		String apellidos = this.getTxApellidos().getText().trim();
		String direccion = this.getTxDireccion().getText().trim();
		String telefono = this.txTelefono.getText();
		
		/// compribaciones
		// comprobacion de campos vacios
		if(
				nombre.isEmpty() ||
				apellidos.isEmpty() ||
				direccion.isEmpty() ||
				telefono.isEmpty()
				) {
			return false;
		}
		// comprobacion que el nombre y el apellido solo tengan letras
		/*if(
				!nombre.matches("^[a-zA-Z]") ||
				!apellidos.matches("^[a-zA-Z]")
				) {
			return false;
		}*/
		// si no hay problemas devuelve true
		return true;
	}
}







