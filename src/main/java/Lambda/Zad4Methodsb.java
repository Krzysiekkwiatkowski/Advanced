package Lambda;

public class Zad4Methodsb implements Zad4b<Integer> {
    @Override
    public int sup(Integer number) {
        int result = 1;
        for (int i = 1; i < number + 1; i++) {
            result *= i;
        }
        return result;
    }
}
