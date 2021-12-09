package interfaces;

// interface used in the subject controller class

public interface SubjectNotification {

    void attach(ObserverNotification o); // atttach the previously listed observer notififcation

    void remove(ObserverNotification o); // remove the observer notification

    void notifyObservers(); // notify the observers

}
