import jdk.jfr.Category;

public class foodOrder {
    protected String dishName;
    protected double basePrice;
    protected int quantity;

    foodOrder(String dishName, double basePrice, int quantity){
        this.dishName = dishName;
        this.basePrice = basePrice;
        this.quantity = quantity;
    }

    public double getBasePrice() {
        return basePrice;
    }

    void calculateTotal(){
        System.out.println("total is :" + (basePrice * quantity));
    }
}


class DineOrder extends foodOrder{
    protected int tableNumber;
    DineOrder(String dishName, double basePrice, int quantity, int tableNumber){
        super(dishName, basePrice, quantity);
        this.tableNumber = tableNumber;
    }

    @Override
    void calculateTotal(){
        System.out.println("This is override from Dine order Class");
        System.out.println("Dish name : " + dishName);
        System.out.println("base Price : " + basePrice);
        System.out.println("Quantity : " + quantity);
        System.out.println("Table Number : " + tableNumber);
    }

}




class DeliveryOrder extends foodOrder{
    protected double deliveryFee;
    DeliveryOrder(String dishName, double basePrice, int quantity, int deliveryFee){
        super(dishName, basePrice, quantity);
        this.deliveryFee = deliveryFee;
    }

    @Override
    void calculateTotal(){
        System.out.println("This is override from Delivery order Class");
        System.out.println("Dish name  : " + dishName);
        System.out.println("base Price : " + basePrice);
        System.out.println("Quantity : " + quantity);
        System.out.println("Delivery fee : " + deliveryFee);
    }

}
