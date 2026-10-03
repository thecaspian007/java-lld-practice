package NotificationService;

public class AlertService {
    public NotificationService notifier;

    public AlertService(NotificationService notifier){
        this.notifier = notifier;
    }

    public void triggerAlert(String recipient, String issue) {
        String alertMessage = "ALERT: " + issue;
        notifier.send(recipient, alertMessage);
    }
}
