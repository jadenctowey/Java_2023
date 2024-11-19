public class PizzaOrder {
    private Pizza m_order[];
    private int m_numPizzas;

//create 1 med cheese pizza
public PizzaOrder() {
    m_order = new Pizza[1];
    m_order[0] = new Pizza(); 
    m_numPizzas = 1;
    }

//create specific num of pizzas
public PizzaOrder(int m_numPizzas) {
    m_order = new Pizza[m_numPizzas];
    m_numPizzas = 0;
    }

//add pizza to order if space and -1 otherwise
public int addPizza(Pizza pizza) {
    if (m_numPizzas < m_order.length) {
        m_order[m_numPizzas] = pizza;
        m_numPizzas++;
        return 1;
    } 
    else {
        return -1;
    }
    }

//calc total piza in order
public double calcTotal() {
    double totalCost = 0;
    for (int i = 0; i < m_order.length; i++) {
        if (m_order[i] != null) {totalCost += m_order[i].calcCost();}
    }
    return totalCost;
    }

//return repping pizza order details in full
public String toString() {
    String s = "Pizzas in the order: ";
    for (int i = 0; i < m_order.length; i++ ) {
        s +=(m_order[i].getSize() + " with " + m_order[i].getCheese() + " Cheese Toppings, " + m_order[i].getPepperoni() + " Pepperoni Toppings, and " + m_order[i].getVeggie() + " Veggie Toppings; ");
    }
    return s;
    }
}