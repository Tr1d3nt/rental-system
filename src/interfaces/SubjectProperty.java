package interfaces;

// interface used to handle properties

public interface SubjectProperty {

    void attach(ObserverProperty o); // atttach the previously listed observer property

    void remove(ObserverProperty o); // remove the previously listed observer property

    void notifyObservers(); // notify observers

}
