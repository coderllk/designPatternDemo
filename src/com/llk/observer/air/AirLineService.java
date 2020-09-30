package com.llk.observer.air;

public interface AirLineService {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
