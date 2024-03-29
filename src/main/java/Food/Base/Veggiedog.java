package Food.Base;
import Food.Interface.Food;

public class Veggiedog implements Food{
    @Override
    public String getDescription() {
        return "Veggie Dog with";
    }

    @Override
    public double getCost() {
        return 8;
    }
}
