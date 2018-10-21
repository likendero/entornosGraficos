package practicasLayout.Calculadora;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;
import javax.swing.text.html.parser.ParserDelegator;

import com.sun.tools.internal.ws.processor.generator.GeneratorExtension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 * metodo que crea una ventana(y la lanza)
 * @author Javier Gonzalez Rives
 *
 */
public class Ventana extends JFrame implements ActionListener {
	private PanelSuperior sup;
	private PanelBotones bot;
	private JButton btnNumeros[],btnOperaciones[];
	private JLabel texto;
	private char signo;
	private double numero = 0;
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
		// inicializacion del cuadro de texto
		texto = sup.getLbNumeros();
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
		casoNumeros(e);
		signos(e);
	}
	/*
	 * todo el codigo acontinuacion es altamante simplificable
	 */
	/**
	 * metodo que gestiona las operaciones de los signos
	 * @param e
	 */
	public void signos(ActionEvent e) {
		String num = texto.getText();
		double aux;
		// caso caso .
		if(e.getSource() == btnOperaciones[3]) {
			if(num.charAt(num.length()-1) != '.')
				texto.setText(num + '.');
			
		}else {
			// control el caso que el ultimo elemento sea solo un punto
			if(num.charAt(num.length()-1) == '.')
				num = this.texto.getText() + "0";
			}
		aux = Double.parseDouble(num);
		// caso division
		if(e.getSource() == btnOperaciones[0]) {
			// captura de operacion
			signo = '/';
			// captura de numero
			numero = Double.parseDouble(num);
			// cambio del texto
			texto.setText("0");
		}
		// caso caso multiplicacion
		if(e.getSource() == btnOperaciones[1]) {
			// captura de operacion
			signo = '*';
			// captura de numero
			numero = Double.parseDouble(num);
			// cambio del texto
			texto.setText("0");
		}
		// caso restar
		if(e.getSource() == btnOperaciones[2]) {
			// captura de operacion
			signo = '-';
			// captura de numero
			numero = Double.parseDouble(num);
			// cambio del texto
			texto.setText("0");
		}
		
		// caso caso suma
		if(e.getSource() == btnOperaciones[5]) {
			// captura de operacion
			signo = '+';
			// captura de numero
			numero = Double.parseDouble(num);
			// cambio del texto
			texto.setText("0");
		}
		// caso caso =
		if(e.getSource() == btnOperaciones[4]) {
			
			switch(signo) {
			case '/':
				// control division por 0
				if(aux==0) {
					// se muestr ael mensaje de error
					JOptionPane.showMessageDialog(
							this,
							"error division por 0",
							"error",
							JOptionPane.ERROR_MESSAGE
							);
				}else {
					// se realiza el calculo y se muestra el resultado
					texto.setText("" + (numero/aux));
				}
				break;
			case '*':
				texto.setText("" + (numero*aux));
				break;
			case '+':
				texto.setText("" + (numero+aux));
				break;
			case '-':
				texto.setText("" + (numero-aux));
				break;
			}
		}
		
	}
	/**
	 * metodo que realiza las acciones de los numeros
	 * @param e
	 */
	public void casoNumeros(ActionEvent e) {
		// caso de pulsar los numeros
				if(e.getSource() == btnNumeros[0]) {
					// comprobacion que el numero actual no sea 0
					if(!texto.getText().equals("0")) {
						// annade el 0
						texto.setText(texto.getText() + 0);
					}
				}
				// caso nuemero 1
				if(e.getSource() == btnNumeros[1]) {
					// comprobacion que el numero actual no sea 0
					if(!texto.getText().equals("0")) {
						// annade el 0
						texto.setText(texto.getText() + 1);
						// caso que no se halla escrito ningun numero
					}else {
						texto.setText("" + 1);
					}
				}
				// caso numero 2
				if(e.getSource() == btnNumeros[2]) {
					// comprobacion que el numero actual no sea 0
					if(!texto.getText().equals("0")) {
						// annade el 0
						texto.setText(texto.getText() + 2);
					}else {
						texto.setText("" + 2);
					}
				}
				// caso numero 3
				if(e.getSource() == btnNumeros[3]) {
					// comprobacion que el numero actual no sea 0
					if(!texto.getText().equals("0")) {
						// annade el 0
						texto.setText(texto.getText() + 3);
					}else {
						texto.setText("" + 3);
					}
				}
				// caso numero 4
				if(e.getSource() == btnNumeros[4]) {
					// comprobacion que el numero actual no sea 0
					if(!texto.getText().equals("0")) {
						// annade el 0
						texto.setText(texto.getText() + 4);
					}else {
						texto.setText("" + 4);
					}
				}
				// caso numero 5
				if(e.getSource() == btnNumeros[5]) {
					// comprobacion que el numero actual no sea 0
					if(!texto.getText().equals("0")) {
						// annade el 0
						texto.setText(texto.getText() + 5);
					}else {
						texto.setText("" + 5);
					}
				}
				// caso numero 6
				if(e.getSource() == btnNumeros[6]) {
					// comprobacion que el numero actual no sea 0
					if(!texto.getText().equals("0")) {
						// annade el 0
						texto.setText(texto.getText() + 6);
					}else {
						texto.setText("" + 6);
					}
				}
				// caso numero 7
				if(e.getSource() == btnNumeros[7]) {
					// comprobacion que el numero actual no sea 0
					if(!texto.getText().equals("0")) {
						// annade el 0
						texto.setText(texto.getText() + 7);
					}else {
						texto.setText("" + 7);
					}
				}
				// caso numero 8
				if(e.getSource() == btnNumeros[8]) {
					// comprobacion que el numero actual no sea 0
					if(!texto.getText().equals("0")) {
						// annade el 0
						texto.setText(texto.getText() + 8);
					}else {
						texto.setText("" + 8);
					}
				}
				// caso numero 9
				if(e.getSource() == btnNumeros[9]) {
					// comprobacion que el numero actual no sea 0
					if(!texto.getText().equals("0")) {
						// annade el 0
						texto.setText(texto.getText() + 9);
					}else {
						texto.setText("" + 9);
					}
				}
	}
}



















