package david_diaz_lab5;
public class Baleada_Reloaded extends Baleada{

    public Baleada_Reloaded() {
        super.getIngredientes().add("Tortilla");
        super.getIngredientes().add("Mantequilla");
        super.getIngredientes().add("Frijoles");
        super.getIngredientes().add("Huevo");
        super.getIngredientes().add("Platano");
        super.setPrecio(55);
    }
    
    @Override
    public String toString() {
        return "Baleada Reloaded";
    }
}
