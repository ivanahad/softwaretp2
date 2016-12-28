import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Interpreter {
    static String regexAdd = "add (?<type>[a-z]+) (?<x>[0-9]+) (?<y>[0-9]?) (?<radius>[0-9]+)";

    public static void interpret(String command){
        //TODO Utiliser regex
        Pattern pattern = Pattern.compile(regexAdd);
        Matcher matcher = pattern.matcher(command);
        if(matcher.matches()){
            String type = matcher.group("type");
            int x = Integer.parseInt(matcher.group("x"));
            int y = Integer.parseInt(matcher.group("y"));
            double radius = Double.parseDouble(matcher.group("radius"));
            double magnitude = 0;
        }
    }

}
