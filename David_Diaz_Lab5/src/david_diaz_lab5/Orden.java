package david_diaz_lab5;

import java.util.Date;

public class Orden {
    private int numero_orden;
    private Date fecha;
    private int hora;
    private Cliente cliente;

    public Orden() {
    }

    public Orden(int numero_orden, Date fecha, int hora, Cliente cliente) {
        this.numero_orden = numero_orden;
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
    }

    public int getNumero_orden() {
        return numero_orden;
    }

    public void setNumero_orden(int numero_orden) {
        this.numero_orden = numero_orden;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "N." + numero_orden;
    }
    
}
