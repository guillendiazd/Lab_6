package david_diaz_lab5;
public class Baleada_Binaria extends Baleada{
    public Baleada_Binaria() {
        super.getIngredientes().add("Tortilla");
        super.getIngredientes().add("Mantequilla");
        super.getIngredientes().add("Frijoles");
        super.setPrecio(22);
    }

    @Override
    public String toString() {
        return "Baleada Binaria";
    }
    
}
