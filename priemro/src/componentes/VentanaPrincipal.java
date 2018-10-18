package componentes;

import java.awt.Checkbox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
/**
 * clase que define y crea una ventana
 * @author Javier Gonzalez Rives
 *
 */
public class VentanaPrincipal extends JFrame implements ActionListener{
	private JPanel panelContenedor;
	private JLabel lbTitulo,etiquetalb,lbBotton,lbTongleButton/*,lbCheckBox*/;
	private JButton btBoton;
	private JCheckBox chb1,chb2;
	private JRadioButton rd1,rd2;
	private ButtonGroup grupo;
	private JToggleButton tbtBoton;
	private JComboBox<String> cb1;
	private JSeparator sVert,sHorz;
	private JSlider sl1;
	
	/**
	 * metodo constructor que define los parametros de la ventana
	 */
	public VentanaPrincipal() {
		super("paneles atomicos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,630,250);
		setResizable(false);
		init();
	}
	/**
	 * metodo que incicaliza los elementos de la ventana
	 */
	private void init() {
		panelContenedor = new JPanel();
		// el panel tendra layout nulo para colocar a mano :::···333
		panelContenedor.setLayout(null);
		// crear etiqueta// cambio de fuente// cambio de dimensiones
		lbTitulo = new JLabel("Componentes atomicos");
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lbTitulo.setBounds(180,5,380,40);
		//etiquetalb
		etiquetalb = new JLabel("etiqueta");
		etiquetalb.setBounds(20,50,280,23);
		//lbBotton
		lbBotton = new JLabel("boton");
		
		lbBotton.setBounds(20,8,280,23);
		//lbTonggleButton
		lbTongleButton = new JLabel("toggle");
		lbTongleButton.setBounds(20,170,280,40);
		// definicion boton
		btBoton = new JButton("boton");
		btBoton.setBounds(80, 80, 80, 23);
		btBoton.addActionListener(this);
		// creacion de chb1
		chb1 = new JCheckBox("check1");
		chb1.setBounds(100, 110, 80, 23);
		chb2 = new JCheckBox("check2");
		chb2.setBounds(180, 110, 80, 23);
		// radio
		rd1 = new JRadioButton("radio1");
		rd1.setBounds(100, 140, 80, 23);
		rd2 = new JRadioButton("radio2");
		rd2.setBounds(190, 140, 80, 23);
		grupo = new ButtonGroup();
		grupo.add(rd1);
		grupo.add(rd2);
		// toggle button
		tbtBoton = new JToggleButton("togglebotonhico");
		tbtBoton.setBounds(120, 180, 80, 23);
		// combo box
		
		String[] opciones = {"opcion1","opcion2","opcion3"};
		cb1 = new JComboBox<String>(opciones);
		cb1.setBounds(430, 50, 100, 23);
		cb1.setSelectedItem("opcion2");
		//separadores
		sVert = new JSeparator(JSeparator.VERTICAL);
		sVert.setBounds(300, 60, 10, 200);
		sHorz = new JSeparator(JSeparator.HORIZONTAL);
		sHorz.setBounds(430, 92, 100, 5);
		//Slider
		sl1 = new JSlider(JSlider.HORIZONTAL,0,100,50);
		sl1.setBounds(430, 140, 100, 30);
		sl1.setPaintTicks(true);
		sl1.setMajorTickSpacing(10);
		sl1.setMinorTickSpacing(5);
		sl1.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				etiquetalb.setText(sl1.getValue() + "");
				
			}
		});
		// ADDS###############################
		panelContenedor.add(lbTitulo);
		panelContenedor.add(etiquetalb);
		panelContenedor.add(lbBotton);
		panelContenedor.add(lbTongleButton);
		panelContenedor.add(btBoton);
		panelContenedor.add(chb1);
		panelContenedor.add(chb2);
		panelContenedor.add(rd1);
		panelContenedor.add(rd2);
		panelContenedor.add(tbtBoton);
		panelContenedor.add(cb1);
		panelContenedor.add(sVert);
		panelContenedor.add(sHorz);
		panelContenedor.add(sl1);
		this.add(panelContenedor);
	}
	/**
	 * mrtodo que comprueba que datos estan seleccionados
	 */
	public String formatOutput() {
		String cadena = new String();
		// comprobacion que el check esta seleccionado
		if(chb1.isSelected()) {
			cadena += "check1\n";
		}
		// check2
		if(chb2.isSelected()) {
			cadena +="check2\n";
		}
		// radios
		// radio1
		if(rd1.isSelected()) {
			cadena += "radio1\n";
		}
		// radio2
		if(rd2.isSelected()) {
			cadena += "radio2\n";
		}
		// toggle
		if(tbtBoton.isSelected()) {
			cadena += "toggleButton\n";
		}
		return cadena;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// si se pulsa el boton
		if(e.getSource() == btBoton) {
			String salida = formatOutput();
			salida += (String)cb1.getSelectedItem() + "\n";
			salida += sl1.getValue() + "\n";
			JOptionPane.showMessageDialog(this, salida, "info componentes", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
