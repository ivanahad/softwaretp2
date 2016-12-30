package be.ucl.ingi.lingi2252;

public class ProxyMap {

    public static void add(String category, Object object){
        for(String emergencyType : ConfigProperty.getEmergenciesType()){
            if (emergencyType.equals(category)) {
                Map.add(object);
                return;
            }
        }
    }

    public static String getMap(){
        if (ConfigProperty.canInformLocalisation())
            return Map.getMap();
        return null;
    }

    public static SafePlace getNearestPlace(){
        if(ConfigProperty.canGuideUser())
            return Map.nearestSafePlace();
        return null;
    }

}
