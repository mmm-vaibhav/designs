package system_design.observer_pattern.observables;

import system_design.observer_pattern.Observers.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservable implements StockObservable{

    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stock = 0;

//    public IPhoneObservable() {
//        this.observerList = new ArrayList<>();
//        this.stock = 0;
//    }

    @Override
    public void addObserver(NotificationAlertObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(NotificationAlertObserver observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStock(int newStock) {

        if (stock == 0) {
            notifyObservers();
        }
        this.stock += newStock;
    }



    @Override
    public int getStock() {
        return this.stock;
    }
}
