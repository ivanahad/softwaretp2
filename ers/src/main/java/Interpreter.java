/**
 * Created by ndizera on 11/24/16.
 */
public class Interpreter {

    public static void interpret(String command){
        if(Expressions.getIsAddLocationExpression().interpret(command)){
            addLocationToMap(getLocationTypeFromCommand(command), getLocationFromCommand(command));
        } else if(Expressions.getIsRemoveLocationExpression().interpret(command)){
            removeLocationFromMap(getLocationTypeFromCommand(command), getLocationFromCommand(command));
        } else if(Expressions.getIsUpdateExpression().interpret(command)){
            removeLocationFromMap(getLocationTypeFromCommand(command), getLocationFromCommand(command));
            String newCommand = transformSetCommandToAdd(command);
            addLocationToMap(getLocationTypeFromCommand(newCommand), getLocationFromCommand(newCommand));
        } else if(Expressions.getIsSetScaleExpression().interpret(command)){
            removeLocationFromMap(getLocationTypeFromCommand(command), getLocationFromCommand(command));
            addLocationToMap(getLocationTypeFromCommand(command), getEarthquakeFromCommand(command));
        } else if(Expressions.getIsSetLanguageExpression().interpret(command)){
            switchLanguageFromCommand(command);
        }
    }

    private static void switchLanguageFromCommand(String command){
        String arguments[] = command.split(" ");
        String newLanguage = arguments[2];
        Language.switchLanguage(newLanguage);
    }

    private static Location getEarthquakeFromCommand(String command){
        String arguments[] = command.split(" ");
        int x = Integer.parseInt(arguments[2]);
        int y = Integer.parseInt(arguments[3]);
        int radius = Integer.parseInt(arguments[4]);
        int magnitude = Integer.parseInt(arguments[5]);
        return new Earthquake(x, y, radius, magnitude);

    }

    private static Location getLocationFromCommand(String command){
        String arguments[] = command.split(" ");
        String type = arguments[0];
        int x = Integer.parseInt(arguments[2]);
        int y = Integer.parseInt(arguments[3]);
        int radius = Integer.parseInt(arguments[4]);
        return LocationFactory.getLocation(type, x, y, radius);
    }

    private static String getLocationTypeFromCommand(String command){
        String arguments[] = command.split(" ");
        return arguments[0];
    }

    private static void addLocationToMap(String locationType, Location location){
        switch (locationType){
            case "safe_place":
                Map.addSafePlace((SafePlace) location);
                break;
            default:
                Map.addNaturalDisaster((NaturalDisaster) location);
                break;
        }
    }

    private static void removeLocationFromMap(String locationType, Location location){
        switch (locationType){
            case "safe_place":
                Map.removeSafePlace((SafePlace) location);
                break;
            default:
                Map.removeNaturalDisaster((NaturalDisaster) location);
                break;
        }
    }

    private static String transformSetCommandToAdd(String command){
        String arguments[] = command.split(" ");
        return arguments[0] + " add " + arguments[6] + " " + arguments[7] + " " + arguments[8];
    }
}
