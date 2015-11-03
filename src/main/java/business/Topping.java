package business;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * Created by Koen on 3-11-2015.
 */
@Named
@ApplicationScoped
public class Topping {
    @Getter @Setter
    private String name;

    public Topping() {
    }
}
