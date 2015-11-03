package process;

import business.Flavour;
import business.Pizza;
import business.Topping;
import lombok.Getter;
import lombok.Setter;
import service.Config;
import service.PizzaRequest;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Koen on 3-11-2015.
 */
@Named
@SessionScoped
public class OrderBean implements Serializable {

    @Getter @Setter
    private List<Pizza> order = new ArrayList<>();

    @EJB
    private Config config;

    @EJB
    private PizzaRequest pizzaRequest;

    @Getter @Setter
    private Flavour flavour;
    @Getter @Setter
    private List<Topping> toppings;


    public OrderBean() {
    }

    public void addPizza() {
        Pizza pizza = new Pizza();
        pizza.setFlavour(flavour);
        toppings.forEach(t -> pizza.addTopping(t));
        order.add(pizza);
    }

    public void confirm() {
        pizzaRequest.initialize(order);
    }

    public void undo() {

    }

    public void redo() {

    }


}
