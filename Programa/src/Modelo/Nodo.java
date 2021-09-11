package Modelo;

public class Nodo {
    
    private int x, y;
    private int soldados;
    private String[] vecinoslista;
    private String nombre;

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
    
    
    
    
    
    @Override
    public String toString() {
        return "Nodo{" + "x=" + x + ", y=" + y + ", soldados=" + soldados + ", vecinoslista=" + vecinoslista + '}';
    }
}