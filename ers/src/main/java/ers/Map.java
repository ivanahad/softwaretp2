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
}
