import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alina");
        names.add("Nicu");
        names.add("Ioana");
        names.add("George");
        names.add("Adina");
        names.add("Elena");
        names.add("Olivia");
        names.add("Florin");
        System.out.println(names);
        for (int i = 0; i < 7; i++) {
            System.out.println(names.get(i));
        }
    }
}
