
package Controlador;

import Modelo.Modelo;
import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Controlador implements ActionListener, ItemListener{
    
    private Modelo modelo;
    private Ventana vista;
    public Controlador (Modelo modelo, Ventana vista){
        this.modelo = modelo;
        this.vista = vista;
        this.vista.setControlador(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(utils.Utils.POSICIONAR)){
            modelo.posicionar();
        }
        if(e.getActionCommand().equals(utils.Utils.REFORZAR)){
         this.modelo.reforzar(this.vista.getComboReforzar().getSelectedItem().toString());
        } 
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
      
        if(e.getSource().equals(this.vista.getComboReforzar())){
            
        }
    }
    
}