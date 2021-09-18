
package Ejecutar;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Ventana;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Ventana v = new Ventana();
        Modelo m = new Modelo(v);
        Controlador c = new Controlador(m, v) {};
        JOptionPane.showMessageDialog(null, "Bienvenido, tiene a su cargo el ejercito azul buena suerte");
        v.boton2.setEnabled(false);
        v.boton3.setEnabled(false);
        v.boton4.setEnabled(false);
        v.ComboReforzar.setEnabled(false);
        v.ComboAtacantes.setEnabled(false);
        v.ComboDefensores.setEnabled(false);
    } 

}
