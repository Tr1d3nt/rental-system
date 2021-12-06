package interfaces;

public interface SubjectNotification {

    void attach(ObserverNotification o);

    void remove(ObserverNotification o);

    void notifyObservers();

}
