import java.util.List;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        int number = 0;
        if(lines.size() == 0){
            return lines;
        } else {
            for(int i = 0; i < lines.size(); i++){
                //lines.get(i);
                lines.set(i, ++number + ": " + lines.get(i));
            }
        }
        return lines;
    }
}
