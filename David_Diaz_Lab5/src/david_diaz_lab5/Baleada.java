package david_diaz_lab5;

import java.util.ArrayList;

public class Baleada {
    private ArrayList<String> ingredientes = new ArrayList();
    private double precio;

    public Baleada() {
    }

    public Baleada(double precio) {
        this.precio = precio;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Baleada{" + '}';
    }
    
}
