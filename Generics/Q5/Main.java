
interface MealPlan {

    void showMeal();
}

class VegetarianMeal implements MealPlan {

    @Override
    public void showMeal() {
        System.out.println("Vegetarian Meal: Paneer, Salad, Rice");
    }
}

class VeganMeal implements MealPlan {

    @Override
    public void showMeal() {
        System.out.println("Vegan Meal: Tofu, Vegetables, Brown Rice");
    }
}

class KetoMeal implements MealPlan {

    @Override
    public void showMeal() {
        System.out.println("Keto Meal: Chicken, Eggs, Cheese");
    }
}

class HighProteinMeal implements MealPlan {

    @Override
    public void showMeal() {
        System.out.println("High Protein Meal: Chicken, Fish, Protein Shake");
    }
}

class Meal<T extends MealPlan> {

    private T meal;

    public Meal(T meal) {
        this.meal = meal;
    }

    public T getMeal() {
        return meal;
    }
}

class MealGenerator {

    public static <T extends MealPlan> void generateMeal(T mealPlan) {

        System.out.println("Generating Personalized Meal Plan...");
        mealPlan.showMeal();
    }
}

public class Main {

    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =
                new Meal<>(new VegetarianMeal());

        Meal<VeganMeal> veganMeal =
                new Meal<>(new VeganMeal());

        Meal<KetoMeal> ketoMeal =
                new Meal<>(new KetoMeal());

        Meal<HighProteinMeal> proteinMeal =
                new Meal<>(new HighProteinMeal());

        MealGenerator.generateMeal(vegMeal.getMeal());

        System.out.println();

        MealGenerator.generateMeal(veganMeal.getMeal());

        System.out.println();

        MealGenerator.generateMeal(ketoMeal.getMeal());

        System.out.println();

        MealGenerator.generateMeal(proteinMeal.getMeal());
    }
}