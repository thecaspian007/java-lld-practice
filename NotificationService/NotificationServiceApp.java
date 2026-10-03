package NotificationService;

public class NotificationServiceApp {
    public static void main(String[] args){
        AlertService emailAlert = new AlertService(new EmailNotifier());
        emailAlert.triggerAlert("ops@company.com", "CPU usage at 95%");

        AlertService slackAlert = new AlertService(new SlackNotifier());
        slackAlert.triggerAlert("#incidents", "Database connection pool exhausted");

        AlertService webhookAlert = new AlertService(new WebhookNotifier());
        webhookAlert.triggerAlert("https://hooks.example.com/alerts", "Disk usage at 90%");
    }
}
