package DesignPatterns;

public class PublishSubscriber implements Observer {
    @Override
    public void update(){
        System.out.println("Obserwator PublishSubscriber został uaktualniony");
    }
}
