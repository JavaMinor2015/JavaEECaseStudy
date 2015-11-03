package service;

import javax.ejb.Remote;

/**
 * Created by Koen on 3-11-2015.
 */
@Remote
public interface Config {
    void initialize();
    void chooseFlavour(String flavour);
    void addTopping(String topping);
    void removeTopping(String topping);
}
