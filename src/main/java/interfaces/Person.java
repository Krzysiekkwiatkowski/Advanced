package interfaces;

public class Person implements Moveable {
    @Override
    public void start(){
        System.out.println("osoba idzie");
    }

    @Override
    public void stop(){

    }
}
