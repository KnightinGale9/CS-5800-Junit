package Assignment5.Food.Base;
import Assignment5.Food.Interface.Food;

public class Veggiedog implements Food {
    @Override
    public String getDescription() {
        return "Veggie Dog with";
    }

    @Override
    public double getCost() {
        return 8;
    }
}
