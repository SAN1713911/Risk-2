
package Controlador;

import Modelo.Modelo;
import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
    private Modelo modelo;
    private Ventana vista;
    public Controlador (Modelo modelo, Ventana vista){
        this.modelo = modelo;
        this.vista = vista;
        this.vista.setControlador(this);
    }
    //Es para activar la escucha de los eventos
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(utils.Utils.INICIAR)){
            modelo.posicionar();
        }
        if(e.getActionCommand().equals(utils.Utils.JUGAR)){
            modelo.jugar();
        } 
    }
}