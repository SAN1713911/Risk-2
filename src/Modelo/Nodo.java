
package Modelo;

public class Nodo {
    
    private int x, y;
    private String soldados;
    private String[] vecinoslista;

    public Nodo(int x, int y, String soldados, String[] vecinoslista) {
        this.x = x;
        this.y = y;
        this.soldados = soldados;
        this.vecinoslista = vecinoslista;
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

    public String getSoldados() {
        return soldados;
    }

    public void setSoldados(String soldados) {
        this.soldados = soldados;
    }
    
    public String getVecinonombre(int a) {
        return vecinoslista[a];
    }
    
    public String[] getVecinoslista() {
        return vecinoslista;
    }

    public void setVecinoslista(String[] vecinoslista) {
        this.vecinoslista = vecinoslista;
    }

    @Override
    public String toString() {
        return "Nodo{" + "x=" + x + ", y=" + y + ", soldados=" + soldados + ", vecinoslista=" + vecinoslista + '}';
    }
}
