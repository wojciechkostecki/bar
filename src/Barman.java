import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Barman {
    private Scanner scanner = new Scanner(System.in);
    private int ingredientsNumber;

    public Drink createDrink() {
        System.out.println("Podaj ilość składników: ");
        ingredientsNumber = scanner.nextInt();
        int quantity = ingredientsNumber;
        scanner.nextLine();
        List<Ingredient> ingredients = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            Ingredient ingredient = loadIngredient();
            ingredients.add(ingredient);
        }
        return new Drink(ingredients);
    }

    private Ingredient loadIngredient() {
        System.out.println("Podaj nazwę składnika: ");
        String name = scanner.nextLine();
        System.out.println("Podaj ilość składnika w mililitrach: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        return new Ingredient(name, amount);
    }

    public void printDrink(Drink drink) {
        System.out.println("Drink składa się z "+ ingredientsNumber + " składników:");
        drink.getIngredients().forEach(x -> System.out.println("-" + x.getName() + "(" + x.getAmount() + ")"));
    }
}
