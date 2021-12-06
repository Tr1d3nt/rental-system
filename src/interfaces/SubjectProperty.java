package interfaces;

public interface SubjectProperty {

    void attach(ObserverProperty o);

    void remove(ObserverProperty o);

    void notifyObservers();

}
