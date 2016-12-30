package be.ucl.ingi.lingi2252;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Interpreter {
    private static String regexAdd = "add (?<category>[a-z]+) (?<type>[a-z]+) " +
            "(?<x>[0-9]+) (?<y>[0-9]?) (?<radius>[0-9]+)";

    private static String regexRemove = "remove (?<category>[a-z]+) (?<type>[a-z]+) " +
            "(?<x>[0-9]+) (?<y>[0-9]?) (?<radius>[0-9]+)";

    private static String regexUpdate = "update (?<category>[a-z]+) (?<type>[a-z]+) " +
            "(?<x>[0-9]+) (?<y>[0-9]?) (?<radius>[0-9]+) (?<newx>[0-9]+) (?<newy>[0-9]?) (?<newradius>[0-9]+)";

    private static String regexLanguage = "set language (?<lang>[a-z]+) ";

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

        pattern = Pattern.compile(regexLanguage);
        matcher = pattern.matcher(command);
        if(matcher.matches()){
            String newLanguage = matcher.group("lang");
            ProxyLanguage.switchLanguage(newLanguage);
        }
    }

    private static void remove(Matcher matcher) {
        EntityWithLocation object = getObject(matcher);
        if(object != null)
            Map.remove(object);
    }


    private static void add(Matcher matcher) {
        EntityWithLocation object = getObject(matcher);
        String category = matcher.group("category");
        if(object != null)
            ProxyMap.add(category, object);
    }

    public static void update(Matcher matcher){
        EntityWithLocation object = getObject(matcher);
        String category = matcher.group("category");
        String type = matcher.group("type");
        int x = Integer.parseInt(matcher.group("newx"));
        int y = Integer.parseInt(matcher.group("newy"));
        double radius = Double.parseDouble(matcher.group("newradius"));
        AbstractFactory factory = FactoryProducer.getFactory(category);
        EntityWithLocation newObject = factory.getObject(type, x, y, radius);
        if (object != null){
            Map.update(object, newObject);
        }
    }

    private static EntityWithLocation getObject(Matcher matcher) {
        String category = matcher.group("category");
        String type = matcher.group("type");
        int x = Integer.parseInt(matcher.group("x"));
        int y = Integer.parseInt(matcher.group("y"));
        double radius = Double.parseDouble(matcher.group("radius"));
        AbstractFactory factory = FactoryProducer.getFactory(category);
        return factory.getObject(type, x, y, radius);
    }

}
