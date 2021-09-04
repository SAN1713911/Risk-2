
package Ejecutar;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Ventana;

public class Main {
    public static void main(String[] args) {
        Ventana v = new Ventana();
        Modelo m = new Modelo(v);
        Controlador c = new Controlador(m, v) {};
        v.setControlador(c);
    } 
}
