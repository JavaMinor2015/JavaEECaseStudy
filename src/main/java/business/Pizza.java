package business;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Koen on 3-11-2015.
 */
@Named
@ApplicationScoped
public class Pizza {
    @Getter @Setter
    private Flavour flavour;

    @Getter
    private List<Topping> toppings = new ArrayList<>();

    public Pizza() {
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public void removeTopping(Topping topping) {
        toppings.remove(topping);
    }
}
