package DesignPatterns;

public class FacebookObserver implements Observer {
    @Override
    public void update(){
        System.out.println("Obserwator FacebookObserver został uaktualniony");
    }
}
