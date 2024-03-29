package Assignment5.Customer;

import Assignment5.MenuItem.Interface.MenuItem;

import java.util.ArrayList;

public class Customer {
    private String name;
    private Loyalty status;
    private ArrayList<MenuItem> order;
    private double price;

    public Customer(String name,Loyalty status){
        this.name=name;
        this.status=status;
        this.order = new ArrayList<>();
        price=0;
    }
    public void addToOrder(MenuItem menuItem){
        order.add(menuItem);
    }
    public double getOrderCost(){
        for (MenuItem item: order) {
            price+=item.getCost();
        }
        return price;
    }
    public double applyLoyalty(){
        return status.priceAfterDiscount(this.getOrderCost());
    }
    public void printOrder(){
        for (MenuItem item: order) {
            System.out.printf("%s : %.2f\n",item.getDescription(),item.getCost());
        }
        System.out.printf("Before Discount %.2f\n",getOrderCost());
        System.out.printf("After %.2f%% Discount %.2f\n",1-status.getDiscout(),applyLoyalty());
    }
}
