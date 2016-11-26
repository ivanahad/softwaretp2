/**
 * Created by ndizera on 11/26/16.
 */
public class Views {
    public static void displaySafetyInstructions(){
        String instructions = Controller.getSafetyInstructions();
        display(instructions);
    }

    public static void displayShortestPathToSafety(){
        String path = Controller.getShortestPathToSafety();
        display(path);
    }

    public static void displayMap(){
        String map = Controller.getMap();
        display(map);
    }

    private static void display(String stringToDisplay){
        if(stringToDisplay != null)
            System.out.println(stringToDisplay);
    }


}
