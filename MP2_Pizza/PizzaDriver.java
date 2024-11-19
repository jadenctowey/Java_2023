public class PizzaDriver {
    public static void main(String[] args) {
    Pizza pizza1 = new Pizza("small", 1, 0, 1);
    Pizza pizza2 = new Pizza("large", 2, 2, 0);
    Pizza pizza3 = new Pizza(pizza2);
    Pizza pizza4 = new Pizza(pizza1);

    PizzaOrder order = new PizzaOrder(3);

    // + pizza1 to order
    System.out.println(order.addPizza(pizza1)); 
    // + pizza2 to order
    System.out.println(order.addPizza(pizza2)); 
    // + pizza3 to order  
    System.out.println(order.addPizza(pizza3));
    // + pizza4 to order – this
    System.out.println(order.addPizza(pizza4)); 

    // test if pizza1 and pizza 2 =
    System.out.println(pizza1.equals(pizza3));

    // Should call order’s toString method
    System.out.println(order);

    }
}