package DesignPatterns;

public class SubscriberObserver implements Observer {
    @Override
    public void update(){
        System.out.println("Obserwator SubscriberObserver został uaktualniony");
    }
}
