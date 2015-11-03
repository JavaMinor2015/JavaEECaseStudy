package domain;

import javax.ejb.MessageDriven;
import javax.jms.Message;

/**
 * Created by Koen on 3-11-2015.
 */
@MessageDriven(name = "PizzaRequestEJB")
public class PizzaRequestBean implements javax.jms.MessageListener {
    public PizzaRequestBean() {
    }

    @Override
    public void onMessage(Message message) {

    }
}
