package interfaces;

import tasks.*;
import java.util.*;

// interface for observer property, also used in the notification implementation

public interface ObserverProperty {

    void update(ArrayList<Property> arr); // function used to update notification, using an array list of properties

}
