package homework;

public class Test1 implements InfA{
    public String getName(){
        return "test-name";
    }
    public static void main (String[] args){
        Test1 t = new Test1();
        System.out.println(t.getName());
    }
}