import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Interpreter {
    private static String regexAdd = "add (?<category>[a-z]+) (?<type>[a-z]+) " +
            "(?<x>[0-9]+) (?<y>[0-9]?) (?<radius>[0-9]+)";
    private static String regexRemove = "remove (?<category>[a-z]+) (?<type>[a-z]+) " +
            "(?<x>[0-9]+) (?<y>[0-9]?) (?<radius>[0-9]+)";
    private static String regexUpdate = "update (?<category>[a-z]+) (?<type>[a-z]+) " +
            "(?<x>[0-9]+) (?<y>[0-9]?) (?<radius>[0-9]+) (?<newx>[0-9]+) (?<newy>[0-9]?) (?<newradius>[0-9]+)";

    public static void interpret(String command){
        Pattern pattern = Pattern.compile(regexAdd);
        Matcher matcher = pattern.matcher(command);
        if(matcher.matches()){
            add(matcher);
        }

        pattern = Pattern.compile(regexRemove);
        matcher = pattern.matcher(command);
        if(matcher.matches()){
            remove(matcher);
        }

        pattern = Pattern.compile(regexUpdate);
        matcher = pattern.matcher(command);
        if(matcher.matches()){
            update(matcher);
        }
    }

    private static void remove(Matcher matcher) {
        Object object = getObject(matcher);
        if(object != null)
            Map.remove(object);
    }


    private static void add(Matcher matcher) {
        Object object = getObject(matcher);
        if(object != null)
            Map.add(object);
    }

    public static void update(Matcher matcher){
        Object object = getObject(matcher);
        String category = matcher.group("category");
        String type = matcher.group("type");
        int x = Integer.parseInt(matcher.group("newx"));
        int y = Integer.parseInt(matcher.group("newy"));
        double radius = Double.parseDouble(matcher.group("newradius"));
        AbstractFactory factory = FactoryProducer.getFactory(category);
        Object newObject = factory.getObject(type, x, y, radius);
        if (object != null){
            Map.update(object, newObject);
        }
    }

    private static Object getObject(Matcher matcher) {
        String category = matcher.group("category");
        String type = matcher.group("type");
        int x = Integer.parseInt(matcher.group("x"));
        int y = Integer.parseInt(matcher.group("y"));
        double radius = Double.parseDouble(matcher.group("radius"));
        AbstractFactory factory = FactoryProducer.getFactory(category);
        return factory.getObject(type, x, y, radius);
    }

}
