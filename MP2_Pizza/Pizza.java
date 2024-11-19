public class Pizza {
    private String m_size;
    private int m_cheese;
    private int m_pepperoni;
    private int m_veggie;

//creates med pizza and 1 cheese top
    public Pizza() {
        this.m_size = "medium";
        this.m_cheese = 1;
    }

//pizza w specific size anf top
    public Pizza(String m_size, int m_cheese, int m_pepperoni, int m_veggie) {
        this.m_size = m_size;
        this.m_cheese = m_cheese;
        this.m_pepperoni = m_pepperoni;
        this.m_veggie = m_veggie;
    }

//create copy
    public Pizza(Pizza pizzaToCopy) {
        this.m_size = pizzaToCopy.m_size;
        this.m_cheese = pizzaToCopy.m_cheese;
        this.m_pepperoni = pizzaToCopy.m_pepperoni;
        this.m_veggie = pizzaToCopy.m_veggie;
    }

//size of pizza
    public String getSize() {
        return this.m_size;
    }

//set pizza size
    public void setSize(String size) {
        this.m_size = size;
    }

//num of cheese top
    public int getCheese() {
        return this.m_cheese;
    }

//set num of cheese top
    public void setCheese(int numCheeseToppings) {
        this.m_cheese = numCheeseToppings;
    }

//num of pep
    public int getPepperoni() {
        return this.m_pepperoni;
    }

// set num of pep
    public void setPepperoni(int numPeppToppings) {
        this.m_pepperoni = numPeppToppings;
    }
//num of veg 
    public int getVeggie() {
        return this.m_veggie;
    }

//set num of veg
    public void setVeggie(int numVeggieToppings) {
        this.m_veggie = numVeggieToppings;
    }

//cost from size and tops
    public double calcCost() {
        double cost = 0;
        if (this.m_size.equals("small")) {
            cost += 10;
        }
        else if (this.m_size.equals("medium")) {
            cost += 12;
        }
        else if (this.m_size.equals("large")) {
            cost += 14;
        }
        cost += ( (this.m_cheese + this.m_pepperoni + this.m_veggie) * 2);
        return cost;
    }

//return pizza details 
public String toString() {
        return ("the size of the pizza is " + this.m_size + ". There are " + this.m_cheese + " cheese toppings, " + this.m_pepperoni + " pepperoni toppings, and " + this.m_veggie + " veggie toppings. " + "the cost of the pizza is $" + calcCost());
    }

//equal to given?
    public boolean equals(Object p) {
        if (!(p instanceof Pizza)) {
            return false;
        }
        else {
            Pizza otherPizza = (Pizza) p;
            return this.m_size.equals(otherPizza.m_size) && this.m_cheese == (otherPizza.m_cheese) && this.m_pepperoni == (otherPizza.m_pepperoni) && this.m_veggie == (otherPizza.m_veggie);
        }
    }
}
