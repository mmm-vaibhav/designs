package system_design.observer_pattern.main;

import system_design.observer_pattern.Observers.EmailAlertObserverImpl;
import system_design.observer_pattern.Observers.MobileAlertObserverImpl;
import system_design.observer_pattern.observables.IPhoneObservable;
import system_design.observer_pattern.observables.StockObservable;

public class MainClass {
    public static void main(String[] args) {
        StockObservable iPhoneStockObservable = new IPhoneObservable();

        EmailAlertObserverImpl emailAlertObserver = new EmailAlertObserverImpl("vb@gmail.com", iPhoneStockObservable);
        EmailAlertObserverImpl emailAlertObserverVaibhav = new EmailAlertObserverImpl("vaibhav@outlook.com", iPhoneStockObservable);
        MobileAlertObserverImpl mobileAlertObserverImpl = new MobileAlertObserverImpl("784558754255", iPhoneStockObservable);

        iPhoneStockObservable.addObserver(emailAlertObserver);
        iPhoneStockObservable.addObserver(emailAlertObserverVaibhav);
        iPhoneStockObservable.addObserver(mobileAlertObserverImpl);


        iPhoneStockObservable.setStock(10);

    }
}
