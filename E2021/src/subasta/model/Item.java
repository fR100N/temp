package subasta.model;

import subasta.view.Observer;
import subasta.view.Subject;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Item implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private final String name;
    private final String description;
    private final Double startingPrice;
    private Double actualBid;
    private final LocalDateTime startingTime;
    private Observer observer;

    public Item(String name, String description, Double startingPrice, Double actualBid, LocalDateTime startingTime) {
        this.name = name;
        this.description = description;
        this.startingPrice = startingPrice;
        this.actualBid = actualBid;
        this.startingTime = startingTime;
    }
    
    @Override
    public void registerObserver(Observer observer) {
        System.out.println("Ha entrado en la subasta: " + observer);
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("El observer " + observer + " se ha retirado de la subasta");
    }

    @Override
    public void notifyObservers() {
        System.out.println("\n" + "¡ NUEVA SUBASTA !");
        System.out.println("\n");
        for (Observer observer : observers) {
            observer.update(observer, name, actualBid);
        }
    }

    @Override
    public void setNewBid(Observer observer, Double newBid) {
        int compare = actualBid.compareTo(newBid);
        if (compare == -1) {
            this.observer = observer;
            this.actualBid = newBid;
            notifyObservers();
        } else {
            System.out.println("El precio pujado: " + newBid + " es menor al valor actual de la subasta " + actualBid);
        }
    }

    public String getName() {
        return name;
    }
}
