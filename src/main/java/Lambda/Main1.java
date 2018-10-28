package Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line = "";
        while (!line.equals("quit")){
            System.out.println("Wprowadź dane");
            line = scanner.nextLine();
            if(!line.equals("quit")){
                list.add(line);
            }
        }
        Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2));
        for (String sortedLine : list) {
            System.out.println(sortedLine);
        }
    }
}
