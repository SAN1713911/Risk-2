package Modelo;

import java.util.ArrayList;

public class Jugador {
    private int x,y,z;
    private ArrayList<Nodo> nodos = new ArrayList<Nodo>();

    public Jugador(int x, int y) {
        this.x = x;
        this.y = y;
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

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public ArrayList<Nodo> getNodos() {
        return nodos;
    }

    public void setNodos(ArrayList<Nodo> nodos) {
        this.nodos = nodos;
    }

    public void color(int i){
        this.nodos.get(i).setX(this.x);
        this.nodos.get(i).setY(this.y);
    }
    
    public void añadirterritorio(Nodo t){
        nodos.add(t);
    }
    
    public void remover(Nodo t){
        nodos.remove(t);
    }
    
}   
