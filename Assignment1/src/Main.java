class Main{
    public static void main(String[] args) {

        DineOrder Dine1 = new DineOrder("Tea", 800, 5, 1001);
        Dine1.getBasePrice();
        Dine1.calculateTotal();

        System.out.println();

        DeliveryOrder Delivery1 = new DeliveryOrder("Chicken", 1200, 2, 230);
        Delivery1.getBasePrice();
        Delivery1.calculateTotal();
    }
}