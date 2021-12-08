package tasks;

import controllers.NotificationsController;
import controllers.PropertyController;

public class tests {

    public static void main (String[] args){

        NotificationsController n = new NotificationsController();
        PropertyController p = new PropertyController();

        NotificationHandler notificationHandler = new NotificationHandler(n, p);

        notificationHandler.notifyProperties("0");

















    }
}
