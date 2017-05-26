package david_diaz_lab5;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private int numero_telefono;
    private double efectivo;
    private String direccion;
    private ArrayList<Baleada> baleadas = new ArrayList();
    private Orden orden;

    public Cliente() {
    }

    public Cliente(String nombre, int numero_telefono, double efectivo, String direccion, Orden orden) {
        this.nombre = nombre;
        this.numero_telefono = numero_telefono;
        this.efectivo = efectivo;
        this.direccion = direccion;
        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(int numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Baleada> getBaleadas() {
        return baleadas;
    }

    public void setBaleadas(ArrayList<Baleada> baleadas) {
        this.baleadas = baleadas;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
