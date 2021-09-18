
package Vista;

import Modelo.Nodo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Mapa extends JPanel{
    public ArrayList<Nodo> rojos = new ArrayList<>();
    public ArrayList<Nodo> azules = new ArrayList<>();
    
    public Mapa () {
        this.setSize(800,800);
        this.setVisible(true);
    }
    
    private Image imagen;
    @Override
    public void paint (Graphics g){
        imagen = new ImageIcon(getClass().getResource("/Imagen/Map.jpg")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this );
        setOpaque(false);
        super.paint(g);
 
        for(int i=0; i<rojos.size(); i++){
            String soldados = String.valueOf(rojos.get(i).getSoldados());
            g.setColor(Color.RED);
            g.fillOval(rojos.get(i).getX(), rojos.get(i).getY(), 13,13);
            g.drawString(soldados, rojos.get(i).getX(), rojos.get(i).getY());
        }
        for(int i=0; i<azules.size(); i++){
            String soldados = String.valueOf(azules.get(i).getSoldados());
            g.setColor(Color.BLUE);
            g.fillOval(azules.get(i).getX(), azules.get(i).getY(), 13,13);
            g.drawString(soldados, azules.get(i).getX(), azules.get(i).getY());
        }
    }
    public ArrayList<Nodo> getRojos(){
    	return this.rojos;
    }
    public ArrayList<Nodo> getAzules(){
    	return this.azules;
    }
    public void setRojos(ArrayList<Nodo> lista) {
        this.rojos = rojos;
    }
    public void setAzules(ArrayList<Nodo> lista) {
        this.azules = azules;
    }
}
