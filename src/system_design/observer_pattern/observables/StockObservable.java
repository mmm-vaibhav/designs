package system_design.observer_pattern.observables;


import system_design.observer_pattern.Observers.NotificationAlertObserver;

public interface StockObservable {
    void addObserver(NotificationAlertObserver observer);
    void removeObserver(NotificationAlertObserver observer);
    void notifyObservers();
    public void setStock(int newStock);
    public int getStock();
}
