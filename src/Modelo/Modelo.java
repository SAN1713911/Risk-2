
package Modelo;

import Vista.Ventana;
import java.util.ArrayList;

public class Modelo {
    private Ventana ventana;
    
    public Modelo(Ventana v){
        this.ventana = v;
    }
    ArrayList<Nodo> rojos = new ArrayList<>();
    ArrayList<Nodo> azules = new ArrayList<>();
    
    public int a = 35;
    public int b = 35;
    
    public int c = a+b;
    public int d = (int) (Math.random()*(6)+1);
    public int e =  (int) (Math.random()*(2)+1);
   
    public void posicionar(){
        //Para nodo 1: Argentina
        String[] vecinos1 = {"2","3"};
        if(e==1){
            rojos.add(new Nodo(260,580,"1",vecinos1));
        }
        else{
            azules.add(new Nodo(260,580,"1",vecinos1));
        }
        //Para nodo 2: Venezuela
        String[] vecinos2 = {"1","2","4"};
        if(e==2){
            rojos.add(new Nodo(230,477,"1",vecinos2));
        }        
        else{
            azules.add(new Nodo(230,477,"1",vecinos2));
        }
        //Para nodo 3: Brazil
        String[] vecinos3 = {"1","2","20"};
        if(e==1){
            rojos.add(new Nodo(300,520,"1",vecinos3));

        }else{
            azules.add(new Nodo(300,520,"1",vecinos3));
        }
        //Para nodo 4: America Central
        String[] vecinos4 = {"2","5"};
        if(e==2){
            rojos.add(new Nodo(155,420,"1",vecinos4));

        }else{
            azules.add(new Nodo(155,420,"1",vecinos4));
        }
        //Para nodo 5: Estados Unidos Occidental
        String[] vecinos5 = {"4","6","7"};
        if(e==1){
            rojos.add(new Nodo(100,285,"1",vecinos5));

        }else{
            azules.add(new Nodo(100,285,"1",vecinos5));
        }
        //Para nodo 6: Estados Unidos Oriental
        String[] vecinos6 = {"5","8","9"};
        if(e==2){
            rojos.add(new Nodo(165,285,"1",vecinos6));

        }else{
            azules.add(new Nodo(165,285,"1",vecinos6));
        }
        //Para nodo 7: Alberta
        String[] vecinos7 = {"5","8","10","11"};
        if(e==1){
            rojos.add(new Nodo(90,185,"1",vecinos7));

        }else{
            azules.add(new Nodo(90,185,"1",vecinos7));
        }
        //Para nodo 8: Ontario
        String[] vecinos8 = {"7","9","11","12"};
        if(e==2){
            rojos.add(new Nodo(155,210,"1",vecinos8));

        }else{
            azules.add(new Nodo(155,210,"1",vecinos8));
        }
        //Para nodo 9: Quebec
        String[] vecinos9 = {"6","8","12"};
        if(e==1){
            rojos.add(new Nodo(200,200,"1",vecinos9));

        }else{
            azules.add(new Nodo(200,200,"1",vecinos9));
        } 
        //Para nodo 10: Alaska (FALTA VECINO DE KAMCHATKA)
        String[] vecinos10 = {"7","11"};
        if(e==2){
            rojos.add(new Nodo(45,90,"1",vecinos10));

        }else{
            azules.add(new Nodo(45,90,"1",vecinos10));
        } 
        //Para nodo 11: Terrirorios noroccidentales
        String[] vecinos11 = {"10","7","8","12"};
        if(e==1){
            rojos.add(new Nodo(90,120,"1",vecinos11));

        }else{
            azules.add(new Nodo(90,120,"1",vecinos11));
        } 
        //Para nodo 12: Groenlandia
        String[] vecinos12 = {"8","9","11"};
        if(e==2){
            rojos.add(new Nodo(265,100,"1",vecinos12));

        }else{
            azules.add(new Nodo(265,100,"1",vecinos12));
        } 
//        //Para nodo 13: Estados Unidos Occidental
//        String[] vecinos13 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        } 
//        //Para nodo 14: Estados Unidos Occidental
//        String[] vecinos14 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        } 
//        //Para nodo 15: Estados Unidos Occidental
//        String[] vecinos15 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        } 
//        //Para nodo 16: Estados Unidos Occidental
//        String[] vecinos16 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        } 
//        //Para nodo 17: Estados Unidos Occidental
//        String[] vecinos17 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        } 
//        //Para nodo 18: Estados Unidos Occidental
//        String[] vecinos18 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        }
//        //Para nodo 19: Estados Unidos Occidental
//        String[] vecinos19 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        }
//        //Para nodo 20: Estados Unidos Occidental
//        String[] vecinos20 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        }
//        //Para nodo 21: Estados Unidos Occidental
//        String[] vecinos21 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        }
//        //Para nodo 22: Estados Unidos Occidental
//        String[] vecinos22 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        }
//        //Para nodo 23: Estados Unidos Occidental
//        String[] vecinos23 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        }
//        //Para nodo 24: Estados Unidos Occidental
//        String[] vecinos24 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        } 
//        //Para nodo 25: Estados Unidos Occidental
//        String[] vecinos25 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        }
//        //Para nodo 26: Estados Unidos Occidental
//        String[] vecinos26 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        } 
//        //Para nodo 27: Estados Unidos Occidental
//        String[] vecinos27 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        }
//        //Para nodo 28: Estados Unidos Occidental
//        String[] vecinos28 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        }
//        //Para nodo 29: Estados Unidos Occidental
//        String[] vecinos29 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        }
//        //Para nodo 30: Estados Unidos Occidental
//        String[] vecinos30 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        }
//        //Para nodo 31: Estados Unidos Occidental
//        String[] vecinos31 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        }
//        //Para nodo 32: Estados Unidos Occidental
//        String[] vecinos32 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        }
//        //Para nodo 33: Estados Unidos Occidental
//        String[] vecinos33 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        }
//        //Para nodo 34: Estados Unidos Occidental
//        String[] vecinos34 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        } 
//        //Para nodo 35: Estados Unidos Occidental
//        String[] vecinos35 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        }
//        //Para nodo 36: Estados Unidos Occidental
//        String[] vecinos36 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        } 
//        //Para nodo 37: Estados Unidos Occidental
//        String[] vecinos37 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        }
//        //Para nodo 38: Estados Unidos Occidental
//        String[] vecinos38 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        }
//        //Para nodo 39: Estados Unidos Occidental
//        String[] vecinos39 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        }
//        //Para nodo 40: Estados Unidos Occidental
//        String[] vecinos40 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        }
//        //Para nodo 41: Estados Unidos Occidental
//        String[] vecinos41 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        } 
//        //Para nodo 42: Estados Unidos Occidental
//        String[] vecinos42 = {"2","5"};
//        if(e==2){
//            rojos.add(new Nodo(155,420,"1",vecinos4));
//
//        }else{
//            azules.add(new Nodo(155,420,"1",vecinos4));
//        } 
        
        
       
        
        
//	for(int i=0;i<a;i++){
//	    Soldado s = new Soldado((int) (Math.random()*(600)+1), (int) (Math.random()*(600)+1));
//	    rojos.add(s);
//	}
//	for(int j=0;j<b;j++){
//	    Soldado s = new Soldado((int) (Math.random()*(600)+1), (int) (Math.random()*(600)+1));
//	    azules.add(s);
//	}
//        ventana.boton1.setEnabled(false);
        updateUI();
    }
    public void jugar(){
        //Para nodo 1: Argentina
        String[] vecinos1 = {"2","3"};
        if(e==1){ 
            rojos.add(new Nodo(260,580, "1",vecinos1));
        }
        else{
            azules.add(new Nodo(260,580,"1",vecinos1));
        }
        //Para nodo 2: Venezuela
        String[] vecinos2 = {"1","2","4"};
        if(e==2){
            rojos.add(new Nodo(230,477,"1",vecinos2));
        }        
        else{
            azules.add(new Nodo(230,477,"1",vecinos2));
        }
        //Para nodo 3: Brazil
        String[] vecinos3 = {"1","2","20"};
        if(e==1){
            rojos.add(new Nodo(300,520,"1",vecinos3));

        }else{
            azules.add(new Nodo(300,520,"1",vecinos3));
        }
        //Para nodo 4: America Central
        String[] vecinos4 = {"2","5"};
        if(e==2){
            rojos.add(new Nodo(155,420,"1",vecinos4));

        }else{
            azules.add(new Nodo(155,420,"1",vecinos4));
        }
        //Para nodo 5: Estados Unidos Occidental
        String[] vecinos5 = {"4","6","7"};
        if(e==1){
            rojos.add(new Nodo(100,285,"1",vecinos5));

        }else{
            azules.add(new Nodo(100,285,"1",vecinos5));
        }
        //Para nodo 6: Estados Unidos Oriental
        String[] vecinos6 = {"5","8","9"};
        if(e==2){
            rojos.add(new Nodo(165,285,"1",vecinos6));

        }else{
            azules.add(new Nodo(165,285,"1",vecinos6));
        }
        //Para nodo 7: Alberta
        String[] vecinos7 = {"5","8","10","11"};
        if(e==1){
            rojos.add(new Nodo(90,185,"1",vecinos7));

        }else{
            azules.add(new Nodo(90,185,"1",vecinos7));
        }
        //Para nodo 8: Ontario
        String[] vecinos8 = {"7","9","11","12"};
        if(e==2){
            rojos.add(new Nodo(155,210,"1",vecinos8));

        }else{
            azules.add(new Nodo(155,210,"1",vecinos8));
        }
        //Para nodo 9: Quebec
        String[] vecinos9 = {"6","8","12"};
        if(e==1){
            rojos.add(new Nodo(200,200,"1",vecinos9));

        }else{
            azules.add(new Nodo(200,200,"1",vecinos9));
        } 
        //Para nodo 10: Alaska (FALTA VECINO DE KAMCHATKA)
        String[] vecinos10 = {"7","11"};
        if(e==2){
            rojos.add(new Nodo(45,90,"1",vecinos10));

        }else{
            azules.add(new Nodo(45,90,"1",vecinos10));
        } 
        //Para nodo 11: Terrirorios noroccidentales
        String[] vecinos11 = {"10","7","8","12"};
        if(e==1){
            rojos.add(new Nodo(90,120,"1",vecinos11));

        }else{
            azules.add(new Nodo(90,120,"1",vecinos11));
        } 
        //Para nodo 12: Groenlandia
        String[] vecinos12 = {"8","9","11"};
        if(e==2){
            rojos.add(new Nodo(265,100,"1",vecinos12));

        }else{
            azules.add(new Nodo(265,100,"1",vecinos12));
        } 
//        c = rojos.size()+azules.size();
//        d = (int) (Math.random()*(c)+1);
//        ventana.texto1.setText(d+" ");
//        
//        if(d>azules.size()){
//            JOptionPane.showMessageDialog(ventana,"Han ganado los rojos");
//            if(azules.isEmpty()){
//                JOptionPane.showMessageDialog(ventana,"Los azules fueron exterminados");
//                 System.exit(0);
//            }else{
//                azules.remove(0);
//            }  
//        }
//        else if(d<azules.size()){
//            JOptionPane.showMessageDialog(ventana,"Han ganado los azules");
//            if(rojos.isEmpty()){
//                JOptionPane.showMessageDialog(ventana,"Los rojos fueron exterminados");
//                System.exit(0);
//            }else{
//                rojos.remove(0);
//            } 
//        }
//        else if(azules.isEmpty()){
//            JOptionPane.showMessageDialog(ventana,"Juego terminado");
//        }
//        else if(rojos.isEmpty()){
//            JOptionPane.showMessageDialog(ventana,"Juego terminado");
//        }
//        updateUI();
    }
    private void updateUI(){
        ventana.getMapa().azules = new ArrayList();
        ventana.getMapa().rojos = new ArrayList();
        
        ventana.getMapa().azules.addAll(azules);
        ventana.getMapa().rojos.addAll(rojos);
        
        ventana.getMapa().repaint();
    }
}