package practicasLayout.Calculadora;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * metodo que crea una ventana(y la lanza)
 * @author Javier Gonzalez Rives
 *
 */
public class Ventana extends JFrame implements ActionListener {
	private PanelSuperior sup;
	private PanelBotones bot;
	private JButton btnNumeros[],btnOperaciones[];
	/**
	 * constructor que crea la ventana con todos sus paramentros
	 */
	public Ventana() {
		super("calculadora");
		setBounds(100, 100, 400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
	}
	private void init() {
		// inicializacion de los paneles
		sup = new PanelSuperior();
		bot = new PanelBotones();
		// inicializacion de los botoes
		btnNumeros = new JButton[10];
		btnOperaciones = new JButton[6];
		// bucle para guardar los botones numeros
		for(int i = 0; i < btnNumeros.length; i++) {
			btnNumeros[i] = bot.getBtnNumero(i);
			btnNumeros[i].addActionListener(this);
		}
		// bucle para guardar los botones simbolos
		for(int i = 0; i < btnOperaciones.length; i++) {
			btnOperaciones[i] = bot.getBtnSigno(i);
			btnOperaciones[i].addActionListener(this);
		}
		// annadir paneles
		add(sup,BorderLayout.PAGE_START);
		add(bot,BorderLayout.CENTER);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
				
	}
	
}
