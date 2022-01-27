package subasta.view;

public interface Observer {
    void update(Observer observer, String name, Double bid);
}
