import java.util.ArrayList;
import java.util.List;

public class Drink {
    private List<Ingredient> ingredients;

    public Drink(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
