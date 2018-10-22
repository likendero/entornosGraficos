package practicasLayout.PanelesNull;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * panel que contiene una serie de paneles y botones
 * colocados de forma manual
 * @author Javier Gonzalez Rives
 *
 */
public class PanelContenedor extends JPanel implements ActionListener{
	private JTextField txtNombre,txtApellido;
	private JButton btnOcultar,btnMostrar,btnAceptar,btnReiniciarDatos;
	private PanelBoton panelBoton;
	/**
	 * cosntructor del panel
	 */
	public PanelContenedor() {
		super();
		setLayout(null);
		init();
	}
	/**
	 * metodo que incializa los elementos
	 */
	private void init() {
		// instanciacion paneles
		PanelTextos panelTextos = new PanelTextos();
		panelBoton = new PanelBoton();
		// instanciacion de botones
		btnAceptar = new JButton("aceptar");
		btnMostrar = new JButton("mostrar panel2");
		btnOcultar = new JButton("Ocultar Panel2");
		btnReiniciarDatos = new JButton("reiniciar datos");
		// captura de los textos
		txtApellido = panelTextos.getTxtApellidos();
		txtNombre = panelTextos.getTxtNombre();
		// annadir acciones
		btnOcultar.addActionListener(this);
		btnAceptar.addActionListener(this);
		btnMostrar.addActionListener(this);
		btnReiniciarDatos.addActionListener(this);
		//definicion de parametros
		panelTextos.setBounds(50, 100, 200, 200);
		panelBoton.setBounds(300, 100, 200, 200);
		// botones
		btnOcultar.setBounds(50, 350,150, 25);
		btnMostrar.setBounds(50, 400,150, 25);
		btnReiniciarDatos.setBounds(250, 350,150, 25);
		btnAceptar.setBounds(250, 400,150, 25);
		// add panel
		add(panelTextos);
		add(panelBoton);
		// add botones
		add(btnOcultar);
		add(btnMostrar);
		add(btnAceptar);
		add(btnReiniciarDatos);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// caso ocultar
		if(e.getSource() == btnOcultar) {
			panelBoton.setVisible(false);
		}
		// caso mostrar
		if(e.getSource() == btnMostrar) {
			panelBoton.setVisible(true);
		}
		// caso aceptar
		if(e.getSource() == btnAceptar) {
			// control que los recuadros de texto tengan texto
			if(
					txtApellido.getText().trim().length() < 1
					&& 	txtNombre.getText().trim().length() < 1
					) {
				// se muestra un mensaje de error si no hay texto
				JOptionPane.showMessageDialog(this, "no hay texto", "error en la intro", JOptionPane.ERROR_MESSAGE);
				
			}else {
				JOptionPane.showMessageDialog(this, txtApellido.getText() + "\n" + txtNombre.getText(), "error en la intro", JOptionPane.DEFAULT_OPTION);
			}
		}
		// caso reiniciar datos
		if(e.getSource() == btnReiniciarDatos) {
			txtApellido.setText("");
			txtNombre.setText("");
		}
		
	}
}
