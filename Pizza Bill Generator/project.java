import java.util.*;

class Pizza {
    private int price;
    private Boolean veg;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
    }

    public void getPizzaPrice() {
        System.out.println("Price of Pizza: " + this.price);
    }

    public void addExtraCheese() {
        this.price += 100;
        System.out.println("Extra cheese added. New Price: " + this.price);
    }

    public void addExtraTopping() {
        this.price += 100;
        System.out.println("Extra topping added. New Price: " + this.price);
    }

    public void takeAway() {
        this.price += 20;
        System.out.println("Takeaway added. New Price: " + this.price);
    }
}


class DeluxePizza extends Pizza {
    public DeluxePizza(Boolean veg) {
        super(veg); 
        addExtraCheese(); 
        addExtraTopping(); 
    }
}

public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want a regular pizza or a deluxe pizza(please enter 'regular' for regular pizza or 'deluxe' for deluxe pizza)");
        String pizzaType = sc.nextLine().trim().toLowerCase();

        System.out.println("Do you want a veg pizza or non-veg pizza(please enter 'veg' for veg pizza 'non-veg' for non-veg pizza)");
        Boolean isVeg = sc.nextLine().trim().equalsIgnoreCase("veg");

        Pizza pizza;
        if (pizzaType.equals("deluxe")) {
            pizza = new DeluxePizza(isVeg);
        } else {
            pizza = new Pizza(isVeg);
        }

        pizza.getPizzaPrice();

        if (!pizzaType.equals("deluxe")) {
            System.out.println("Do you want extra cheese(plese enter only 'yes' or 'no')");
            if (sc.nextLine().trim().equalsIgnoreCase("yes")) {
                pizza.addExtraCheese();
            }

            System.out.println("Do you want extra topping(plese enter only 'yes' or 'no')");
            if (sc.nextLine().trim().equalsIgnoreCase("yes")) {
                pizza.addExtraTopping();
            }
        }

        System.out.println("Do you want takeaway(plese enter only 'yes' or 'no')");
        if (sc.nextLine().trim().equalsIgnoreCase("yes")) {
            pizza.takeAway();
        }

        System.out.println("Final Pizza Price:");
        pizza.getPizzaPrice();
    }
}
