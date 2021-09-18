package Vista;

import Controlador.Controlador;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Ventana extends JFrame {
    public JButton boton1 = new JButton("Iniciar");
    public JButton boton2 = new JButton("Reforzar");
    public JButton boton3 = new JButton("Atacar");
    public JButton boton4 = new JButton("Reagrupar");
    public JTextField texto1 = new JTextField();
    public JLabel texto2 = new JLabel("País a reforzar");
    public JLabel texto3 = new JLabel("Pais Atacante");
    public JLabel texto4 = new JLabel("Pais Defensor");
    public Mapa mapa = new Mapa();
    
    public JComboBox<String> ComboReforzar = new JComboBox<String>(); 
    public JComboBox<String> ComboAtacantes = new JComboBox<String>(); 
    public JComboBox<String> ComboDefensores = new JComboBox<String>(); 
  
    private Controlador c;
    
    public Ventana (){
        this.setDefaultCloseOperation(WIDTH);
        this.setBounds(0, 0, 950, 750);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.initComponents();
        this.setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    private void initComponents(){
        //Textos 
        this.add(texto2);
        this.texto2.setBounds(20, 425, 100, 30);
        
       this.add(texto3);
        this.texto3.setBounds(20, 500, 100, 30);
       
        this.add(texto4);
        this.texto4.setBounds(20, 575, 170, 30);
        
        //ComboBox Refuerzos Paises
        this.ComboReforzar.setBackground(Color.LIGHT_GRAY);
        this.add(ComboReforzar);
        this.ComboReforzar.setBounds(20, 455, 150, 30);
        this.ComboReforzar.addItem("Argentina");
        this.ComboReforzar.addItem("Venezuela");
        this.ComboReforzar.addItem("Brazil");
        this.ComboReforzar.addItem("America Central");
        this.ComboReforzar.addItem("Estados Unidos Occidental");
        this.ComboReforzar.addItem("Estados Unidos Oriental");
        this.ComboReforzar.addItem("Alberta");
        this.ComboReforzar.addItem("Ontaro");
        this.ComboReforzar.addItem("Quebec");
        this.ComboReforzar.addItem("Alaska");
        this.ComboReforzar.addItem("Territorios noroccidentales");
        this.ComboReforzar.addItem("Groelandia");
        this.ComboReforzar.addItem("Islandia");
        this.ComboReforzar.addItem("Gran Bretaña");
        this.ComboReforzar.addItem("Scandinavia");
        this.ComboReforzar.addItem("Norte de Europa");
        this.ComboReforzar.addItem("Europa Oriental");
        this.ComboReforzar.addItem("Europa del sur");
        this.ComboReforzar.addItem("Egipto");
        this.ComboReforzar.addItem("África del Norte");
        this.ComboReforzar.addItem("Congo");
        this.ComboReforzar.addItem("Este de Africa");
        this.ComboReforzar.addItem("Sudáfrica");
        this.ComboReforzar.addItem("Madagascar");
        this.ComboReforzar.addItem("Ucrania");
        this.ComboReforzar.addItem("Oriente Medio");
        this.ComboReforzar.addItem("Ukrania");
        this.ComboReforzar.addItem("Siberia");
        this.ComboReforzar.addItem("Yakutsk");
        this.ComboReforzar.addItem("Kamchatka");
        this.ComboReforzar.addItem("Afganistan");
        this.ComboReforzar.addItem("Irkustsk");
        this.ComboReforzar.addItem("India");
        this.ComboReforzar.addItem("China");
        this.ComboReforzar.addItem("Mongolia");
        this.ComboReforzar.addItem("Japon");
        this.ComboReforzar.addItem("Siam");
        this.ComboReforzar.addItem("Nueva Guinea");
        this.ComboReforzar.addItem("Indonesia");
        this.ComboReforzar.addItem("El oeste de Australia");
        this.ComboReforzar.addItem("Australia del este");
        this.ComboReforzar.addItem("LotR");
        
        //comboBox paises Atacantes
        this.ComboAtacantes.setBackground(Color.LIGHT_GRAY);
        this.add(ComboAtacantes);
        this.ComboAtacantes.setBounds(20, 530, 150, 30);
        this.ComboAtacantes.addItem("Argentina");
        this.ComboAtacantes.addItem("Venezuela");
        this.ComboAtacantes.addItem("Brazil");
        this.ComboAtacantes.addItem("America Central");
        this.ComboAtacantes.addItem("Estados Unidos Occidental");
        this.ComboAtacantes.addItem("Estados Unidos Oriental");
        this.ComboAtacantes.addItem("Alberta");
        this.ComboAtacantes.addItem("Ontaro");
        this.ComboAtacantes.addItem("Quebec");
        this.ComboAtacantes.addItem("Alaska");
        this.ComboAtacantes.addItem("Territorios noroccidentales");
        this.ComboAtacantes.addItem("Groelandia");
        this.ComboAtacantes.addItem("Islandia");
        this.ComboAtacantes.addItem("Gran Bretaña");
        this.ComboAtacantes.addItem("Scandinavia");
        this.ComboAtacantes.addItem("Norte de Europa");
        this.ComboAtacantes.addItem("Europa Oriental");
        this.ComboAtacantes.addItem("Europa del sur");
        this.ComboAtacantes.addItem("Egipto");
        this.ComboAtacantes.addItem("África del Norte");
        this.ComboAtacantes.addItem("Congo");
        this.ComboAtacantes.addItem("Este de Africa");
        this.ComboAtacantes.addItem("Sudáfrica");
        this.ComboAtacantes.addItem("Madagascar");
        this.ComboAtacantes.addItem("Ucrania");
        this.ComboAtacantes.addItem("Oriente Medio");
        this.ComboAtacantes.addItem("Ukrania");
        this.ComboAtacantes.addItem("Siberia");
        this.ComboAtacantes.addItem("Yakutsk");
        this.ComboAtacantes.addItem("Kamchatka");
        this.ComboAtacantes.addItem("Afganistan");
        this.ComboAtacantes.addItem("Irkustsk");
        this.ComboAtacantes.addItem("India");
        this.ComboAtacantes.addItem("China");
        this.ComboAtacantes.addItem("Mongolia");
        this.ComboAtacantes.addItem("Japon");
        this.ComboAtacantes.addItem("Siam");
        this.ComboAtacantes.addItem("Nueva Guinea");
        this.ComboAtacantes.addItem("Indonesia");
        this.ComboAtacantes.addItem("El oeste de Australia");
        this.ComboAtacantes.addItem("Australia del este");
        this.ComboAtacantes.addItem("LotR");
        
        //comboBox paises Defensores
        this.ComboDefensores.setBackground(Color.LIGHT_GRAY);
        this.add(ComboDefensores);
        this.ComboDefensores.setBounds(20, 605, 150, 30);
        this.ComboDefensores.addItem("Argentina");
        this.ComboDefensores.addItem("Venezuela");
        this.ComboDefensores.addItem("Brazil");
        this.ComboDefensores.addItem("America Central");
        this.ComboDefensores.addItem("Estados Unidos Occidental");
        this.ComboDefensores.addItem("Estados Unidos Oriental");
        this.ComboDefensores.addItem("Alberta");
        this.ComboDefensores.addItem("Ontaro");
        this.ComboDefensores.addItem("Quebec");
        this.ComboDefensores.addItem("Alaska");
        this.ComboDefensores.addItem("Territorios noroccidentales");
        this.ComboDefensores.addItem("Groelandia");
        this.ComboDefensores.addItem("Islandia");
        this.ComboDefensores.addItem("Gran Bretaña");
        this.ComboDefensores.addItem("Scandinavia");
        this.ComboDefensores.addItem("Norte de Europa");
        this.ComboDefensores.addItem("Europa Oriental");
        this.ComboDefensores.addItem("Europa del sur");;
        this.ComboDefensores.addItem("Egipto");
        this.ComboDefensores.addItem("África del Norte");
        this.ComboDefensores.addItem("Congo");
        this.ComboDefensores.addItem("Este de Africa");
        this.ComboDefensores.addItem("Sudáfrica");
        this.ComboDefensores.addItem("Madagascar");
        this.ComboDefensores.addItem("Ucrania");
        this.ComboDefensores.addItem("Oriente Medio");
        this.ComboDefensores.addItem("Ukrania");
        this.ComboDefensores.addItem("Siberia");
        this.ComboDefensores.addItem("Yakutsk");
        this.ComboDefensores.addItem("Kamchatka");
        this.ComboDefensores.addItem("Afganistan");
        this.ComboDefensores.addItem("Irkustsk");
        this.ComboDefensores.addItem("India");
        this.ComboDefensores.addItem("China");
        this.ComboDefensores.addItem("Mongolia");
        this.ComboDefensores.addItem("Japon");
        this.ComboDefensores.addItem("Siam");
        this.ComboDefensores.addItem("Nueva Guinea");
        this.ComboDefensores.addItem("Indonesia");
        this.ComboDefensores.addItem("El oeste de Australia");
        this.ComboDefensores.addItem("Australia del este");
        this.ComboDefensores.addItem("LotR");

        //Botones
        this.boton1.setBackground(Color.LIGHT_GRAY);
        this.boton1.setBounds(755, 660, 98, 38);
        this.add(boton1); 
        
        this.boton2.setBackground(Color.LIGHT_GRAY);
        this.boton2.setBounds(650, 660, 98, 38);
        this.add(boton2); 
        
        this.boton3.setBackground(Color.LIGHT_GRAY);
        this.boton3.setBounds(15, 660, 98, 38);
        this.add(boton3);
        
        this.boton4.setBackground(Color.LIGHT_GRAY);
        this.boton4.setBounds(125, 660, 98, 38);
        this.add(boton4); 

        //Mapa
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

        public JButton getBoton3() {
            return boton3;
        }

        public void setBoton3(JButton boton3) {
            this.boton3 = boton3;
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
    public void setControlador(Controlador cont){
        this.c=cont;
        this.boton1.setActionCommand(utils.Utils.INICIAR);
        this.boton2.setActionCommand(utils.Utils.REFORZAR);
        this.boton3.setActionCommand(utils.Utils.ATACAR);
        this.boton4.setActionCommand(utils.Utils.REAGRUPAR);
        
        this.boton1.addActionListener(this.c);
        this.boton2.addActionListener(this.c);
        this.boton3.addActionListener(this.c);
        this.boton4.addActionListener(this.c);
        this.ComboReforzar.addItemListener(this.c);
        this.ComboAtacantes.addItemListener(this.c);
        this.ComboDefensores.addItemListener(this.c);
    }    
    public Mapa getMapa(){
        return mapa;
    }

    public JComboBox<String> getComboReforzar() {
        return ComboReforzar;
    }

    public void setComboReforzar(JComboBox<String> ComboReforzar) {
        this.ComboReforzar = ComboReforzar;
    }

    public JComboBox<String> getComboAtacantes() {
        return ComboAtacantes;
    }

    public JComboBox<String> getComboDefesores() {
        return ComboDefensores;
    }    
}