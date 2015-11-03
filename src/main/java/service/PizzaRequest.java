package service;

/**
 * Created by Koen on 3-11-2015.
 */

import business.Pizza;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface PizzaRequest {
    void initialize(List<Pizza> pizzaRequest);
}
