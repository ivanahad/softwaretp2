package ers;

import java.util.LinkedList;

/**
 * Created by ndizera on 23/11/2016.
 */
public class Map {
    private LinkedList<NaturalDisaster> naturalDisasters;
    private LinkedList<SafePlace> safePlaces;
    private PersonLocation personLocation;

    public Map(PersonLocation personLocation) {
        this.personLocation = personLocation;
        this.naturalDisasters = new LinkedList<>();
        this.safePlaces = new LinkedList<>();
    }

    public void addNaturalDisaster(NaturalDisaster naturalDisaster){
        naturalDisasters.add(naturalDisaster);
    }

    public void removeNaturalDisaster(NaturalDisaster naturalDisaster){
        naturalDisasters.remove(naturalDisaster);
    }

    public void addSafePlace(SafePlace safePlace){
        safePlaces.add(safePlace);
    }

    public void removeSafePlace(SafePlace safePlace){
        safePlaces.remove(safePlace);
    }

    public PersonLocation getPersonLocation() {
        return personLocation;
    }

    public void setPersonLocation(PersonLocation personLocation) {
        this.personLocation = personLocation;
    }

    public LinkedList<NaturalDisaster> getNaturalDisasters() {
        return naturalDisasters;
    }

    public LinkedList<SafePlace> getSafePlaces() {
        return safePlaces;
    }

    public String toString(){
        return personLocationToString() + naturalDisastersToString() + safePlacesToString();
    }

    public String naturalDisastersToString(){
        if (naturalDisasters.isEmpty())
            return "";
        String result = Language.getString("natural_disasters_locations") + " :\n";
        for(NaturalDisaster naturalDisaster : naturalDisasters){
            result += "\t - " + naturalDisaster.toString() + "\n";
        }
        return result;
    }

    public String safePlacesToString(){
        if (safePlaces.isEmpty())
            return "";
        String result = Language.getString("safe_places_locations") + " :\n";
        for(SafePlace safePlace : safePlaces){
            result += "\t - " +safePlace.toString() + "\n";
        }
        return result;
    }

    public String personLocationToString(){
        return Language.getString("your_position") + personLocation.toString() + "\n";
    }
}
