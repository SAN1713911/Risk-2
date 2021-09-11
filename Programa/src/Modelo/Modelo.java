package Modelo;

import Vista.Ventana;
import java.util.ArrayList;

public class Modelo {

    private Ventana ventana;

    public Modelo(Ventana v) {
        this.ventana = v;
    }
    ArrayList<Nodo> rojos = new ArrayList<>();
    ArrayList<Nodo> azules = new ArrayList<>();

    int soldados = 1;
    int refuerzos = 1;

    public int a = 35;
    public int b = 35;

    public int c = a + b;
    public int d = (int) (Math.random() * (6) + 1);
    public int e = (int) (Math.random() * (2) + 1);
    public int f = (int) (Math.random() * (3) + 1);
    

    public void posicionar() {
        //Para nodo 1: Argentina
        String[] vecinos1 = {"2", "3"};
        if (e == 1) {
            rojos.add(new Nodo(260, 580, soldados, vecinos1, "Argentina"));
        } else {
            azules.add(new Nodo(260, 580, soldados, vecinos1, "Argentina"));
        }
        //Para nodo 2: Venezuela
        String[] vecinos2 = {"1", "2", "4"};
        if (e == 2) {
            rojos.add(new Nodo(230, 477, soldados, vecinos2, "Venezuela"));
        } else {
            azules.add(new Nodo(230, 477, soldados, vecinos2, "Venezuela"));
        }
        //Para nodo 3: Brazil
        String[] vecinos3 = {"1", "2", "20"};
        if (e == 1) {
            rojos.add(new Nodo(300, 520, soldados, vecinos3, "Brazil"));

        } else {
            azules.add(new Nodo(300, 520, soldados, vecinos3, "Brazil"));
        }
        //Para nodo 4: America Central
        String[] vecinos4 = {"2", "5"};
        if (e == 2) {
            rojos.add(new Nodo(140, 410, soldados, vecinos4, "America Central"));

        } else {
            azules.add(new Nodo(140, 410, soldados, vecinos4, "America Central"));
        }
        //Para nodo 5: Estados Unidos Occidental
        String[] vecinos5 = {"4", "6", "7"};
        if (e == 1) {
            rojos.add(new Nodo(100, 310, soldados, vecinos5, "Estados Unidos Occidental"));

        } else {
            azules.add(new Nodo(100, 310, soldados, vecinos5, "Estados Unidos Occidental"));
        }
        //Para nodo 6: Estados Unidos Oriental
        String[] vecinos6 = {"5", "8", "9"};
        if (e == 2) {
            rojos.add(new Nodo(180, 285, soldados, vecinos6, "Estados Unidos Oriental"));

        } else {
            azules.add(new Nodo(180, 285, soldados, vecinos6, "Estados Unidos Oriental"));
        }
        //Para nodo 7: Alberta
        String[] vecinos7 = {"5", "8", "10", "11"};
        if (e == 1) {
            rojos.add(new Nodo(90, 185, soldados, vecinos7, "Alberta"));

        } else {
            azules.add(new Nodo(90, 185, soldados, vecinos7, "Alberta"));
        }
        //Para nodo 8: Ontario
        String[] vecinos8 = {"7", "9", "11", "12"};
        if (e == 2) {
            rojos.add(new Nodo(155, 210, soldados, vecinos8, "Ontaro"));

        } else {
            azules.add(new Nodo(155, 210, soldados, vecinos8, "Ontaro"));
        }
        //Para nodo 9: Quebec
        String[] vecinos9 = {"6", "8", "12"};
        if (e == 1) {
            rojos.add(new Nodo(200, 200, soldados, vecinos9, "Quebec"));

        } else {
            azules.add(new Nodo(200, 200, soldados, vecinos9, "Quebec"));
        }
        //Para nodo 10: Alaska (FALTA VECINO DE KAMCHATKA)
        String[] vecinos10 = {"7", "11"};
        if (e == 2) {
            rojos.add(new Nodo(45, 90, soldados, vecinos10, "Alaska"));

        } else {
            azules.add(new Nodo(45, 90, soldados, vecinos10, "Alaska"));
        }
        //Para nodo 11: Terrirorios noroccidentales
        String[] vecinos11 = {"10", "7", "8", "12"};
        if (e == 1) {
            rojos.add(new Nodo(90, 120, soldados, vecinos11, "Territorios noroccidentales"));

        } else {
            azules.add(new Nodo(90, 120, soldados, vecinos11, "Territorios noroccidentales"));
        }
        //Para nodo 12: Groenlandia
        String[] vecinos12 = {"8", "9", "11"};
        if (e == 2) {
            rojos.add(new Nodo(265, 100, soldados, vecinos12, "Groelandia"));

        } else {
            azules.add(new Nodo(265, 100, soldados, vecinos12, "Groelandia"));
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
        System.out.println(rojos.get(0));
        System.out.println(azules.get(0));
//        System.out.println(azules.get(1));
    }

    public void reforzar(String pais) {
     
        
        for (int i = 0; i < rojos.size(); i++) {
            if (rojos.get(i).getNombre().equals(pais)) {
                rojos.get(i).setSoldados(rojos.get(i).getSoldados() + 1);
            }
        }
        
        
         for (int i = 0; i < azules.size(); i++) {
            if (azules.get(i).getNombre().equals(pais)) {
                azules.get(i).setSoldados(azules.get(i).getSoldados() + 1);
            }
        }

         
         
        
         
         
        
//        //Para nodo 2: Venezuela
//
//        if (e == 2) {
//            for (int i = 0; i < 1; i++) {
//                rojos.get(i).setSoldados(refuerzos++);
//            }
//        } else {
//            for (int i = 0; i < 1; i++) {
//                azules.get(i).setSoldados(refuerzos);
//            }
//        }

        System.out.println(f);
//        Para nodo 2: Venezuela
//        String[] vecinos2 = {"1","2","4"};
//        if(e==2){
//            if(e==2){
//                for(int i=0; i<1; i++){
//                    rojos.get(i).setSoldados(refuerzos2++);
//                }
//            }
//            else{
//                for(int i=0; i<1; i++){
//                    azules.get(i).setSoldados(refuerzos2++);
//                }
//            }
//        }
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
