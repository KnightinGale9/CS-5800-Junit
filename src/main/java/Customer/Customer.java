package Customer;

import Food.Interface.Food;

import java.util.ArrayList;

public class Customer {
    private String name;
    private Loyalty status;
    private ArrayList<Food> order;
    private double price;

    public Customer(String name,Loyalty status){
        this.name=name;
        this.status=status;
        this.order = new ArrayList<>();
        price=0;
    }
    public void addToOrder(Food food){
        order.add(food);
    }
    public double getOrderCost(){
        for (Food item: order) {
            price+=item.getCost();
        }
        return price;
    }
    public double applyLoyalty(){
        return status.applyDiscount(price);
    }
    public void printOrder(){
        for (Food item: order) {
            System.out.printf("%s : %.2f\n",item.getDescription(),item.getCost());
        }
        System.out.printf("Before Discount %.2f\n",getOrderCost());
        System.out.printf("After %.2f%% Discount %.2f\n",1-status.getDiscout(),applyLoyalty());
    }
}
