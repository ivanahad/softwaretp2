import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Interpreter {
    static String regexAdd = "add (?<category>[a-z]+) (?<type>[a-z]+) (?<x>[0-9]+) (?<y>[0-9]?) (?<radius>[0-9]+)";

    public static void interpret(String command){
        Pattern pattern = Pattern.compile(regexAdd);
        Matcher matcher = pattern.matcher(command);
        if(matcher.matches()){
            add(matcher);
        }
    }

    private static void add(Matcher matcher) {
        String category = matcher.group("category");
        String type = matcher.group("type");
        int x = Integer.parseInt(matcher.group("x"));
        int y = Integer.parseInt(matcher.group("y"));
        double radius = Double.parseDouble(matcher.group("radius"));
        double magnitude = 0;
        AbstractFactory factory = FactoryProducer.getFactory(category);
        Object object = factory.getObject(type, x, y, radius);
        if(object != null)
            Map.add(object);
    }

}
