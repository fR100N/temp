package subasta.model;

import subasta.view.Observer;

public class Bidder implements Observer {

    private final String name;

    public Bidder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    @Override
    public void update(Observer observer, String name, Double bid) {
        if (observer.toString().equals(name)) {
            System.out.println("Has efectuado una nueva puja por el producto: " + name + " de: " + bid + " euros");
        }
        if (!observer.toString().equals(name)) {
            System.out.println("El pujador " + observer + " ha efectuado una nueva puja por el producto: " + name + " de: " + bid + " euros");
        }
    }
}
