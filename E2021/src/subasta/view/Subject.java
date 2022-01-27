package subasta.view;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void setNewBid(Observer observer, Double newBid);
}
