package system_design.observer_pattern.Observers;

import system_design.observer_pattern.observables.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    private String emailId;
    private StockObservable stockObservable;

    public EmailAlertObserverImpl(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMobileAlert(emailId, "Product is in stock please hurry up to book.");
    }

    private void sendMobileAlert(String emailId, String s) {
        System.out.println("Email Alert: => " + s + " =====> to " + emailId);
    }
}
