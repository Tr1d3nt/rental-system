package tasks;

import controllers.NotificationsController;
import controllers.PropertyController;

public class test {


    public static void main(String[] args){

        NotificationsController notificationsController = new NotificationsController();
        PropertyController propertyController = new PropertyController();
        NotificationHandler notificationHandler = new NotificationHandler(notificationsController, propertyController);

        Property p = new Property("email", "address", "type", "2", "3",
                "Yes", "NW", "Active", "30");

        propertyController.addProperty(p);



    }
}
