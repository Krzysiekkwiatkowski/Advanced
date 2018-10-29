package Lambda;

public class Zad4Methodsa implements Zad4a <Double> {
    @Override
    public double pow(Double number) {
        return number * number;
    }

    @Override
    public double root(Double number) {
        return Math.pow(number, 0.5);
    }
}
