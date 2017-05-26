package david_diaz_lab5;
public class Baleada_Especial extends Baleada{

    public Baleada_Especial() {
        super.getIngredientes().add("Tortilla");
        super.getIngredientes().add("Mantequilla");
        super.getIngredientes().add("Frijoles");
        super.getIngredientes().add("Huevo");
        super.setPrecio(35);
    }

    @Override
    public String toString() {
        return "Baleada Especial";
    }
    
}
