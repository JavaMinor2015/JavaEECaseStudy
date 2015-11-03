package domain;

import business.Pizza;
import lombok.Getter;
import lombok.Setter;
import service.PizzaRequest;

import javax.ejb.MessageDriven;
import javax.jms.Message;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Koen on 3-11-2015.
 */
@MessageDriven(name = "PizzaRequestEJB")
public class PizzaRequestBean implements PizzaRequest, javax.jms.MessageListener {

    @Getter @Setter
    private List<List<Pizza>> pizzaRequests = new ArrayList<>();

    public PizzaRequestBean() {
    }

    @Override
    public void onMessage(Message message) {

    }

    @Override
    public void initialize(List<Pizza> pizzaRequest) {
        this.pizzaRequests.add(pizzaRequest);
    }

    //Process order logic
}
