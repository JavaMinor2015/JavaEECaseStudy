package domain;

import business.Flavour;
import business.Pizza;
import business.Topping;
import service.Config;

import javax.ejb.Stateless;

/**
 * Created by Koen on 3-11-2015.
 */
@Stateless(name = "ConfigBeanEJB")
public class ConfigBean implements Config {

    private Pizza pizza;

    public ConfigBean() {
    }

    @Override
    public void initialize() {
        this.pizza = new Pizza();
    }

    @Override
    public void chooseFlavour(String flavourValue) {
        Flavour flavour = new Flavour();
        flavour.setName(flavourValue);
        pizza.setFlavour(flavour);
    }

    @Override
    public void addTopping(String toppingValue) {
        Topping topping = new Topping();
        topping.setName(toppingValue);
        pizza.addTopping(topping);

    }

    @Override
    public void removeTopping(String toppingValue) {
        //This isn't going to work I know :(
        Topping topping = new Topping();
        topping.setName(toppingValue);
        pizza.removeTopping(topping);
    }
}
