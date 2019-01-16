/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponenteMiTexto;


import java.io.Serializable;

import java.awt.Color;


import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.Serializable;
import javax.swing.JTextField;
/**
*
* @author Edgardo Capallo
*/
public class ComponenteTexto extends JTextField implements Serializable {
private int ancho;
private String tipo;
private Color color;
private Font fuente;




//Cantidad de caracteres
//Tipo de variable
//Color de texto
//Fuente de texto
//Constructor (Establece los valores por defecto al instanciar la clase ComponenteTexto
public ComponenteTexto() {
this.ancho=5;
this.tipo="Texto";
this.color=Color.BLACK;
this.fuente=new Font("Agency FB", Font.BOLD, 14);
this.setText("");
this.gestionaEntrada(); //Gestiona la entrada por teclado
}
/**
* Obtiene el color
* @return devuelve el valor correspondiente al color
*/
public Color getColor() {
return color;
}
/**
* Asigna el valor a color
* @param color es el nuevo valor a asignar
*/
public void setColor(Color color) {
this.color = color;
this.setForeground(color);
}
/**
* Devuelve el valor del ancho
* @return devuelve el valor de ancho
*/
public int getAncho() {
return ancho;
}
/**
* Asigna el valor al ancho
* @param ancho es el nuevo valor a asignar
*/
public void setAncho(int ancho) {
this.ancho = ancho;
super.setColumns(ancho);
}
/**
* devuelve el valor de fuente
* @return devuelve el valor de fuente
*/
public Font getFuente() {
return fuente;
}
/**
* Asigna el valor a fuente
* @param fuente nuevo valor a asignar
*/
public void setFuente(Font fuente) {
this.fuente = fuente;
this.setFont(fuente);
}
/**
* Obtiene el tipo
* @return devuelve el tipo
*/
public String getTipo() {
return tipo;
}
/**
* Asigna el tipo
* @param tipo nuevo valor a asignar
*/
public void setTipo(String tipo) {
if ( tipo.equals("Entero") || tipo.equals("Texto"))
this.tipo = tipo;
}
//Redefine el método setText para interpretar las nuevas variables (Entero y SN)
@Override
public void setText(String text) {
switch (tipo) {
case "Entero":
try{
Integer.parseInt(text);
super.setText(text);
}
catch (NumberFormatException e){
super.setText("");
}
break;
default:
super.setText(text); //asume el texto definido en las propiedades del componente
break;
}
}
public String getText() {
return super.getText();
}
/**
* Gestiona la entrada por teclado de los distintos tipos
*/
public final void gestionaEntrada() {
this.addKeyListener(new KeyAdapter() {
@Override
public void keyTyped(KeyEvent e) {
char caracter = e.getKeyChar();
switch (tipo) {
case "Entero":
if (!(Character.isDigit(caracter)
|| (getText().length()>=ancho)))
{
e.consume();
}
break;
case "Texto":
//Limita el ingreso al ancho establecido
if (getText().length()>=ancho) e.consume();
break;
}
}
});
}
}