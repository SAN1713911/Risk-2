
package Vista;

import Controlador.Controlador;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana extends JFrame {
     
    public JButton boton1 = new JButton("Posicionar");
    public JButton boton2 = new JButton("Jugar");
    public JTextField texto1 = new JTextField();
    public JLabel texto2 = new JLabel("Dado:");
    public Mapa mapa = new Mapa();
    private Controlador c;
    
    public Ventana (){
        this.setBounds(0, 0, 950, 750);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.initComponents();
        this.setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    private void initComponents(){
        this.boton1.setBackground(Color.LIGHT_GRAY);
        this.boton1.setBounds(750, 660, 98, 38);
        this.add(boton1); 
        
        this.boton2.setBackground(Color.LIGHT_GRAY);
        this.boton2.setBounds(650, 660, 98, 38);
        this.add(boton2); 
        
        this.texto1.setBounds(60, 660, 60, 30);
        this.add(texto1);
        this.texto2.setBounds(20, 660, 90, 30);
        this.add(texto2);
        
        this.mapa.setBounds(0, 0, 950, 750);
        this.add(mapa);
        this.mapa.setVisible(true);
    }
    public JButton getBoton1() {
        return boton1;
    }
    public void setBoton1(JButton boton1) {
        this.boton1 = boton1;
    }
    public JButton getBoton2() {
        return boton2;
    }
    public void setBoton2(JButton boton2) {
        this.boton2 = boton2;
    }
    public Controlador getC() {
        return c;
    }
    public void setC(Controlador c) {
        this.c = c;
    }
    public JTextField getTexto1() {
        return texto1;
    }
    public void updateText1(String s) {
        this.texto1.setText(s);
    }

    public JLabel getTexto2() {
        return texto2;
    }

    public void setTexto2(JLabel texto2) {
        this.texto2 = texto2;
    }
    
    //Recibe el controlador y se lo entrega al boton
    public void setControlador(Controlador cont){
        this.c=cont;
        this.boton1.setActionCommand(utils.Utils.INICIAR);
        this.boton2.setActionCommand(utils.Utils.JUGAR);
        this.boton1.addActionListener(this.c);
        this.boton2.addActionListener(this.c);
    }    
    public Mapa getMapa(){
        return mapa;
    }
    
}