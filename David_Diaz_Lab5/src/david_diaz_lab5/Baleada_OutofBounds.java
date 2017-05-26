package david_diaz_lab5;
public class Baleada_OutofBounds extends Baleada{

    public Baleada_OutofBounds() {
        super.getIngredientes().add("Tortilla");
        super.getIngredientes().add("Mantequilla");
        super.getIngredientes().add("Frijoles");
        super.getIngredientes().add("Huevo");
        super.getIngredientes().add("Platano");
        super.getIngredientes().add("Chorizo");
        super.setPrecio(55);
    }
    
    @Override
    public String toString() {
        return "Baleada OutofBounds" + "Precio: " + super.getPrecio();
    }
}
