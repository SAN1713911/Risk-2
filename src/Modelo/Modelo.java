package Modelo;

import Vista.Ventana;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Modelo {
    private Ventana ventana;
    
    ArrayList<Nodo> rojos = new ArrayList<>();
    ArrayList<Nodo> azules = new ArrayList<>();

    public Modelo(Ventana v) {
        this.ventana = v;
    }

    int soldados = 1;
    int refuerzos = 1;
    public int a = 111;
    public int x = 111;
    public int b = (int) (Math.random() * (2) + 1);
   
    public void iniciar(){
        ventana.boton2.setEnabled(true);
        ventana.ComboReforzar.setEnabled(true);
        
        //Para nodo 1: Argentina
        String[] vecinos1 = {"2", "3"};
        if (b == 1) {
            rojos.add(new Nodo(260, 580, soldados, vecinos1, "Argentina"));
        } else {
            azules.add(new Nodo(260, 580, soldados, vecinos1, "Argentina"));
        }
        
        //Para nodo 2: Venezuela
        String[] vecinos2 = {"1", "2", "4"};
        if (b == 2) {
            rojos.add(new Nodo(230, 477, soldados, vecinos2, "Venezuela"));
        } else {
            azules.add(new Nodo(230, 477, soldados, vecinos2, "Venezuela"));
        }
        //Para nodo 3: Brazil
        String[] vecinos3 = {"1", "2", "20"};
        if (b == 1) {
            rojos.add(new Nodo(300, 520, soldados, vecinos3, "Brazil"));

        } else {
            azules.add(new Nodo(300, 520, soldados, vecinos3, "Brazil"));
        }
        //Para nodo 4: America Central
        String[] vecinos4 = {"2", "5"};
        if (b == 2) {
            rojos.add(new Nodo(140, 410, soldados, vecinos4, "America Central"));

        } else {
            azules.add(new Nodo(140, 410, soldados, vecinos4, "America Central"));
        }
        //Para nodo 5: Estados Unidos Occidental
        String[] vecinos5 = {"4", "6", "7"};
        if (b == 1) {
            rojos.add(new Nodo(100, 310, soldados, vecinos5, "Estados Unidos Occidental"));

        } else {
            azules.add(new Nodo(100, 310, soldados, vecinos5, "Estados Unidos Occidental"));
        }
        //Para nodo 6: Estados Unidos Oriental
        String[] vecinos6 = {"5", "8", "9"};
        if (b == 2) {
            rojos.add(new Nodo(180, 285, soldados, vecinos6, "Estados Unidos Oriental"));

        } else {
            azules.add(new Nodo(180, 285, soldados, vecinos6, "Estados Unidos Oriental"));
        }
        //Para nodo 7: Alberta
        String[] vecinos7 = {"5", "8", "10", "11"};
        if (b == 1) {
            rojos.add(new Nodo(90, 185, soldados, vecinos7, "Alberta"));

        } else {
            azules.add(new Nodo(90, 185, soldados, vecinos7, "Alberta"));
        }
        //Para nodo 8: Ontario
        String[] vecinos8 = {"7", "9", "11", "12"};
        if (b == 2) {
            rojos.add(new Nodo(155, 210, soldados, vecinos8, "Ontaro"));

        } else {
            azules.add(new Nodo(155, 210, soldados, vecinos8, "Ontaro"));
        }
        //Para nodo 9: Quebec
        String[] vecinos9 = {"6", "8", "12"};
        if (b == 1) {
            rojos.add(new Nodo(200, 200, soldados, vecinos9, "Quebec"));

        }else {
            azules.add(new Nodo(200, 200, soldados, vecinos9, "Quebec"));
        }
        //Para nodo 10: Alaska (FALTA VECINO DE KAMCHATKA)
        String[] vecinos10 = {"7", "11"};
        if (b == 2) {
            rojos.add(new Nodo(45, 90, soldados, vecinos10, "Alaska"));
        } else {
            azules.add(new Nodo(45, 90, soldados, vecinos10, "Alaska"));
        }
        //Para nodo 11: Terrirorios noroccidentales
        String[] vecinos11 = {"10", "7", "8", "12"};
        if (b == 1) {
            rojos.add(new Nodo(90, 120, soldados, vecinos11, "Territorios noroccidentales"));
        } else {
            azules.add(new Nodo(90, 120, soldados, vecinos11, "Territorios noroccidentales"));
        }
        //Para nodo 12: Groenlandia
        String[] vecinos12 = {"8", "9", "11"};
        if (b == 2) {
            rojos.add(new Nodo(265, 100, soldados, vecinos12, "Groelandia"));

        }else {
            azules.add(new Nodo(265, 100, soldados, vecinos12, "Groelandia"));
        }
         //Para nodo 13: Islandia
        String[] vecinos13 = {"12","14"};
        if (b == 1) {
            rojos.add(new Nodo(390, 145, soldados, vecinos13, "Islandia"));

        } else {
            azules.add(new Nodo(390, 145, soldados, vecinos13, "Islandia"));
        }
        
        //Para nodo 14: Gran Bretaña
        String[] vecinos14 = {"13","15","16","17"};
        if (b == 2) {
            rojos.add(new Nodo(440, 180, soldados, vecinos14, "Gran Bretaña"));

        } else {
            azules.add(new Nodo(440, 180, soldados, vecinos14, "Gran Bretaña"));
        }
        
         //Para nodo 15: Scandinavia
        String[] vecinos15 = {"14","25"};
        if (b == 1) {
            rojos.add(new Nodo(495, 120, soldados, vecinos15, "Scandinavia"));

        } else {
            azules.add(new Nodo(495, 120, soldados, vecinos15, "Scandinavia"));
        }

        //Para nodo 16: Norte de Europa
        String[] vecinos16 = {"14","17","18","25"};
        if(b==2){
           rojos.add(new Nodo(475, 215, soldados, vecinos16, "Norte de Europa"));

        } else {
            azules.add(new Nodo(475, 215, soldados, vecinos16, "Norte de Europa"));
        }
        
        //Para nodo 17: Europa Oriental
        String[] vecinos17 = {"14","16","18","20"};
        if(b==1){
           rojos.add(new Nodo(450, 245, soldados, vecinos17, "Europa Oriental"));

        } else {
            azules.add(new Nodo(450, 245, soldados, vecinos17, "Europa Oriental"));
        }
        
       //Para nodo 18: Europa del sur
        String[] vecinos18 = {"14","16","18","20"};
        if(b==2){
           rojos.add(new Nodo(480, 255, soldados, vecinos18, "Europa del sur"));

        } else {
            azules.add(new Nodo(480, 255, soldados, vecinos18, "Europa del sur"));
        }
        
       //Para nodo 19: Egipto
        String[] vecinos19 = {"18","20","21","26"};
        if(b==1){
           rojos.add(new Nodo(510, 360, soldados, vecinos19, "Egipto"));

        } else {
            azules.add(new Nodo(510, 360, soldados, vecinos19, "Egipto"));
        }
        
        
       //Para nodo 20: África del Norte
        String[] vecinos20 = {"17","28","19","21"};
        if(b==2){
           rojos.add(new Nodo(450, 360, soldados, vecinos20, "África del Norte"));

        } else {
            azules.add(new Nodo(450, 360, soldados, vecinos20, "África del Norte"));
        }
        //Para nodo 21: Congo
        String[] vecinos21 = {"19","20","22","23"};
        if(b==1){
           rojos.add(new Nodo(510, 460, soldados, vecinos21, "Congo"));

        } else {
            azules.add(new Nodo(510, 460, soldados, vecinos21, "Congo"));
        }
        
        //Para nodo 22: Este de Africa
        String[] vecinos22 = {"19","21","23","24"};
        if(b==2){
           rojos.add(new Nodo(555, 460, soldados, vecinos22, "Este de Africa"));

        } else {
            azules.add(new Nodo(555, 460, soldados, vecinos22, "Este de Africa"));
        }
        
        //Para nodo 23: Sudáfrica
        String[] vecinos23 = {"21","22","24"};
        if(b==1){
           rojos.add(new Nodo(525, 585, soldados, vecinos23, "Sudáfrica"));

        } else {
            azules.add(new Nodo(525, 585, soldados, vecinos23, "Sudáfrica"));
        }
        //Para nodo 24: Madagascar
        String[] vecinos24 = {"22","23"};
        if(b==2){
           rojos.add(new Nodo(600, 550, soldados, vecinos24, "Madagascar"));

        } else {
            azules.add(new Nodo(600, 550, soldados, vecinos24, "Madagascar"));
        }
        
        //Para nodo 25: Ucrania
        String[] vecinos25 = {"15","16","18","26","27","31"};
        if(b==1){
           rojos.add(new Nodo(545, 215, soldados, vecinos25, "Ucrania"));

        } else {
            azules.add(new Nodo(545, 215, soldados, vecinos25, "Ucrania"));
        }
        
        //Para nodo 26: Oriente Medio
        String[] vecinos26 = {"19","25","31","33"};
        if(b==2){
           rojos.add(new Nodo(580, 310, soldados, vecinos26, "Oriente Medio"));

        } else {
            azules.add(new Nodo(580, 310, soldados, vecinos26, "Oriente Medio"));
        }
        
       //Para nodo 27: Ukrania
        String[] vecinos27 = {"25","28","31"};
        if(b==1){
           rojos.add(new Nodo(645, 150, soldados, vecinos27, "Ukrania"));

        } else {
            azules.add(new Nodo(645, 150, soldados, vecinos27, "Ukrania"));
        }
        
        //Para nodo 28: Siberia
        String[] vecinos28 = {"27","29","31","32","34","35"};
        if(b==2){
           rojos.add(new Nodo(695, 150, soldados, vecinos28, "Siberia"));

        } else {
            azules.add(new Nodo(695, 150, soldados, vecinos28, "Siberia"));
        }
        
       //Para nodo 29: yakutsk
        String[] vecinos29 = {"28","30","32"};
        if(b==1){
           rojos.add(new Nodo(750, 80, soldados, vecinos29, "Yakutsk"));

        } else {
            azules.add(new Nodo(750, 80, soldados, vecinos29, "Yakutsk"));
        }
        
       //Para nodo 30: kamchatka
        String[] vecinos30 = {"29","32","35","36"};
        if(b==2){
           rojos.add(new Nodo(830, 80, soldados, vecinos30, "Kamchatka"));

        } else {
            azules.add(new Nodo(830, 80, soldados, vecinos30, "Kamchatka"));
        }
        
       //Para nodo 31: Afganistan
        String[] vecinos31 = {"25","26","27","28","33","34"};
        if(b==1){
           rojos.add(new Nodo(645, 240, soldados, vecinos31, "Afganistan"));

        } else {
            azules.add(new Nodo(645, 240, soldados, vecinos31, "Afganistan"));
        }
        
        //Para nodo 32: Irkustsk
        String[] vecinos32 = {"28","29","30","35"};
        if(b==2){
           rojos.add(new Nodo(758, 146, soldados, vecinos32, "Irkustsk"));

        } else {
            azules.add(new Nodo(758, 146, soldados, vecinos32, "Irkustsk"));
        }
        
      //Para nodo 33: India
        String[] vecinos33 = {"26","31","34","37"};
        if(b==1){
           rojos.add(new Nodo(645, 320, soldados, vecinos33, "India"));

        } else {
            azules.add(new Nodo(645, 320, soldados, vecinos33, "India"));
        }
        
        //Para nodo 34: China
        String[] vecinos34 = {"28","31","33","35","37"};
        if(b==2){
           rojos.add(new Nodo(695, 290, soldados, vecinos34, "China"));

        } else {
            azules.add(new Nodo(695, 290, soldados, vecinos34, "China"));
        }
        
      //Para nodo 35: Mongolia
        String[] vecinos35 = {"28","32","34","36"};
        if(b==1){
           rojos.add(new Nodo(758, 220, soldados, vecinos35, "Mongolia"));

        } else {
            azules.add(new Nodo(758, 220, soldados, vecinos35, "Mongolia"));
        }
        
       //Para nodo 36: Japon
        String[] vecinos36 = {"30","35"};
        if(b==2){
           rojos.add(new Nodo(830, 260, soldados, vecinos36, "Japon"));

        } else {
            azules.add(new Nodo(830, 260, soldados, vecinos36, "Japon"));
        }
        
        //Para nodo 37: Siam
        String[] vecinos37 = {"30","35"};
        if(b==1){
           rojos.add(new Nodo(740, 365, soldados, vecinos37, "Siam"));

        } else {
            azules.add(new Nodo(740, 365, soldados, vecinos37, "Siam"));
        }

       //Para nodo 38: Indonesia
        String[] vecinos38 = {"37","39","40"};
        if(b==2){
           rojos.add(new Nodo(745, 450, soldados, vecinos38, "Indonesia"));

        } else {
            azules.add(new Nodo(750, 450, soldados, vecinos38, "Indonesia"));
        }
        
       //Para nodo 39: Nueva Guinea
        String[] vecinos39 = {"38","40","41"};
        if(b==1){
           rojos.add(new Nodo(845, 450, soldados, vecinos39, "Nueva Guinea"));

        } else {
            azules.add(new Nodo(845, 450, soldados, vecinos39, "Nueva Guinea"));
        }
       //Para nodo 40: El oeste de Australia
        String[] vecinos40 = {"38","39","41"};
        if(b==2){
           rojos.add(new Nodo(815, 530, soldados, vecinos40, "El oeste de Australia"));

        } else {
            azules.add(new Nodo(815, 530, soldados, vecinos40, "El oeste de Australia"));
        }
        
        //Para nodo 41: Australia del este
        String[] vecinos41 = {"39","40","42"};
        if(b==1){
           rojos.add(new Nodo(860, 530, soldados, vecinos41, "Australia del este"));

        } else {
            azules.add(new Nodo(860, 530, soldados, vecinos41, "Australia del este"));
        }
       //Para nodo 42: LotR
        String[] vecinos42 = {"41"};
        if(b==1){
           rojos.add(new Nodo(920, 595, soldados, vecinos42, "LotR"));

        } else {
            azules.add(new Nodo(920, 595, soldados, vecinos42, "LotR"));
        }

        ventana.boton1.setEnabled(false);
        updateUI();
    }
    public void reforzar(String pais) {
        ventana.boton3.setEnabled(false);
        ventana.ComboAtacantes.setEnabled(false);
        ventana.ComboDefensores.setEnabled(false);
        
        boolean condicion=true;
        for(int i = 0; i < rojos.size(); i++) {
            if (rojos.get(i).getNombre().equals(pais)) {
                condicion=false;
                JOptionPane.showMessageDialog(null, "El territorio no le pertenece");
            }
        }
        if(condicion==true){
            int y = (int)(Math.random()*(rojos.size())+1);
            rojos.get(y).setSoldados(rojos.get(y).getSoldados()+1);
            x=x-1;
            if(x==0){
                JOptionPane.showMessageDialog(null, "Los rojos han exedido los refuerzos disponibles");
            }
            
        }
        
        for(int i = 0; i < azules.size(); i++) {
            if(azules.get(i).getNombre().equals(pais)){
                azules.get(i).setSoldados(azules.get(i).getSoldados() + 1);
                a=a-1;
                if(a==0){
                    JOptionPane.showMessageDialog(null, "Ha exedido los refuerzos disponibles");
                    ventana.boton2.setEnabled(false);
                    ventana.boton3.setEnabled(true);
                    ventana.ComboReforzar.setEnabled(false);
                    ventana.ComboAtacantes.setEnabled(true);
                    ventana.ComboDefensores.setEnabled(true);
                }
            }
        }
        updateUI();
    }

    public void atacar(String Atacante, String Defensor) {
        int t = azules.size()+rojos.size();
        int dado = (int) (Math.random() * (t) + 1);
        boolean a=false;
        boolean b=false;
        boolean c=false;
        boolean d=false;
        
        for(int i=0; i<azules.size(); i++){
            if(azules.get(i).getNombre().equals(Defensor)){
                a=true;
            }else if(azules.get(i).getNombre().equals(Atacante)){
                b=true;
            }
        }
        for(int i=0; i<rojos.size(); i++){   
            if(rojos.get(i).getNombre().equals(Defensor)){
                c=true;
            }else if(rojos.get(i).getNombre().equals(Atacante)){
                d=true;
            }
        }
        if(a==true && b==true || c==true && d==true){
            JOptionPane.showMessageDialog(ventana, "No es posible atacar al mismo bando");
        }
        else{
            if(rojos.isEmpty()) {
                JOptionPane.showMessageDialog(ventana, "Los rojos fueron exterminados");
                System.exit(0);
            }
            else if(azules.isEmpty()) {
                JOptionPane.showMessageDialog(ventana, "Los azules fueron exterminados");
                System.exit(0);
            }
            else{
                if(dado>azules.size()){
                    for (int i = 0; i < azules.size(); i++) {
                        if(azules.get(i).getNombre().equals(Atacante)) {
                            azules.get(i).setSoldados(azules.get(i).getSoldados() - 1);
                        }
                        if(azules.get(i).getNombre().equals(Defensor)) {
                            azules.get(i).setSoldados(azules.get(i).getSoldados() - 1);
                        }
                        if(azules.get(i).getSoldados()==0){
                            soldados=1;
                            rojos.add(new Nodo(azules.get(i).getX(), azules.get(i).getY(), soldados, azules.get(i).getVecinoslista(), Defensor));
                            azules.remove(i);
                            JOptionPane.showMessageDialog(ventana, "El ejercito rojo ha conquistado "+ Defensor);
                            JOptionPane.showMessageDialog(ventana, "El ejercito rojo debe mover sus unidades a "+ Defensor);
                            ventana.ComboAtacantes.setEnabled(false);
                            ventana.ComboDefensores.setEnabled(false);
                            ventana.boton3.setEnabled(true);
                            ventana.boton4.setEnabled(true);
                            atacar(Atacante, Defensor);
                            if(azules.size()==6){
                                JOptionPane.showMessageDialog(ventana, "El ejercito rojo ha conquistado la mitad del mundo ");
                            }
                        }
                        if(azules.get(i).getSoldados()==0 && azules.get(i).getNombre().equals(Atacante)){
                            soldados=1;
                            rojos.add(new Nodo(azules.get(i).getX(), azules.get(i).getY(), soldados, rojos.get(i).getVecinoslista(), Defensor));
                            azules.remove(i);
                            JOptionPane.showMessageDialog(ventana, "El ejercito rojo ha conquistado "+ Atacante);
                            JOptionPane.showMessageDialog(ventana, "El ejercito rojo debe mover sus unidades a "+ Atacante);
                            ventana.ComboAtacantes.setEnabled(false);
                            ventana.ComboDefensores.setEnabled(false);
                            ventana.boton3.setEnabled(true);
                            ventana.boton4.setEnabled(true);
                            atacar(Atacante, Defensor);
                        }
                        if(azules.get(i).getSoldados()==0 && rojos.get(i).getSoldados()==0){
                            JOptionPane.showMessageDialog(ventana, "Empate");
                        }
                    }
                    dado=0;
                }
                else if(dado<azules.size()) {
                    for(int i = 0; i < rojos.size(); i++) {
                        if(rojos.get(i).getNombre().equals(Defensor)) {
                            rojos.get(i).setSoldados(rojos.get(i).getSoldados() - 1);
                        }
                        if(rojos.get(i).getNombre().equals(Atacante)) {
                            rojos.get(i).setSoldados(rojos.get(i).getSoldados() - 1);
                        }
                        if(rojos.get(i).getSoldados()==0){
                            soldados=1;
                            azules.add(new Nodo(rojos.get(i).getX(), rojos.get(i).getY(), soldados, rojos.get(i).getVecinoslista(), Defensor));
                            rojos.remove(i);
                            JOptionPane.showMessageDialog(ventana, "El ejercito azul ha conquistado "+ Defensor);
                            JOptionPane.showMessageDialog(ventana, "El ejercito azul debe mover sus unidades a "+ Defensor);
                            ventana.ComboAtacantes.setEnabled(false);
                            ventana.ComboDefensores.setEnabled(false);
                            ventana.boton3.setEnabled(true);
                            ventana.boton4.setEnabled(true);
                            atacar(Atacante, Defensor);
                            if(rojos.size()==6){
                                JOptionPane.showMessageDialog(ventana, "El ejercito azul ha conquistado la mitad del mundo ");
                            }
                            
                        }
                        if(rojos.get(i).getSoldados()==0 && rojos.get(i).getNombre().equals(Atacante)){
                            soldados=1;
                            azules.add(new Nodo(rojos.get(i).getX(), rojos.get(i).getY(), soldados, rojos.get(i).getVecinoslista(), Defensor));
                            rojos.remove(i);
                            JOptionPane.showMessageDialog(ventana, "El ejercito azul ha conquistado "+ Atacante);
                            JOptionPane.showMessageDialog(ventana, "El ejercito azul debe mover sus unidades a "+ Atacante);
                            ventana.ComboAtacantes.setEnabled(false);
                            ventana.ComboDefensores.setEnabled(false);
                            ventana.boton3.setEnabled(true);
                            ventana.boton4.setEnabled(true);   
                            atacar(Atacante, Defensor);
                        }
                    }
                    dado=0;
                }   
            }
            updateUI();
        }
    }
    public void reagrupar(String Atacante, String Defensor){
        for(int i = 0; i < azules.size(); i++) {
            if(azules.get(i).getNombre().equals(Atacante)) {
                String unidades = JOptionPane.showInputDialog("Número de unidades a mover:");
                if(azules.get(i).getSoldados()-1>=Integer.parseInt(unidades)){
                    azules.get(i).setSoldados(azules.get(i).getSoldados()-(Integer.parseInt(unidades)));
                    azules.get(azules.size()-1).setSoldados(azules.get(azules.size()-1).getSoldados()+(Integer.parseInt(unidades)));
                    ventana.ComboAtacantes.setEnabled(true);
                    ventana.ComboDefensores.setEnabled(true);
                    ventana.boton4.setEnabled(true);
                    ventana.boton3.setEnabled(true);
                    JOptionPane.showMessageDialog(ventana, "Es el turno de los rojos");
                }else{
                    JOptionPane.showMessageDialog(ventana, "No es posible trasladar los soldados");
                    reagrupar(Atacante, Defensor);
                }
            }
        }
        
        for(int i = 0; i < rojos.size(); i++) {
            if(rojos.get(i).getNombre().equals(Atacante)) {
                String unidades = JOptionPane.showInputDialog("Número de unidades a mover:");
                if(rojos.get(i).getSoldados()-1>=Integer.parseInt(unidades)){
                    rojos.get(i).setSoldados(rojos.get(i).getSoldados()-(Integer.parseInt(unidades)));
                    rojos.get(rojos.size()-1).setSoldados(rojos.get(rojos.size()-1).getSoldados()+(Integer.parseInt(unidades)));
                    ventana.ComboAtacantes.setEnabled(true);
                    ventana.ComboDefensores.setEnabled(true);
                    ventana.boton4.setEnabled(true);
                    ventana.boton3.setEnabled(true);
                    JOptionPane.showMessageDialog(ventana, "Es el turno de los azules");
                }else{
                    JOptionPane.showMessageDialog(ventana, "No es posible trasladar los soldados");
                    reagrupar(Atacante, Defensor);
                }   
            }
        }
        updateUI();
    }
    private void updateUI() {
        ventana.getMapa().azules = new ArrayList();
        ventana.getMapa().rojos = new ArrayList();

        ventana.getMapa().azules.addAll(azules);
        ventana.getMapa().rojos.addAll(rojos);

        ventana.getMapa().repaint();
    }
}