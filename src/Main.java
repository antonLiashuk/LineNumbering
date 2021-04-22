import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        List<String> stringList  = LineNumbering.number(arr);
        System.out.println(stringList);
    }
}
