package system_design.observer_pattern.Observers;

import system_design.observer_pattern.observables.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{


    private String mobNumber;
    private StockObservable stockObservable;

    public MobileAlertObserverImpl(String mobNumber, StockObservable stockObservable) {
        this.mobNumber = mobNumber;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMobileAlert(mobNumber, "Product is in stock please hurry up to book.");
    }

    private void sendMobileAlert(String mobNumber, String s) {
        System.out.println("Mobile Alert: => " + s + " =====> to " + mobNumber);
    }
}
