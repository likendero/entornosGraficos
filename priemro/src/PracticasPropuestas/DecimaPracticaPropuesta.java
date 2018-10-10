package PracticasPropuestas;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;;

/**
 * clase principal
 * @author Javier Gonzalez Rives
 *
 */
public class DecimaPracticaPropuesta {
	public static void main(String[] args) {
		VentanaUsuarioContra ven = new VentanaUsuarioContra();
		ven.setVisible(true);
	}
}
/**
 * clase que crea la ventana
 * @author linuxdiurno
 *
 */
class VentanaUsuarioContra extends JFrame{
	
	public VentanaUsuarioContra() {
		super();
		setBounds(100, 100, 400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelUsuarioContra panel = new PanelUsuarioContra();
		add(panel);
	}
}
/**
 * clase con el panel y los elementos
 * @author linuxdiurno
 *
 */
class PanelUsuarioContra extends JPanel implements ActionListener{
	private JTextField txtUsuario;
	private JPasswordField pwdUsuario;
	private JLabel lbNombre,lbContra;
	
	/**
	 * constructor principal
	 */
	public PanelUsuarioContra() {
		super();
		setLayout(null);
		init();
	}
	/**
	 * metodo que inicializa los compoenentes 
	 * del panel:
	 * 
	 */
	public void init() {
		// instanciacion de los elementos
		txtUsuario = new JTextField(20);
		pwdUsuario = new JPasswordField(20);
		lbNombre = new JLabel("usuario:");
		lbContra = new JLabel("contraseña:");
		// definicion caracterisiticas
		// cambio de fuente
		lbNombre.setFont(new Font("arial", Font.BOLD, 24));
		lbContra.setFont(new Font("arial", Font.BOLD, 24));
		// cambio cuadros de texto
		txtUsuario.setBackground(Color.BLACK);
		txtUsuario.setForeground(Color.GREEN);
		pwdUsuario.setBackground(Color.BLACK);
		pwdUsuario.setForeground(Color.GREEN);
		// posicion
		lbNombre.setLocation(25,100);
		lbContra.setLocation(25,150);
		txtUsuario.setLocation(150,100);
		pwdUsuario.setLocation(190,150);
		// tamanno
		lbContra.setSize(160,20);
		lbNombre.setSize(125,20);
		pwdUsuario.setSize(100,20);
		txtUsuario.setSize(100,20);
		// acciones
		txtUsuario.addActionListener(this);
		pwdUsuario.addActionListener(this);
		// adds
		add(lbContra);
		add(lbNombre);
		add(txtUsuario);
		add(pwdUsuario);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// caso de pulsar intro en el cuadro usuario
		if(e.getSource() == txtUsuario) {
			JOptionPane.showMessageDialog(this, txtUsuario.getText(), "usuario:", JOptionPane.INFORMATION_MESSAGE);
		}
		// caso de pulsar intro cuadro contrasdenna
		if(e.getSource() == pwdUsuario) {
			JOptionPane.showMessageDialog(this, pwdUsuario.getPassword(), "Contrasenna:", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
}






























