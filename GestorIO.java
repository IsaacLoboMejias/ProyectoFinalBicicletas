/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Isaac
 */
import javax.swing.JOptionPane;

public class GestorIO {

    //Metodo para solicitar un String
    public String solicitarString(String mensaje) {
        String hilera = JOptionPane.showInputDialog(null, mensaje);
        return hilera;
    }

    //Metodo para solicitar un numero con decimales
    public double solicitarDouble(String mensaje) {
        double numeroDecima = Double.parseDouble(JOptionPane.showInputDialog(null, mensaje));
        return numeroDecima;
    }

    //Metodo para solicitar un numero entero
    public int solicitarInt(String mensaje) {
        int numeroEntero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        return numeroEntero;
    }

    //Metodo para solicitar un caracter
    public char solicitarChar(String mensaje) {
        String hilera = JOptionPane.showInputDialog(null, mensaje);
        char caracter = hilera.charAt(0);
        return caracter;
    }

    //Metodo para mostrar una hilera de texto
    public void desplegarString(String mensaje) {
      JOptionPane.showMessageDialog(null, mensaje);
    }

}