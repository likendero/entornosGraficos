package acciones;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Foco {
	public static void main(String[] args) {
		VentanaFocus ven = new VentanaFocus();
		ven.setVisible(true);
	}
}
class VentanaFocus extends JFrame{
	public VentanaFocus() {
		super("ventana focus");
		setBounds(100, 100, 400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelFoco panel = new PanelFoco();
		add(panel);
	}
}
/**
 * panel para 
 * @author linuxdiurno
 *
 */
class PanelFoco extends JPanel implements FocusListener{
	JTextField txtMail;
	JTextField txtVuelve;
	public PanelFoco() {
		super();
		setLayout(null);
		txtMail = new JTextField();
		txtVuelve = new JTextField();
		JLabel lbMail = new JLabel("EMAIL");
		JLabel lbCorrecto = new JLabel("vuelve a introducirlo");
		lbMail.setBounds(100,100,100,20);
		lbCorrecto.setBounds(100,120,150,20);
		txtMail.setBounds(150,100,100,20);
		txtVuelve.setBounds(200,120,100,20);
		add(txtMail);
		add(txtVuelve);
		add(lbMail);
		add(lbCorrecto);
		txtMail.addFocusListener(this);
	}

	@Override
	public void focusGained(FocusEvent e) {
		txtVuelve.setText("focuseado");
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		if(txtMail.getText().matches("^[0-9 a-z A-Z]@[0-9 a-z A-Z]")) {
			txtVuelve.setText("correcto");
		}else {
			txtVuelve.setText("incorrecto");
		}
		
	}
}