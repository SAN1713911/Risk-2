
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
    
    private Image imagen;
    @Override
    public void paint (Graphics g){
        imagen = new ImageIcon(getClass().getResource("/Imagen/Map.jpg")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this );
        setOpaque(false);
        super.paint(g);
        
        for(int i=0; i<rojos.size(); i++){
            g.setColor(Color.RED);
            g.fillOval(rojos.get(i).getX(), rojos.get(i).getY(), 13,13);
            g.drawString(rojos.get(i).getSoldados(), rojos.get(i).getX(), rojos.get(i).getY());
        }
        for(int i=0; i<azules.size(); i++){
            g.setColor(Color.BLUE);
            g.fillOval(azules.get(i).getX(), azules.get(i).getY(), 13,13);
            g.drawString(azules.get(i).getSoldados(), azules.get(i).getX(), azules.get(i).getY());
        }
        
//        for(int i=0; i<rojos.size();i++) {
//            g.fillOval(rojos.get(i).getX(),rojos.get(i).getY(), 13,13);
//        }
//        g.setColor(Color.BLUE);
//	for(int j=0; j<azules.size();j++) {
//            g.fillOval(azules.get(j).getX(),azules.get(j).getY(), 13,13);
//        }
        if(!rojos.isEmpty())
        {
//            g.drawLine(220, 540, 420, 240);
//            g.drawString("5", 320, 370);
//            g.drawLine(220, 530, 620, 530);
//            g.drawString("7", 420, 520);
//            g.drawLine(230, 540, 420, 830);
//            g.drawString("2", 305, 695);
//            g.drawLine(420, 830, 620, 530);
//            g.drawString("3", 535, 695);
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
