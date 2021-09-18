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
        if(e.getActionCommand().equals(utils.Utils.INICIAR)){
            modelo.iniciar();
        }
        if(e.getActionCommand().equals(utils.Utils.REFORZAR)){
            this.modelo.reforzar(this.vista.getComboReforzar().getSelectedItem().toString());
        } 
        if(e.getActionCommand().equals(utils.Utils.ATACAR)){
            this.vista.texto4.setText("Pais a atacar");
            this.modelo.atacar(this.vista.getComboAtacantes().getSelectedItem().toString(), (this.vista.getComboDefesores().getSelectedItem().toString()));
        }
        if(e.getActionCommand().equals(utils.Utils.REAGRUPAR)){
            this.vista.texto4.setText("Pais a reagrupar");
            this.modelo.reagrupar(this.vista.getComboAtacantes().getSelectedItem().toString(), (this.vista.getComboDefesores().getSelectedItem().toString()));
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {  
        if(e.getSource().equals(this.vista.getComboReforzar())){
        }
        if(e.getSource().equals(this.vista.getComboAtacantes())){
        }
    }
}