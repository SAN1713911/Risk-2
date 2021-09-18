package Modelo;

import java.util.ArrayList;

public class Nodo {
    private int x, y;
    private int soldados;
    private String[] vecinoslista;
    private String nombre;
    private boolean visitado=false;
    ArrayList<Nodo> paises = new ArrayList<>();

    public Nodo(int x, int y, int soldados, String[] vecinoslista, String nombre) {
        this.x = x;
        this.y = y;
        this.soldados = soldados;
        this.vecinoslista = vecinoslista;
        this.nombre = nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSoldados() {
        return soldados;
    }

    public void setSoldados(int soldados) {
        this.soldados = soldados;
    }

    public String[] getVecinoslista() {
        return vecinoslista;
    }

    public void setVecinoslista(String[] vecinoslista) {
        this.vecinoslista = vecinoslista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Nodo> getPaises() {
          return paises;
    }

    public void setPaises(ArrayList<Nodo> paises) {
        this.paises = paises;
    }
    
    public String obtenerVecino(int i) {
        return vecinoslista[i];
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    
    public int buscarVecino(String Llegada) {
        visitado=true;
        int encontrado = 0 ;
        for(int i=0; i<vecinoslista.length; i++){
            if(this.obtenerVecino(i).equals(Llegada)){
                encontrado = 1;
            }
        }
        if(encontrado==0){
            for(int i=0; i<vecinoslista.length; i++){
                encontrado = paises.get(i).buscarVecino(Llegada);
                if(encontrado==1){
                    break;
                }
            }
        }
        boolean p = false;
//        if(this.nombre.equals(Llegada)) {
//            System.out.println("El país fue encontrado");
//        }else{
//            for(int i=0;i<vecinoslista.length;i++){
//                if(!vecinoslista.get(i).visitado) {
//                    p = vecinoslista.get(i).buscarVecino(s);
//                    if(p!=false){
//                        return p;
//                    }
//                }
//            }
        
        return encontrado;
    }
    @Override
    public String toString() {
        return "Nodo{" + "x=" + x + ", y=" + y + ", soldados=" + soldados + ", vecinoslista=" + vecinoslista + '}';
    }


}
